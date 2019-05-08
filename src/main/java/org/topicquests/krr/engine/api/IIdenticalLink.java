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
 * @see https://wiki.opencog.org/w/IdenticalLink
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/atom_types/atom_types.script
 * IdenticalLink tests for syntactic equality.  It does NOT execute its
 * arguments; it true only if both sides are the same atom.
 */
public interface IIdenticalLink extends IUnorderedLink, IVirtualLink {

}
