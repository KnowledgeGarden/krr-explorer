/**
 * 
 */
package org.topicquests.krr.engine.api;

/**
 * @author jackpark
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/core/Context.h
 * A context holds the quotation state and the current shadowing
 * variables of a atom (typically coming from ancestor scopes).
 *
 * The context is important to have for both unification, in
 * particular sub-unification, see Unify::subunify, and closure, see
 * Unify::substitution_closure, because quoted or shadowed variables
 * should not be substituted.
 *
 * This notion of context is distinct and unrelated to ContextLink.
 */
public interface IContext {

}
