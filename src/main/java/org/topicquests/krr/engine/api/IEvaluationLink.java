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
 * @see https://wiki.opencog.org/w/EvaluationLink
 * <p>Some relation to IListLink</p>
 * @see https://wiki.opencog.org/w/ListLink
 * <p>The EvaluationLink provides a way for specifying the truth value of a predicate on a set of arguments</p>
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/execution/EvaluationLink.h
 */
public interface IEvaluationLink extends IFreeLink, IEvaluatableLink {

}
