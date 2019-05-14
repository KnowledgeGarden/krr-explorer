/**
 * Copyright 2019, TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.krr.database;

import java.io.Reader;
import java.io.Writer;
import java.util.*;

import org.topicquests.krr.Environment;
import org.topicquests.krr.engine.api.IJSONAtomSpace;
import org.topicquests.krr.engine.api.IJSONValueStore;
import org.topicquests.krr.engine.api.ILink;
import org.topicquests.krr.engine.api.INode;

import net.minidev.json.JSONArray;
import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;

/**
 * @author jackpark
 * <p>Implemented with {@link JSONArray} so that it can be saved and restored</p>
 */
public class SimpleInMemoryAtomSpace implements IJSONAtomSpace {
	private Environment environment;
	private IJSONValueStore valueDatabase;
	private JSONObject nodeMap;
	private JSONObject linkMap;
	
	/**
	 * 
	 */
	public SimpleInMemoryAtomSpace(Environment env, IJSONValueStore vdb) {
		environment = env;
		valueDatabase = vdb;
		nodeMap = new JSONObject();
		linkMap = new JSONObject();
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IAtomSpace#listNodes()
	 */
	@Override
	public Iterator<Object> listNodes() {
		return nodeMap.values().iterator();
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IAtomSpace#listLinks()
	 */
	@Override
	public Iterator<Object> listLinks() {
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
		INode result = (INode)nodeMap.get(nodeId);
		result.setAtomSpace(this);
		return result;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IAtomSpace#removeNode(java.lang.String)
	 */
	@Override
	public boolean removeNode(String nodeId) {
		Object n = nodeMap.get(nodeId);
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
		ILink result = (ILink)linkMap.get(linkId);
		result.setAtomSpace(this);
		return result;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IAtomSpace#removeLink(java.lang.String)
	 */
	@Override
	public boolean removeLink(String linkId) {
		Object l = linkMap.get(linkId);
		if (l == null)
			return false;
		linkMap.remove(linkId);
		return true;
	}

	@Override
	public void saveNodeDatabase(Writer writer) throws Exception {
		nodeMap.writeJSONString(writer);
	}

	@Override
	public void restoreNodeDatabase(Reader reader) throws Exception {
		JSONParser p = new JSONParser(JSONParser.MODE_JSON_SIMPLE);
		nodeMap = (JSONObject)p.parse(reader);	
	}

	@Override
	public void saveLinkDatabase(Writer writer) throws Exception {
		linkMap.writeJSONString(writer);
	}

	@Override
	public void restoreLinkDatabase(Reader reader) throws Exception {
		JSONParser p = new JSONParser(JSONParser.MODE_JSON_SIMPLE);
		linkMap = (JSONObject)p.parse(reader);	
	}



}
