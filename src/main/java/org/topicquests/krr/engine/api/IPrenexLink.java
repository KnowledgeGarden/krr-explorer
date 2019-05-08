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
 * @see https://wiki.opencog.org/w/PrenexLink
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/core/PrenexLink.h
 * The PrenexLink extends the RewriteLink class in such a way that
 * the only allowed rewrites result in a link in that is in prenex
 * form, that is, with all variable declarations out in front,
 * and never within the body.
 *
 * This is used primarily to ensure that PatternLinks remain in
 * prenex form, even when being rewritten. PatternLinks must have
 * all available declarations out in front, in order to work.
 */
public interface IPrenexLink extends IRewriteLink {

}
