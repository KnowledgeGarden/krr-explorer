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
 * @see https://wiki.opencog.org/w/TypedVariableLink
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/atom_types/atom_types.script
 * A type binder: it binds a type to a VariableNode. Always arity-2,
 * the first position must be a VariableNode, the second must be a type.
 * Note that this is always scoped, i.e. used in lambdas and places
 * where variables are not free. Thus, unlike TypedAtomLink, this is
 * never globally unique.
 * It inherits from Evaluatable, because it typically obtains a value
 * of "true", if the indicated variable is of the given type, else
 * it evaluates to "false".  The predicate specifying the concrete
 * test is the signature (SignatureLink, etc) that is t
 */
public interface ITypedVariableLink extends IOrderedLink {

}
