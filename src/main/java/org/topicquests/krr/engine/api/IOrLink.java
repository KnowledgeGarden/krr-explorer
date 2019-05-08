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
 * @see https://wiki.opencog.org/w/OrLink
 * <p>The OrLink is a type of UnorderedLink implying a boolean-logic disjunction of its outgoing set.</p>
 */
public interface IOrLink extends IUnorderedLink, ICrispOutputLink, IBooleanLink {

}
