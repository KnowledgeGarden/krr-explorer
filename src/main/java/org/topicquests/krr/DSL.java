/**
 * Copyright 2019, TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.krr;

import java.io.*;
import java.util.UUID;

import org.topicquests.krr.engine.NodePojo;
import org.topicquests.krr.engine.api.IJSONAtomSpace;
import org.topicquests.krr.engine.api.INodeTypes;
import org.topicquests.krr.engine.api.IPredicateNode;


/**
 * @author jackpark
 *
 */
public class DSL {
	private Environment environment;
	private IJSONAtomSpace database;
	/**
	 * 
	 */
	public DSL(Environment env) {
		environment = env;
		database = environment.getInMemoryDatabase();
	}
	
	/**
	 * Save both node and link files as JSON strings
	 * @param nodeFile
	 * @param linkFile
	 * @throws Exception
	 */
	public void saveDatabase(File nodeFile, File linkFile) throws Exception {
		Writer out = new PrintWriter(nodeFile, "UTF-8");
		database.saveNodeDatabase(out);
		out.flush();
		out.close();
		out = new PrintWriter(linkFile, "UTF-8");
		database.saveLinkDatabase(out);
		out.flush();
		out.close();
	}
	
	/**
	 * Restore both node and link database objects from JSON strings
	 * @param nodeFile
	 * @param linkFile
	 * @throws Exception
	 */
	public void restoreDatabase(File nodeFile, File linkFile) throws Exception {
		FileInputStream fis = new FileInputStream(nodeFile);
		Reader rdr = new InputStreamReader(fis, "UTF-8");
		database.restoreNodeDatabase(rdr);
		rdr.close();
		fis = new FileInputStream(linkFile);
		rdr = new InputStreamReader(fis, "UTF-8");
		database.restoreLinkDatabase(rdr);
		rdr.close();
	}
	
	//TODO build some objects
	
	/**
	 * <p>Return a new {@link IPredicateNode}</p>
	 * <p>Predicate nodes are identified by their label. For example, if the label
	 * is "cause", then the predicateNode is "cause_" followed by a UUID string</p>
	 * <p>Until we have a reason (API) to specialize a PredicateNodePojo, we build this
	 * as a NodePojo</p>
	 * @param label
	 * @return
	 */
	public IPredicateNode newPredicateNode(String label) {
		IPredicateNode result = (IPredicateNode)new NodePojo();
		result.setType(INodeTypes.PREDICATE_NODE_TYPE);
		result.setLabel(label);
		result.setId(newPredicateId(label));
		database.addNode(result);
		return result;
	}
	
	
	String newPredicateId(String predicateLabel) {
		String result  = predicateLabel;
		result = result.replaceAll(" ", "_");
		result += "_"+newUUID();
		return result;
	}
	
	String newUUID() {
		return UUID.randomUUID().toString();
	}

}
