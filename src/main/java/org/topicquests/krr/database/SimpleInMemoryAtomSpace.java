/**
 * Copyright 2019, TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.krr.database;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;

import org.topicquests.krr.Environment;
import org.topicquests.krr.engine.api.IAtomSpace;
import org.topicquests.krr.engine.api.IJSONAtomSpace;
import org.topicquests.krr.engine.api.ILink;
import org.topicquests.krr.engine.api.INode;

import net.minidev.json.JSONArray;

/**
 * @author jackpark
 * <p>Implemented with {@link JSONArray} so that it can be saved and restored</p>
 */
public class SimpleInMemoryAtomSpace implements IJSONAtomSpace {
	private Environment environment;
	private Map<String, INode> nodeMap;
	private Map<String, ILink> linkMap;
	
	/**
	 * 
	 */
	public SimpleInMemoryAtomSpace(Environment env) {
		environment = env;
		nodeMap = new HashMap<String, INode>();
		linkMap = new HashMap<String, ILink>();
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IAtomSpace#listNodes()
	 */
	@Override
	public Iterator<INode> listNodes() {
		return nodeMap.values().iterator();
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IAtomSpace#listLinks()
	 */
	@Override
	public Iterator<ILink> listLinks() {
		return linkMap.values().iterator();
	}
	
	@Override
	public boolean addNode(INode newNode) {
		if (nodeMap.containsKey(newNode.getId()))
			return false;
		updateNode(newNode);
		return true;
	}

	@Override
	public void updateNode(INode newNode) {
		nodeMap.put(newNode.getId(), newNode);
	}


	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IAtomSpace#getNode(java.lang.String)
	 */
	@Override
	public INode getNode(String nodeId) {
		return nodeMap.get(nodeId);
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IAtomSpace#removeNode(java.lang.String)
	 */
	@Override
	public boolean removeNode(String nodeId) {
		INode n = nodeMap.get(nodeId);
		if (n == null)
			return false;
		nodeMap.remove(nodeId);
		return true;
	}


	@Override
	public boolean addLink(ILink newLink) {
		if (linkMap.containsKey(newLink.getId()))
			return false;
		updateLink(newLink);
		return true;
	}

	@Override
	public void updateLink(ILink newLink) {
		linkMap.put(newLink.getId(), newLink);
	}


	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IAtomSpace#getLink(java.lang.String)
	 */
	@Override
	public ILink getLink(String linkId) {
		return linkMap.get(linkId);
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IAtomSpace#removeLink(java.lang.String)
	 */
	@Override
	public boolean removeLink(String linkId) {
		ILink l = linkMap.get(linkId);
		if (l == null)
			return false;
		linkMap.remove(linkId);
		return true;
	}

	@Override
	public void saveDatabase(OutputStream outStream) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void restoreDatabase(InputStream inStream) throws Exception {
		// TODO Auto-generated method stub
		
	}



}
