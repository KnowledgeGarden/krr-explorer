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
 * @see https://wiki.opencog.org/w/TruthValue
 * @see https://wiki.opencog.org/w/TruthValue#SimpleTruthValue
 * @see https://wiki.opencog.org/w/TruthValue#CountTruthValue
 * @see https://wiki.opencog.org/w/TruthValue#IndefiniteTruthValue
 * @see https://wiki.opencog.org/w/TruthValue#FuzzyTruthValue
 * @see https://wiki.opencog.org/w/TruthValue#ProbabilisticTruthValue
 * @see https://wiki.opencog.org/w/TruthValue#EvidenceCountTruthValue
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/truthvalue/TruthValue.h
 * .h says this extends FloatValue
 */
public interface ITruthValue extends IFloatValue {

}
