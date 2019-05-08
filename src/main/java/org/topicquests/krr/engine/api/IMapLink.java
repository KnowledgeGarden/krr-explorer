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
 * @see https://wiki.opencog.org/w/MapLink
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/atom_types/atom_types.script
 * MapLink could be named UnPutLink ... it undoes a beta-reduction,
 * by extracting values for a given set of variables.  In many ways,
 * it resembles a GetLink, except that it searches only its argument
 * list, instead of the entire AtomSpace.  It is more-or-less analogous
 * to the standard functional-programming concept of "map"
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/execution/MapLink.h
 * The MapLink is a FunctionLink that undoes beta-reduction; it
 * can be used to "extract" the values that occupy certain variable
 * locations in a formula.  It is the "opposite" of PutLink, in that
 * PutLink substitutes values for variables; whereas this link holds
 * a template pattern, which can be compared to an input, and values 
 * are extracted for the variable locations.
 */
public interface IMapLink extends IFunctionLink {

}
