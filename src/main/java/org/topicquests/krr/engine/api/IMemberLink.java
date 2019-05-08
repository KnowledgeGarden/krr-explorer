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
 * @see https://wiki.opencog.org/w/MemberLink
 * <p>The MemberLink is a type of Link used to indicate set membership. MemberLinks should always have arity two:</p>
 * <p>SomeAtom "the element"
 *   OtherAtom "the set which the element belongs to"<p>
 * <p>The TruthValue associated with a MemberLink is meant to indicate fuzzy set membership. Thus,</p>
 * <p>
 * MemberLink <0.1>
 *  ConceptNode "dinner plate"
 *   ConceptNode "things that hold water"<p>
 * <p>
 * <p>suggests that while dinner plates could hold water, they are not very good at it (in the context of ordinary dining).</p>
 */
public interface IMemberLink extends IOrderedLink, IEvaluatableLink {

}
