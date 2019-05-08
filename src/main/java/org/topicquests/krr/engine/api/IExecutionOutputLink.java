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
 * @see https://wiki.opencog.org/w/ExecutionOutputLink
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/atom_types/atom_types.script
 * The ExecutionOutputLink is a specific kind of function: it must have
 * a GroundedSchemeNode as its first argument.  The other kinds of
 * FunctionLinks do not have this restriction: indeed, the actual
 * function they perform is implicit in the link type.
 */
public interface IExecutionOutputLink extends IFunctionLink {

}
