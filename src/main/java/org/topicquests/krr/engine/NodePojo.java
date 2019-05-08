/**
 * Copyright 2019, TopicQuests Foundation
 * 
 * Adapted from and references work (c) Linas Vepstas
 * 
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.krr.engine;

import java.util.Map;

import org.topicquests.krr.engine.api.IAtom;
import org.topicquests.krr.engine.api.INode;

/**
 * @author jackpark
 *
 */
public class NodePojo extends AtomPojo implements INode {

	/**
	 * 
	 */
	public NodePojo() {
		super();
	}

	/**
	 * @param map
	 */
	public NodePojo(Map<String, ?> map) {
		super(map);
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.INode#isNode()
	 */
	@Override
	public boolean isNode() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.INode#isLink()
	 */
	@Override
	public boolean isLink() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.INode#equals(org.topicquests.krr.engine.api.IAtom)
	 */
	@Override
	public boolean equals(IAtom other) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.INode#lessThan(org.topicquests.krr.engine.api.IAtom)
	 */
	@Override
	public boolean lessThan(IAtom other) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IAtom#computeContentHash()
	 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/base/Node.cc
	 */
	@Override
	public long computeContentHash() {
		long hsh = (long)getLabel().hashCode();
		// 1<<43 - 369 is a prime number.
		hsh += (hsh<<5) + ((1L<<43)-369) * getType();
		// Nodes will never have the MSB set.
		long mask = 1L << (63); // assumes 64-bit longs
		hsh &= mask;
		//TODO We need to know if we went too far
		return hsh;
	}

}
