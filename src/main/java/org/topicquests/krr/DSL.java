/**
 * Copyright 2019, TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.krr;

import java.util.UUID;


/**
 * @author jackpark
 *
 */
public class DSL {
	private Environment environment;
	/**
	 * 
	 */
	public DSL(Environment env) {
		environment = env;
	}
	
	//TODO build some objects
	
	String newId() {
		return UUID.randomUUID().toString();
	}

}
