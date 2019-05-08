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
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/pattern/PatternLink.h
 * The PatternLink specifies an (optional) list of variables, and a
 * pattern (containing those variables) that is to be grounded
 * (satisfied).  If no list of variables is explicltly specified,
 * then the pattern is searched for all (free) variables, and these
 * then become implicitly bound.  When processed by the pattern
 * matcher, these are the variables that get grounded.
 *
 * The body of the PatternLink is assumed to collection of clauses
 * to be satsified. Thus, the body is typically an AndLink, ChoiceLink
 * or a SequentialAndLink, depending on how they are to be satsified.
 *
 * The PatternLink is used as a base class for GetLink, BindLink
 * and SatisfactionLink. It provides all the methods and tools needed
 * to unpack the clauses, extract variables, check for connectivity,
 * discover the evaluatable terms, and so on. The pattern matcher
 * needs all of these different parts unpacked into C++ structures
 * so that it can quickly, directly access them during traversal.
 * Thus, this class is designed to pre-process everything that the
 * pattern matcher will need to have later on; it also acts as a cache,
 * avoiding repeated unpacking, if the pattern is used more than once.
 *
 * Given the initial list of variables and clauses, the constructors
 * extract the optional clauses and the dynamically-evaluatable clauses.
 * This also computes the connectivity diagram of the clauses.
 * Two clauses are considered to be pair-wise connected if they both
 * contain a common shared variable, AND that shared variable does
 * not appear in a "virtual link" (e.g. a GreaterThanLink, or an
 * EvaluationLink with a GroundedPredicateNode in it).  Virtual links
 * cannot be directly grounded by the pattern matcher (because they
 * don't actually "exist" as "real" atoms in the atomspace). Thus,
 * the code here splits up the pattern into multiple connected
 * components; the components themselves are connected only by
 * virtual links.
 */
public interface IPatternLink extends IPrenexLink {

}
