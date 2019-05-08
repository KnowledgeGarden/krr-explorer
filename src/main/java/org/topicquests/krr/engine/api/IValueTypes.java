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
 * @see https://wiki.opencog.org/w/FloatValue
 * @see https://wiki.opencog.org/w/LinkValue
 * @see https://wiki.opencog.org/w/StringValue
 * @see https://wiki.opencog.org/w/TruthValue
 */
public interface IValueTypes {
	public static final int
		COUNT_TRUTH_VALUE_TYPE			= 500,
		EVIDENCE_TRUTH_COUNT_VALUE_TYPE	= 501,
		FLOAT_VALUE_TYPE				= 502,
		FUZZY_TRUTH_VALUE_TYPE			= 503,
		INDEFINITE_TRUTH_VALUE_TYPE		= 504,
		LINK_VALUE_TYPE					= 505,
		PROBABILISTIC_TRUTH_VALUE_TYPE	= 506,
		SIMPLE_TRUTH_VALUE_TYPE			= 507,
		STREAM_VALUE_TYPE				= 508,
		STRING_VALUE_TYPE				= 509,
		TRUTH_VALUE_TYPE				= 510; // probably not used
		

}
