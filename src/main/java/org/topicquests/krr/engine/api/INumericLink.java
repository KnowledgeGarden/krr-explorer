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
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/atom_types/atom_types.script
 * Numeric-input link.  This link type forces type-checking on it's
 * "inputs" (it's outgoing set): they must be NumberNodes, or things
 * that can evaluate to NumberNodes: viz NumericOutputLinks, or
 * numeric values (derived from FloatValue)
 */
public interface INumericLink extends ILink {

}
