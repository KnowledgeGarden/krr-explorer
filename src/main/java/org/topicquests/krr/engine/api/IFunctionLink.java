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
 *  @see https://wiki.opencog.org/w/FunctionLink
 *  @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/atom_types/atom_types.script
 *  Functions that do not bind variables
 *  A FunctionLink is a link that can be executed, with the result of
 * execution being some atom.  FunctionLink does NOT derive from
 * LambdaLink, which may seem counter-intuitive; here's why, so
 * listen up.  All of the explicitly-named functions (e.g. PlusLink)
 * do not need to explicitly name their arguments, and it would even
 * be confusing if they did so.  Instead, the convention is that every
 * element in the outgoing set of the FunctionLink IS an argument of
 * the function; that's all, end-of-story.
 * All variables that appear underneath the FunctionLink are necessarily
 * free variables; they are neither scoped, nor bound.
 * The FunctionLink is meant to be a base type for links that define
 * functions.  It is NOT meant to be used as a base type for
 * user-defined structures; users should use the ILambdaLink for that.
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/core/FunctionLink.h
 */
/**
 * The FunctionLink provides an important method: execute().
 * The execute() method performs delta-reduction on this atom, and
 * returns a Handle resulting from the execution.
 *
 * Here, "delta-reduction" is the name for the idea that certain Links
 * can be replaced by other Atoms that are operationally equivalent
 * but simpler.  For example, the delta-reduction of (Plus 2 2) is 4.
 * Delta-reduction can be understood in several ways. From the viewpoint
 * of term-rewriting, or inference or theorem-proving, a delta-reduction
 * is a (usually infinite) set of inference rules for reducing the
 * intial expression to the final expression. From the viewpoint of
 * proceedural computation, it just means "perform this computation
 * on this input", viz. "execute this function".
 *
 * The FunctionLink is meant to be a base class for any link type
 * that behaves like a function; i.e. can be executed.  Observe that
 * it derives from the FreeLink, and NOT the LambdaLink.  This may seem
 * counter-intuitive, and deserves an explanation, so here it is:
 * All link types inheriting from this class will always, by definition,
 * have their outgoing set be the arguments to that function. Think of
 * PlusLink, for example.  We don't want to insert a lambda with
 * variable declarations in there; that would just be weird and create
 * confusion.  If the arguments to PlusLink happen to include a
 * variable, that variable is necessarily free; thus, this class
 * dervies from FreeLink.
 *
 * Note that this class must NOT be used for user-defined functions;
 * users should use the LambdaLink for that.
 */
/**
 * A Handle is a return object, which could be one of
 * * A value
 * * An Atom
 * * ???
 * IValue is the root object, so perhaps, since IValue has getType, we can return
 * an IValue
 * 
 *
 */
public interface IFunctionLink extends IFreeLink {

	//static void check_type(Type t);
	
	void init();
	
	/**
	 * Always returns <code>true</code>
	 * @return
	 */
	boolean isExecutable();
	
	/**
	 * Process this objects wrapped with this link and return an {@link IValue}
	 * @return
	 */
	IValue execute();
	
	
}
