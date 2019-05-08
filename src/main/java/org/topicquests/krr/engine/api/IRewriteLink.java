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
 * @see https://wiki.opencog.org/w/RewriteLink
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/core/RewriteLink.h
 * The RewriteLink extends the ScopeLink class to add several
 * methods to perform alpha-conversion and beta-reduction on the
 * ScopeLink.  Note that the beta-reduction being performed is
 * NOT compatible with classical Lambda Calculus: it mixes together,
 * in one place, both alpha and beta conversions. That's OK -
 * Atomese is not Lambda Calculus; its more natural to do it this
 * way in Atomese.
 *
 * The methods here are used by the backward and forward chainers to
 * edit and create PatternLinks on the fly, thus allowing different
 * kinds of queries to be generated and run as chaining proceeds.
 */
public interface IRewriteLink extends IScopeLink {

}
