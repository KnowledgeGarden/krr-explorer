/**
 * Copyright 2019, TopicQuests Foundation
 * 
 * Adapted from and references work (c) Linas Vepstas
 * 
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.krr.engine;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Iterator;

import org.topicquests.krr.engine.api.IAtom;
import org.topicquests.krr.engine.api.ICallback;
import org.topicquests.krr.engine.api.ILink;
import org.topicquests.krr.engine.api.INode;

import net.minidev.json.JSONArray;
import static org.joou.Unsigned.*;
import org.joou.ULong;


/**
 * @author jackpark
 *
 */
public class LinkPojo extends AtomPojo implements ILink {

	/**
	 * 
	 */
	public LinkPojo() {
		super();
	}

	/**
	 * @param map
	 */
	public LinkPojo(Map<String, ?> map) {
		super(map);
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.ILink#addToOutGoingSet(org.topicquests.krr.engine.api.IAtom)
	 */
	@Override
	public boolean addToOutGoingSet(IAtom newObject) {
		boolean result = false;
		List<IAtom> l = listOutGoingSet();
		if (l == null) {
			l = new ArrayList<IAtom>();
		}
		if (! l.contains(newObject)) {
			l.add(newObject);
			setOutGoingSet(l);
			result = true;
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.ILink#listOutGoingSet()
	 */
	@Override
	public List<IAtom> listOutGoingSet() {
		return (List<IAtom>)get(OUTGOING_SET_FIELD);
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.ILink#setOutGoingSet(java.util.List)
	 */
	@Override
	public void setOutGoingSet(List<IAtom> newSet) {
		put(OUTGOING_SET_FIELD, newSet);
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.ILink#addToBiography(org.topicquests.krr.engine.api.INode)
	 */
	@Override
	public boolean addToBiography(INode bioNode) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.ILink#removeFromBiography(org.topicquests.krr.engine.api.INode)
	 */
	@Override
	public boolean removeFromBiography(INode oldNode) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.ILink#listBiography()
	 */
	@Override
	public List<INode> listBiography() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.ILink#setBiography(java.util.List)
	 */
	@Override
	public void setBiography(List<INode> newBio) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.ILink#isNode()
	 */
	@Override
	public boolean isNode() {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.ILink#isLink()
	 */
	@Override
	public boolean isLink() {
		return true;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.ILink#arity()
	 */
	@Override
	public int arity() {
		int result = 0;
		List<IAtom> l = listOutGoingSet();
		if (l != null)
			result = l.size();
		return result;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.ILink#getOutGoingSet()
	 * /
	@Override
	public JSONArray getOutGoingSet() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.ILink#getOutGoingAtom(int)
	 */
	@Override
	public IAtom getOutGoingAtom(int where) {
		List<IAtom> l = listOutGoingSet();
		if (l != null && l.size() >= where)
			return l.get(where);
		return null;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.ILink#forEachOutGoing(org.topicquests.krr.engine.api.ICallback)
	 */
	@Override
	public boolean forEachOutGoing(ICallback callback) {
		List<IAtom> l = listOutGoingSet();
		if (l != null) {
			Iterator<IAtom> itr = l.iterator();
			while (itr.hasNext()) {
				if (callback.process(itr.next()))
					return true;
			}
		}
		return false;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IAtom#computeContentHash()
	 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/base/Link.cc
	 */
	@Override
	public long computeContentHash() {
		List<IAtom> outgoing = listOutGoingSet();
		// Link.cc uses 1UL
		long hsh = ((1L<<44) - 377) * getType();
		IAtom a;
		if (outgoing != null && !outgoing.isEmpty()) {
			Iterator<IAtom> itr = outgoing.iterator();
			while (itr.hasNext()) {
				a = itr.next();
				hsh += a.computeContentHash();
				// Bit-mixing copied from murmur64. Yes, this is needed.
				hsh ^= hsh >> 33;
				hsh *= 0xff51afd7ed558ccdL;
				hsh ^= hsh >> 33;
				hsh *= 0xc4ceb9fe1a85ec53L;
				hsh ^= hsh >> 33;
			}
			//// Links will always have the MSB set.
			// set the high bit on
			long mask = 1L << (63); // assumes 64-bit longs
			hsh |= mask;
			//TODO We need to know if we went too far
		}
		return hsh;
	}

}
