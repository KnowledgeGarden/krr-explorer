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
 * @see https://wiki.opencog.org/w/LambdaLink_and_ScopeLink
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/core/LambdaLink.h
 * The LambdaLink is supposed to closely model the traditional concept
 * of a lambda from lambda calculus (or functional programming). It
 * is meant to behave just like a combinator, and supports the standard
 * operations of beta-reduction and alpha-conversion (modulo that the
 * atomspace enforces alpha-equivalence).
 *
 * The actual implementation of the alpha and beta reduction sits on
 * the PrenexLink, so this class is effectively a no-op, from the
 * C++ point of view. However...
 *
 * However, we want to have this to minimize confusion in other,
 * distant parts of the code base.  The issue is that there are many
 * other classes derived from PrenexLink, and they are NOT lambdas!
 * The most prominent example are the various PatternLinks; a simpler
 * example is the PutLink, which is a beta-redex and therefore cannot
 * ever be an actual lambda, elthough it derives from PrenexLink
 * to do it's beta-reduction.  And so that's why we have a no-op C++
 * class, here.
 */
public interface ILambdaLink extends IPrenexLink {

}
