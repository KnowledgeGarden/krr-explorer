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
 * Evaluatable link. Any link type which might be evaluated, resulting
 * in a truth-value, should inherit from this type.  This is a
 * mixin-type, it does nothing by itself, but is used to identify
 * link types that are evaluatable - that is, they return truth values
 * when they are evaluated
 */
public interface IEvaluatableLink extends ILink {

}
