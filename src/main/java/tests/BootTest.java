/**
 * Copyright 2019, TopicQuests Foundation
 * 
 * 
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package tests;

import org.topicquests.krr.Environment;

/**
 * @author jackpark
 *
 */
public class BootTest {
	private Environment environment;
	/**
	 * 
	 */
	public BootTest() {
		environment = new Environment();
		System.out.println("A "+environment.getProperties());
		environment.shutDown();
		System.exit(0);
	}

}
