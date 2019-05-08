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
 * @see https://wiki.opencog.org/w/TypedAtomLink
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/atom_types/atom_types.script
 * A type binder for non-variable atoms. It binds a type to an atom
 * at a "global" level.  Always arity-2, the first position cannot be
 * any atom except for a VariableNode, the second must be a type.
 *  A given atom can only ever have just one type, thus, this is unique.
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/core/TypedAtomLink.h
 * The TypedAtomLink is used to associate a type description to an
 * atom; typically to a GroundedSchemaNode, or GroundedPredicateNode,
 * but also to FunctionLinks or other atoms that might need to be
 * strictly typed.  The type description is (globally) unique, in that
 * there can only be one type definition for an atom.  Polymorphism,
 * if needed, can be accomplished with TypeChoiceLink.  Any attempt
 * to provide a different specification for an atom will throw an
 * error.  That is, only ONE TypedAtomLink can exist, at one time,
 * for a given atom.
 *
 * Note that the mechanics of this link are nearly identical to that
 * of DefineLink.  However, the semantics is very different: the
 * DefineLink is used to give names to structures.  The TypedAtomLink
 */
public interface ITypedAtomLink extends IUniqueLink {

}
