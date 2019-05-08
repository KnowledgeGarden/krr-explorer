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
 * @see https://wiki.opencog.org/w/DualLink
 * https://github.com/opencog/atomspace/blob/master/opencog/atoms/pattern/DualLink.h
 * .h says it extends IPatternLink but ISatisfyingLink extends IPatternLink
 */
public interface IDualLink extends IPatternLink /*ISatisfyingLink*/ {

}
