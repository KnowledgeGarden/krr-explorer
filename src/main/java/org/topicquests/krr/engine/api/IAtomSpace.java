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
/**
 * @author jackpark
 * <p>AtomSpace is a collection of {@link INode} and {@link ILink} objects</p>
 * <p>AtomSpace has responsibilities:<br/>
 * <ol>
 * <li>Ensure that each {@link ILink} added is <em>unique</em></li>
 * ...
 * </ol></p>
 * <p>This can be implemented as a simple in-memory map</p>
 * <p>This can be implemented as a persistent system with caching</p>
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atomspace/AtomSpace.h
 * 
 */
public interface IAtomSpace {
	
	/**
	 * 
	 * @return
	 */
	Iterator<INode> listNodes();
	
	/**
	 * 
	 * @return
	 */
	Iterator<ILink> listLinks();
	
	/**
	 * Returns <code>true</code> if <code>newNode</code> is unique
	 * Otherwise object not added
	 * @param newNode
	 * @return
	 */
	boolean addNode(INode newNode);
	
	/**
	 * Will overwrite an existing {@link INode}
	 * @param newNode
	 */
	void updateNode(INode newNode);
	
	/**
	 * 
	 * @param nodeId
	 * @return
	 */
	INode getNode(String nodeId);
	
	/**
	 * Returns <code>true</code> if object is removed
	 * @param nodeId
	 * @return
	 */
	boolean removeNode(String nodeId);
	
	/**
	 * Returns <code>true</code> if <code>newLink</code>is unique.
	 * Otherwise, object not added
	 * @param newLink
	 * @return
	 */
	boolean addLink(ILink newLink);
	
	/**
	 * Will overwrite an existing {@link ILink}
	 * @param newLink
	 */
	void updateLink(ILink newLink);
	
	/**
	 * 
	 * @param linkId
	 * @return
	 */
	ILink getLink(String linkId);
	
	/**
	 * Returns <code>true</code> if object is removed
	 * @param linkId
	 * @return
	 */
	boolean removeLink(String linkId);
	
	/////////////////////////////
	// TODO
	//  Query API
	/////////////////////////////

}
