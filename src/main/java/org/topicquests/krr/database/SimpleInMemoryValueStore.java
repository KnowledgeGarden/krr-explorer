/**
 * Copyright 2019, TopicQuests Foundation
 * 
 * Adapted from and references work (c) Linas Vepstas
 * 
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.krr.database;

import java.io.Reader;
import java.io.Writer;
import java.util.Map;

import org.topicquests.krr.Environment;
import org.topicquests.krr.engine.api.IJSONValueStore;
import org.topicquests.krr.engine.api.IValue;

import net.minidev.json.JSONObject;
import net.minidev.json.parser.JSONParser;

/**
 * @author jackpark
 *
 */
public class SimpleInMemoryValueStore implements IJSONValueStore {
	private Environment environment;
	private JSONObject valueMap;

	/**
	 * 
	 */
	public SimpleInMemoryValueStore(Environment env) {
		environment = env;
		valueMap = new JSONObject();
	}


	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IValueStore#putValue(org.topicquests.krr.engine.api.IValue)
	 */
	@Override
	public void putValue(IValue value) {
		valueMap.put(value.getId(), value);
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IValueStore#getValue(java.lang.String)
	 */
	@Override
	public IValue getValue(String valueId) {
		return (IValue)valueMap.get(valueId);
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IJSONValueStore#saveValueDatabase(java.io.Writer)
	 */
	@Override
	public void saveValueDatabase(Writer writer) throws Exception {
		valueMap.writeJSONString(writer);
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IJSONValueStore#restoreValueDatabase(java.io.Reader)
	 */
	@Override
	public void restoreValueDatabase(Reader reader) throws Exception {
		JSONParser p = new JSONParser(JSONParser.MODE_JSON_SIMPLE);
		valueMap = (JSONObject)p.parse(reader);	
	}

}
