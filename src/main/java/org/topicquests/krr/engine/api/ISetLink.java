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
 * @see https://wiki.opencog.org/w/SetLink
 * SET_LINK <- UNORDERED_LINK,EVALUATABLE_LINK
 * <p>The SetLink is a type of UnorderedLink used to group its arguments into a set</p>
 * <p>Before telling you what a SetLink is, we will tell you: SetLinks are bad! Although they are used in many places in the current implementation, it is only after long hard experience beating us over the head that it's been discovered that SetLinks are bad. Do not use them in new code. Use MemberLinks instead.</p>
 */
//@Deprecated
public interface ISetLink extends IUnorderedLink, IEvaluatableLink {

}
