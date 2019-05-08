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
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/atom_types/atom_types.script
 *  A VirtualLink is equivalent to an EvaluationLink, with a
 * GroundedPredicateNode in it, except that the GPN is "built in".
 * So, for example, GreaterThanLink is equivalent to an EvaluationLink
 * with a GroundedPredicateNode "c++:greater_than". The built-in
 * evaluation links have better performance, since they don't need
 * to make a call to external scheme or python code to get evaluated.
 * The VirtualLink designation is needed by the pattern matcher,
 * in order to be able to find and treat these terms correctly.
 * VirtualLinks only need to be used for those GPN's that take 2 or
 * more arguments. If they take only one, then there is no reason
 * for them to be declared as virtual (at least, as far as the pattern
 * matcher is concerned, which, right now, is the only user of this
 * link type.)
 */
public interface IVirtualLink extends IEvaluationLink {

}
