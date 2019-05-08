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
 * return the current time
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/core/TimeLink.h
 * The TimeLink returns a NumberNode holding the current time.
 * At this time, it takes no argumets.
 */
public interface ITimeLink extends IFunctionLink, INumericOutputLink {

}
