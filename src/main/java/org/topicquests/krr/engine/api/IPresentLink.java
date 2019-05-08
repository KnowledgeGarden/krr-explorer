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
 * @see https://wiki.opencog.org/w/PresentLink
 * Note: while the prose says not to use ISetLink, the script still uses it
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/atom_types/atom_types.script
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/core/PresentLink.h
 * The PresentLink specifies a set that contains no duplicated elements.
 * That is, all elements of the PresentLik are pair-wise distinct.
 * The constructor removes duplicates.
 *
 * For example,
 *
 *     PresentLink
 *         SomeAtom
 *         SomeAtom
 *         OtherAtom
 *
 * is exactly the same as
 *
 *     PresentLink
 *         SomeAtom
 *         OtherAtom
 *
 * and the copies of the duplicated `SomeAtom` is removed during atom
 * contruction.
 *
 * Conceptually, the ctor for PresentLink applies a rule of inference,
 * called the "Rule of contraction (or idempotency of entailment)"
 * https://en.wikipedia.org/wiki/Rule_of_inference
 * https://en.wikipedia.org/wiki/Idempotency_of_entailment
 * .h says this extends IUnorderedLink
 */
public interface IPresentLink extends IUnorderedLink /*IMemberLink, ISetLink ICrispOutputLink*/ {

}
