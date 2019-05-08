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
 * @see https://wiki.opencog.org/w/Value
 * @see https://wiki.opencog.org/w/TruthValue
 * @see https://wiki.opencog.org/w/AttentionValue
 * @see https://wiki.opencog.org/w/Type_hierarchy
 * <p>is superclass for {@link IAtom}</p>
 * <p>There is no IntValue or BooleanValue; these don't seem to be useful or important 
 * for any current uses. These could be added, but if you feel you need them, you should re-examine your design and your thinking. Keep in mind that Atomese is meant to be a system for knowledge representation, and for data-structure introspection and re-writing. It is NOT meant to be a traditional "programming language": it is designed to be easy-to-understand by AI algorithms, not by humans. 
 * That is why we don't have IntValue or BooleanValue's so far.<p>
 * Note: BooleanValue has been added
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/value/Value.h
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/base/Link.cc
 */
public interface IValue {
	public static final String
		TYPE_FIELD			= "typeField",
		// likely a JSONObject to satisfy the API
		VALUE_FIELD			= "valueField";

	/**
	 * Objects have type
	 * @param type
	 */
	void setType(int type);
	
	/**
	 * Returns -1 if type not set
	 * @return
	 */
	int getType();
	
	/**
	 * All atoms can return a value
	 * @return
	 */
	IValue getValue();
	
	void setValue(IValue value);
	
	/**
	 * Satisfied because all objects extend JSONObject
	 * @return
	 */
	String toJSONString();


}
