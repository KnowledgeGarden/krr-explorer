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
 * @see https://wiki.opencog.org/w/ValueOfLink
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/atom_types/atom_types.script
 * Return the indicated value on the indicated atom.
 * XXX FIXME - Not all ValueOfLinks are actually numeric; but there
 * is no way to tell, in advance. They may or may not be... when they
 * aren't, the evaluator will throw a silent exception, which is
 * caught, so its mostly harmless if the returned value isn't actually
 * numeric.  We need this try..catch because sometimes there just isn't
 * a value -- i.e. ValueOfLink can return a null pointer.
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/core/ValueOfLink.h
 * The ValueOfLink returns the value on the indicated atom (first
 * argument) at the indicated key (second argument).
 * .h says it only extends IFunctionLink
 */
public interface IValueOfLink extends IFunctionLink/*, INumericOutputLink*/ {

}
