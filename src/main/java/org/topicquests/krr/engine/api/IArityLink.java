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
 * return arity of the wrapped link
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/core/ArityLink.h
 * The ArityLink returns a NumberNode holding the arity of the wrapped
 * atom; its zero for Nodes and empty Links.
 * .h shows it extending only FunctionLink
 */
public interface IArityLink extends IFunctionLink /*, INumericOutputLink*/ {

}
