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
 * @see https://wiki.opencog.org/w/VariableList
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/core/VariableList.h
 * The VariableList class records it's outgoing set in various ways
 * that make it easier and faster to work with in C++.  It implements
 * a substitute method that will replace all variables in a tree by
 * the corresponding atoms that it is given. See the .cc file for
 * more info.
 *
 * The constructors make sure that the contents of the variable list
 * are syntactically correct; i.e that it actually contains variables.
 * Otherwise, it throws an error on bad syntax.  Thus, bad
 * VariableLists cannot be inserted into the atomspace.
 * .h says it extends ILink
 */
public interface IVariableListLink extends ILink /*IListLink*/ {

}
