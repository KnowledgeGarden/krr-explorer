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
 * @see https://wiki.opencog.org/w/OrderedLink_and_UnorderedLink
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/core/UnorderedLink.h
 * The UnorderedLink eliminates differences in the order of the
 * outgoing set.  It does so by always sorting the outgoing set into
 * some arbitrary order.
 *
 * For example,
 *
 *     UnorderedLink
 *         SomeAtom
 *         OtherAtom
 *
 * is exactly the same as
 *
 *     UnorderedLink
 *         OtherAtom
 *         SomeAtom
 *
 * The uniformization of ordering is done in the constructor.
 */
public interface IUnorderedLink extends ILink {

}
