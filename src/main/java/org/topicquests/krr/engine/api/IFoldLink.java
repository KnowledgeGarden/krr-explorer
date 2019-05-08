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
 * @see https://wiki.opencog.org/w/FoldLink
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/atom_types/atom_types.script
 * basic arithmetic operator
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/reduct/FoldLink.h
 *  The FoldLink implements the generic reduction of lists, by
 * cons'ing together elements of the same type. See
 * http://en.wikipedia.org/wiki/Fold_(higher-order_function)
 * for a general discussion.
 */
public interface IFoldLink extends IFunctionLink {

}
