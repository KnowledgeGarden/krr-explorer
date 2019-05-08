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
 * @see https://wiki.opencog.org/w/SleepLink
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/atom_types/atom_types.script
 * Sleep link pauses execution for the indicated number of seconds
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/core/SleepLink.h
 * The SleepLink pauses execution for the given number of seconds.
 * If interrupted, it returns the number of seconds remaining.
 * At this time, there is no way to interrupt :-)
 * .h says this only extends IFunctionLink
 */
public interface ISleepLink extends IFunctionLink/*, INumericOutputLink*/ {

}
