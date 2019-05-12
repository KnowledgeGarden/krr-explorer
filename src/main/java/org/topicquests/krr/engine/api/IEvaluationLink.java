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
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/execution/EvaluationLink.cc
 * The "canonical" EvaluationLink structure is:
 *    EvaluationLink
 *        PredicateNode "foo"
 *        ListLink
 *           ...
 *
 * However, patterns can have variables for either the
 * ListLink, or the PredicateNode, or both.
 *
 * ... except reality is worse: many examples include
 * badly-formed EvaluationLinks, on-purpose.  So, before
 * we can do any sort of strict checking here, we would
 * need fix all those wiki pages, examples, etc.
 * As of this writing (March 2017), there are seven unit
 * tests that create EvaluationLinks whose size() is not 2:
 *    PutLinkUTest GetLinkUTest BuggySelfGroundUTest
 *    StackMoreUTest ConstantClausesUTest PersistUTest
 *    MultiPersistUTest
 */
public interface IEvaluationLink extends IFreeLink, IEvaluatableLink {

}
