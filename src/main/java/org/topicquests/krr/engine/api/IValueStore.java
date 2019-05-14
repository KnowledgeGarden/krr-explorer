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
 * Local persistence for {@link IValue} objects
 */
public interface IValueStore {
	
	/**
	 * Overwrites
	 * @param value
	 */
	void putValue(IValue value);
	
	IValue getValue(String valueId);
}
