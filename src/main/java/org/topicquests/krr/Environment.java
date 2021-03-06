/**
 * Copyright 2019, TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.krr;

import org.topicquests.krr.database.SimpleInMemoryAtomSpace;
import org.topicquests.krr.database.SimpleInMemoryValueStore;
import org.topicquests.krr.engine.api.IJSONAtomSpace;
import org.topicquests.krr.engine.api.IJSONValueStore;
import org.topicquests.support.RootEnvironment;

/**
 * @author jackpark
 *
 */
public class Environment extends RootEnvironment {
	private DSL dsl;
	private IJSONAtomSpace database;
	private IJSONValueStore valueDatabase;
	/**
	 *
	 */
	public Environment() {
		super("config-props.xml", "logger.properties");
		valueDatabase = new SimpleInMemoryValueStore(this);
		database = new SimpleInMemoryAtomSpace(this, valueDatabase);
		dsl = new DSL(this);
	}
	
	public IJSONAtomSpace getInMemoryDatabase() {
		return database;
	}
	
	public IJSONValueStore getInMemoryValueStore() {
		return valueDatabase;
	}
	
	public DSL getDSL() {
		return dsl;
	}
	public void shutDown() {
		System.out.println("Environment shutting down");
	}

}
