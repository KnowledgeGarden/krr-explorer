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
 * @see https://wiki.opencog.org/w/FreeLink
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/core/FreeLink.h
 */
/**
 * The FreeLink records all of the free variables that occur within
 * (underneath) it, in traversal order. Those variables are placed in
 * sequential order in _varseq. An index is placed in _index. That is,
 * given a variable, its ordinal number is placed in _index.
 */
public interface IFreeLink extends ILink {
	//IOrderedLink /** note, FreeLink.h points to ILink */ {
	//IFreeVariables _vars;
	// FreeVariables is a struct in:
	// https://github.com/opencog/atomspace/blob/master/opencog/atoms/core/Variables.h
	// we now have IFreeVariables
	void init();
	
	void unorder();
}
