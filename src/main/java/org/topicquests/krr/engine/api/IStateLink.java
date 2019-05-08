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
 * @see https://wiki.opencog.org/w/StateLink
 * @see https://wiki.opencog.org/w/UniqueLink
 * @see https://wiki.opencog.org/w/FreeLink
 * https://github.com/opencog/atomspace/blob/master/opencog/atoms/atom_types/atom_types.script
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/core/StateLink.h
 * The StateLink is used to maintain unique state. Given an atom,
 * the atomspace can only contain one instance of a StateLink with
 * that atom in the first position.  Adding another StateLink with
 * the same first-atom causes the previous StateLink to be removed!
 *
 * This class is intended for holding single-valued state in a safe,
 * automated fashion. Of course, a user can also store unique state
 * simply by being careful to delete the old state after adding the
 * new state; but this can be error prone.  Thus link type provides
 * convenience and safety.
 */
public interface IStateLink extends IUniqueLink {

}
