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
 * @see https://wiki.opencog.org/w/PredicateFormulaLink
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/atom_types/atom_types.script
 * given something that evaluates to a
 * FloatValue, return a TruthValue.  Kind-of-like
 * GROUNDED_PREDICATE_NODE, but holding the formula in the AtomSpace.
 * This is not really needed, but will make the transition process
 * smoother.
 */
public interface IPredicateFormulaLink extends IEvaluatableLink {

}
