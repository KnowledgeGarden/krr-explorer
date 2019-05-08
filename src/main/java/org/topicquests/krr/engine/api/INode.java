/**
 * Copyright 2019, TopicQuests Foundation
 * 
 * Adapted from and references work (c) Linas Vepstas
 * 
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.krr.engine.api;

/**
 * @author jackpark
 * <p>INode will be extended by several node types</p>
 * @see {@link INodeTypes}
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/base/Node.h
 * This is a subclass of Atom. It represents the most basic kind of
 * pattern known to the OpenCog system.
 */
public interface INode extends IAtom {
	
	/**
	 * Return <code>true</code>
	 * @return
	 */
	boolean isNode();
	
	/**
	 * Return <code>false</code>
	 * @return
	 */
	boolean isLink();
	
	/**
	 * Return <code>1</code>
	 * @return
	 */
	int size();
	
	/**
     * Perform a content-based compare of another atom to this one.
     * Return true if the content is the same for both atoms.
     * @param Atom to be tested.
     * @return true if content is equal, false otherwise.
     */
	boolean equals(IAtom other);
	
    /**
     * Provides an ordering operator, based on the atom hash.
     * Performs a simple numeric comparison on the hashes of
     * this and the other atom. If the hashes are equal, then
     * it performs a content-based compare.
     *
     * @return true if this atom is less than the given one, false otherwise.
     */
	boolean lessThan(IAtom other);
	
	/**
	 * A recursive call on internal components
	 * @return
	 */
	long computeContentHash();

}
