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
 * @see https://wiki.opencog.org/w/TruthValue#ProbabilisticTruthValue
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/truthvalue/ProbabilisticTruthValue.h
 * a TruthValue that stores a mean, a confidence and the number of observations
 */
public interface IProbabilisticTruthValue extends ITruthValue {

}
