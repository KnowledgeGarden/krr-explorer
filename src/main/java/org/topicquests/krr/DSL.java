/**
 * Copyright 2019, TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.krr;

import java.io.*;
import java.util.UUID;

import org.topicquests.krr.engine.api.IJSONAtomSpace;


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
	
	String newId() {
		return UUID.randomUUID().toString();
	}

}
