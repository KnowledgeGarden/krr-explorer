/**
 * Copyright 2019, TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.krr.engine;

import java.util.Map;

import org.topicquests.krr.engine.api.IAtom;
import org.topicquests.krr.engine.api.IValue;

import net.minidev.json.JSONObject;

/**
 * @author jackpark
 *
 */
public class ValuePojo extends JSONObject implements IValue {

	/**
	 * 
	 */
	public ValuePojo() {
	}

	/**
	 * @param map
	 */
	public ValuePojo(Map<String, ?> map) {
		super(map);
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IAtom#setId(java.lang.String)
	 */
	@Override
	public void setId(String id) {
		put(IValue.ID_FIELD, id);
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IAtom#getId()
	 */
	@Override
	public String getId() {
		return getAsString(IValue.ID_FIELD);
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IValue#setType(java.lang.String)
	 */
	@Override
	public void setType(int type) {
		put(IValue.TYPE_FIELD, Integer.toString(type));
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IValue#getType()
	 */
	@Override
	public int getType() {
		String s = getAsString(IValue.TYPE_FIELD);
		if (s == null)
			return -1;
		return Integer.parseInt(s);
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IValue#getValue()
	 */
	@Override
	public IValue getValue() {
		IValue result = null;
		JSONObject jo = (JSONObject)get(IAtom.VALUE_FIELD);
		if (jo != null) {
			result = new ValuePojo(jo);
		}
		return result;
	}

	/* (non-Javadoc)
	 * @see org.topicquests.krr.engine.api.IValue#setValue(org.topicquests.krr.engine.api.IValue)
	 */
	@Override
	public void setValue(IValue value) {
		put(IAtom.VALUE_FIELD, (JSONObject)value);
	}

}
