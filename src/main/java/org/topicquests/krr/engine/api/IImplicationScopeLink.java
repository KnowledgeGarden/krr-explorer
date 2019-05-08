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
 * @see https://wiki.opencog.org/w/ImplicationScopeLink
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/atom_types/atom_types.script
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/core/ImplicationScopeLink.h
 * ImplicationScopeLink
 *    <variables>
 *    <P-body>
 *    <Q-body>
 *
 * Is a syntactic sugar form for
 *
 * ImplicationLink
 *    LambdaLink
 *       <variables>
 *       <P-body>
 *    LambdaLink
 *       <variables>
 *       <Q-body>
 * .h says it only extends IScopeLink
 */
public interface IImplicationScopeLink extends IScopeLink/*, IEvaluatableLink*/ {

}
