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
 * @see https://wiki.opencog.org/w/UniqueLink
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/core/UniqueLink.h
 * The UniqueLink is used to force uniqueness of a link from a given
 * atom, appearing as the first member of the outgoing set, to the
 * rest of the outgoing set.  Any attempt to make another UniqueLink
 * with the same atom in the first outgoing slot will throw an error.
 * Thus, only ONE UniqueLink with a given first-atom can exist at a
 * time.
 *
 * This class is intended to be the base class for DefineLink, which
 * is used to name things, and StateLink, which is used to maintain
 * current state. It is also used by TypedAtomLink to ensure that
 * an atom, if it is typed, has a single, unique type defintion.
 */
public interface IUniqueLink extends IFreeLink {

}
