/**
 * Copyright 2019, TopicQuests Foundation
 * 
 * 
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package tests;

import org.topicquests.krr.DSL;
import org.topicquests.krr.Environment;

/**
 * @author jackpark
 *
 */
public class TestRoot {
	protected Environment environment;
	protected DSL dsl;

	/**
	 * 
	 */
	public TestRoot() {
		environment = new Environment();
		dsl = environment.getDSL();
	}

}
