/**
 * Copyright 2019, TopicQuests Foundation
 * 
 * Adapted from and references work (c) Linas Vepstas
 * 
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.krr.engine.api;

import java.util.List;

import net.minidev.json.JSONArray;
/**
 * 
 * @author jackpark
 * <p>A link is a collection of {@link INode} and {@link ILink} objects
 * 	which is defined as <em>outGoingSet</em>
 * </p>
 * <p>A link is identified by its Type and its outGoingSet</p>
 * <p>AtomSpace ensures that Links are unique</p>
 * <p>A link also contains a collection of {@link INode} objects
 * 	which is defined as <em>biography</em></p>
 * <p>ILink will be extended by a variety of link types</p>
 * @see {@link ILinkTypes}
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/base/Link.h
 * Atoms in OpenCog are connected to each other by links. Each link
 * embodies a basic inter-atom relationship. Links do not necessarily
 * describe a binary relationship between two atoms. Links may describe
 * relationships between more than two atoms at once. Finally, links
 * describe relationships not only between nodes, but also higher-order
 * relationships between links, and between nodes and links.
 */
public interface ILink extends IAtom {
	public static final String
		OUTGOING_SET_FIELD	= "outGoingSetField",
		BIOGRAPHY_FIELD		= "biographyField";
	
	
	/**
	 * <p>Returns <code>true</code> if object is unique and added</p>
	 * <p><code>newObject can be one of {@link INode} or {@link ILink}
	 * <p>When an {@link IAtom} is added to a particular {@Ilink}, that link
	 * is added to the atom's incommingSet</p>
	 * @param newObject
	 * @return
	 */
	boolean addToOutGoingSet(IAtom newObject);
	
	List<IAtom> listOutGoingSet();
	
	void setOutGoingSet(List<IAtom> newSet);
	
	////////////////////
	//TODO
	// Move these to IValue
	boolean addToBiography(INode bioNode);
	
	boolean removeFromBiography(INode oldNode);
	
	List<INode> listBiography();
	
	void setBiography(List<INode> newBio);
	//
	////////////////////
	/**
	 * Return <code>false</code>
	 * @return
	 */
	boolean isNode();
	
	/**
	 * Return <code>true</code>
	 * @return
	 */
	boolean isLink();
	
	//TODO unclear what this does
	int size();
	
	/**
	 * Returns size of outgoingSet
	 * @return
	 */
	int arity();

	/**
	 * Return the outgoingSet
	 * @return
	 */
	//JSONArray getOutGoingSet();
	
	/**
	 * Return a specific member of outgoingSet
	 * @param where
	 * @return
	 */
	IAtom getOutGoingAtom(int where);
	
	////////////////////////
	//TODO an attempt to use java lambda expressions
	// In the .h file, the callback is arbitrary
	// The java lambda expression asks for the function itself to be
	// specified when called
	// This may not work
	// ICallback is a generic interface
	//   we may have to make specific implementations
	//   but we still do not know how AtomSpace used it
	// MapTest2 shows it's possible to pass in an implementation of
	// ICallback and get the results.
	// What we need to know is what, precisely, AtomSpace will do with this
	//  The method signature is named foreach_outgoing
	//  So it remains to rummage through their source code and find it
	//  Google only sees it in Link.h
	////////////////////////
	
	/**
	 * Invoke the callback on each atom in the outgoing set of atoms
     * until till one of them returns true, in which case,
     * the loop stops and returns true. Otherwise the callback is
     * called on all outgoings and false is returned.
	 * @param callback
	 * @return
	 */
	boolean forEachOutGoing(ICallback callback);
	
	


}
