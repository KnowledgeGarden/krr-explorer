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
 * @see https://wiki.opencog.org/w/RandomChoiceLink
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/atom_types/atom_types.script
 * Return (with uniform distribution) one of the links it wraps.
 * XXX Broken polymorphism: the choice link can sometimes generate
 * numbers, and sometimes not. It depends ... so static type checking
 * is fairly broken, here, as currently implemented.
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/core/RandomChoice.h
 * The RandomChoiceLink randomly selects and returns one of its
 * N atoms, with a uniform probability distribution.
 *
 * For example,
 *
 *     RandomChoiceLink
 *         SomeAtom
 *         OtherAtom
 *
 * will return either SomeAtom or OtherAtom, with a 50-50 probability.
 *
 * There are two different extensions that support a non-uniform
 * probability: one taking the name of a vector of numeric weights, and
 * another taking the name of a schema that provides numeric weights.
 *
 * An example of the weighted form is:
 *     
 *     RandomChoiceLink
 *         ListLink
 *             NumberNode 0.4
 *             NumberNode 0.6
 *         ListLink
 *             SomeAtom
 *             OtherAtom
 *
 * This will select SomeAtom 40% of the time, and OtherAtom 60% of the
 * time.
 * .h says this extends FunctionLink
 */
public interface IRandomChoiceLink extends IFunctionLink/*, INumericOutputLink*/ {

}
