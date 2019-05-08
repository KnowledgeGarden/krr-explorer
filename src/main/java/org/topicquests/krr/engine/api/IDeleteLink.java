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
 * @see https://wiki.opencog.org/w/DeleteLink
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/core/DeleteLink.h
 * The DeleteLink is used to delete any atom that does not contain a
 * VariableNode.  That is, if one attempts to insert a DeleteLink into
 * the atomspace, and the DeleteLink does not have any VariableNodes
 * in it, the insertion will fail, and furthermore, the atom(s)
 * that it is holding (in its outgoing set) will be deleted from the
 * atomspace!  In essence, the DeleteLink is a link that can never be
 * grounded!
 */
public interface IDeleteLink extends IFreeLink {

}
