/**
 * Copyright 2019, TopicQuests Foundation
 * 
 * Adapted from and references work (c) Linas Vepstas
 * 
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.krr.engine.api;

import java.util.*;

import static org.joou.Unsigned.*;

/**
 * <p>Title: MicroInferenceEngine4J</p>
 * <p>Description: Tiny boolean logic engine</p>
 * <p>Copyright: Copyright (c) 2011, NexistGroup</p>
 * <p>Company: NexistGroup</p>
 * @author Park
 * @see https://wiki.opencog.org/w/TruthValue
 * @see https://wiki.opencog.org/w/Type_hierarchy
 * <p>We introduce {@link ITruthValue} to satisfy the need</p>
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/base/Handle.h
 * where class Atom is defined
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/base/Atom.cc
 */
public interface IAtom extends IValue {
	public static final String
		ID_FIELD			= "idField",
		LABEL_FIELD			= "labelField",
		INCOMING_SET_FIELD	= "incomingSet",
		FLAG_FIELD			= "flagField",
		TRUTH_VALUE_FIELD	= "truthValueField",
		ATOM_SPACE_FIELD	= "atomSpaceField";
	/**
	 * FLAG_FIELD is for a String value
	 * That String is 2 characters long
	 * e.g.
	 * 00, 01, 11, 10
	 * 1 means that flag is set
	 */
	public static final int
		REMOVE_FLAG = 0,
		CHECKED_FLAG = 1;
		

    /**
     * <p>Optional value, useful for database persistence or tracing
     * inference behaviors</p>
     * @param id String
     */
    void setId(String id);

    /**
     * Can return <code>null</code> if not set
     * @return String
     */
    String getId();
    
    /**
     * Fancy Identifier:
     * <p>If there is an AtomSpace:AtomTable:<br/>
     * "[<this atom hash string>][<atomtable uuid>]"</p>
     * <p>Otherwise<br/>
     * "[<this atom hash string>][-1]"</p>
     * @return
     */
    String getIdToString();
    
    //TODO std::string oc_to_string(const IncomingSet& iset, const std::string& indent)
    
    /**
     * Objects can optionally have labels
     * @param label
     */
	void setLabel(String label);
	
	String getLabel();
	
	
	void setAtomSpace(IAtomSpace space);
	
	// TODO getAtomTable()
	
	////////////////////////////
	// Incoming set stuff
	// FROM https://wiki.opencog.org/w/Link
	//	The incoming set of an entity E is the set of relationships that take E as an argument.
	//
	//! We use a std:vector instead of std::set for IncomingSet, because
	//! virtually all access will be either insert, or iterate, so we get
	//! O(1) performance. Note that sometimes incoming sets can be huge,
	//! millions of atoms.

	/// Start tracking the incoming set for this atom.
	/// An atom can't know what it's incoming set is, until this method
	/// is called.  If this atom is added to any links before this call
	/// is made, those links won't show up in the incoming set.
	///
	/// We don't automatically track incoming sets for two reasons:
	/// 1) std::set takes up 48 bytes
	/// 2) adding and removing uses up cpu cycles.
	/// Thus, if the incoming set isn't needed, then don't bother
	/// tracking it.
	////////////////////////////
	void keepIncomingSet();
	

	////////////////////////////
	/// Stop tracking the incoming set for this atom.
	/// After this call, the incoming set for this atom can no longer
	/// be queried; it is erased.
	////////////////////////////
	void dropIncomingSet();
	
	/**
	 * <p>Add an {@link IAtom} to incoming set</p>
	 * <p>From the definitions, <code>atom</code> is a <em>Relation</em>
	 * which uses this {@link IAtom} as one of its arguments. This means that
	 * <code>atom</code> is an instance of {@link ILink}</p>
	 * @param atom
	 */
	void insertAtom(IAtom atom);
	
	/**
	 * Remove an {@link IAtom} from incoming set
	 * @param atom
	 */
	void removeAtom(IAtom atom);
	
	/**
	 * Swap <code>newAtom</code> for <code>oldAtom</code>
	 * @param oldAtom
	 * @param newAtom
	 * 
	 */
	void swapAtom(IAtom oldAtom, IAtom newAtom);
	
	int getIncomingSetSize();
	
	/**
	 * Does not return <code>null</code>
	 * @return
	 */
	List<IAtom> getIncomingSet();
	
	void setIncomingSet(List<IAtom> is);
	
	/**
	 * Does not return <code>null</code>
	 * @param atomType
	 * @return
	 */
	List<IAtom> getIncomingSetByType(int atomType);
	
	////////////////////////////
	// TruthValues
	// Note: IValue has setValue and getValue
	// Since ITruthValue extends IValue, we can share that method
	////////////////////////////
	
	void setTruthValue(ITruthValue tv);
	
	ITruthValue getTruthValue();
	
	////////////////////////////
	// CONTENT Values
	//  
	// Note: strings, lists, booleans, etc, are all IValues
	// So, this is a Map<String, IValue> platform
	// Note possible confusion with IValue#getValue()
	//	it's getting from a fixed field, not field driven by <code>key</code>
	// CAUTION: must declare internal fields as <em>reserved</em>
	////////////////////////////
	
	/**
	 * Setting values associated with this atom.
     * If the value is a null pointer, then the key is removed.
	 * @param key
	 * @param newValue
	 */
	void setValue(String key, IValue newValue);
	
	IValue getValue(String key);
	
	Set<String> getKeys();
	
	void copyValues(List<IValue> other);
	
	String valuesToString();
	
	//////////////////////////
	// Flags
	//////////////////////////
	
	
	boolean isMarkedForRemoval();
	void unsetRemovalFlag();
	void markForRemoval();
	
	boolean isChecked();
	void unsetChecked();
	void setChecked();
	
	/////////////////////////
	// Hashing on content
	// e.g. type, name (label), and for Links, the outgoingSet of atoms
	// NOTE
	//	This returns a signed long
	//  To make hash comparisons, must convert to ULong
	//  and use its <code>compare</code> function
	/////////////////////////
	/**
	 * A recursive call on internal components
	 * @return
	 */
	long computeContentHash();

	
	/**
	 From handle.h
	 static inline bool operator== (std::nullptr_t, const Handle& rhs) noexcept
    { return rhs == (Atom*) nullptr; }

	static inline bool operator!= (std::nullptr_t, const Handle& rhs) noexcept
	    { return rhs != (Atom*) nullptr; }
	
	bool content_eq(const opencog::Handle& lh,
	                const opencog::Handle& rh) noexcept;
	    SEE OTHER DEFINITIONS THERE
	 */
	

}
/** HASH goes in IValue since it, too computes hash
	Interesting stuff from Atom.h
	
	
    // Byte of bitflags (each bit is a flag).
    // Place this first, so that is shares a word with Type.
    mutable char _flags;

    /// Merkle-tree hash of the atom contents. Generically useful
    /// for indexing and comparison operations.
    mutable ContentHash _content_hash; <<<<< That's how they Hash things
    //TODO find the implementation of that
 */
