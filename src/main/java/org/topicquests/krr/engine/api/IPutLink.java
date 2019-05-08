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
 * @see https://wiki.opencog.org/w/PutLink
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/core/PutLink.h
 * The PutLink implements a beta redex; it is similar to an imperative
 * version of MemberLink, with arguments reversed.
 *
 * A beta redex is a concatentation or composition of a combinator, and
 * a list of arguments.  Typically, the combinator will be a LambdaLink,
 * typically with N declared variables in it. To go with it, the PutLink
 * expects a list of N arguments to be plugged in for these variables.
 * Thus, for example:
 * (Put (Lambda (Variable "x") ...stuff...) (Concept "foo"))
 * when reduced, will plug "foo" into ...stuff...
 *
 * Another supported form for the combinator is any of the
 * FunctionLinks, e.g. the PlusLink, TimesLink, etc. in which case,
 * one can write (Put (Plus) (List (Number 2) (Number 2))) as the beta
 * redex that, when reduced, will return (Number 4). Fancier forms for
 * the combinator are allowed: for example,
 * (Put (Plus (Number 6) (Number 8)) (List (Number 5) (Number 9)))
 *
 * The natural form for a beta redex is in the unreduced
 * form: the arguments are not (yet) substituted for the variables; they
 * are simply sitting there, ready and waiting for that reduction to
 * happen.
 *
 * It defines a reduce() method, which implements the actual beta
 * reduction.  The reduce() method only performs the substitution; it
 * does not attempt to execute or evaluate the resulting expression.
 *
 * The implementation for PutLink is not a "pure" beta-redex, but
 * has extra stuff to make it play nice with GetLink.  That is, we'd
 * like to pipe the output of GetLink directly into PutLink as input,
 * but for one problem: GetLink returns it's stuff wrapped in SetLink's.
 * So, in order to play nice, we automatically unwrap these, beta reduce
 * them, and then wrap the answers back up with a SetLink.
 *
 * Another "enhancement" is that when there are N>1 variables, the
 * arguments must be wrapped in a ListLink, to be consistent with other
 * parts of atomese. However, for N=1, the ListLink is optional.
 */
public interface IPutLink extends IPrenexLink {

}
