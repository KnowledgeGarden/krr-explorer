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
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/core/Variables.h
 * The FreeVariables struct defines a list of free, untyped variables
 * "unbundled" from the hypergraph in which they normally occur. The
 * goal of this structure is to make it easier and faster to work with
 * VariableNodes in C++; specifically, to find thier locations within
 * a hypergraph, and to perform beta-substitution (to substitute a
 * argument for the variable).  This class implements the data that is
 * used by FreeLink to work with free variables.
 */
public interface IFreeVariables {

	
	/**
	 * Convert a variable->argument mapping into a sequence of
	 * "arguments" that are in the same order as the free variables
	 * in this class.  If the mapping does not mention a variable,
	 * then that variable itself is used as the argument.  This sequence
	 * can be used with the substituteNoCheck() function below.
	 * @param variableMap
	 * @return
	 */
	 IOrderedLink makeSequence(final IMapLink variableMap);
	
	 
	 /**
	  * Given the tree `tree` containing variables in it, create and
	  * return a new tree with the indicated arguments `args` substituted
	  * for the variables.  "nocheck" == no type checking is done.
	  * This performs an almost pure, syntactic beta-reduction; its
	  * almost-pure because it does honour the semantics of QuoteLink.
	  * @param term
	  * @param sequence
	  * @param silent
	  * @return
	  */
	 IOrderedLink substituteNoCheck(final IAtom term,
             						final IOrderedLink sequence,
             						boolean silent);

	 /**
	  * Like the above, but takes a mapping from variables to arguments.
	  * @param term
	  * @param map
	  * @param silent
	  * @return
	  */
	 IOrderedLink substituteNoCheck(final IAtom term,
				final IMapLink map,
				boolean silent);

	 
	 /**
	 * Remove a variable if it exists
	 * @param variableId
	 */
	void erase(String variableId);
	
	/**
	 * Return the number of free variables that this class is holding.
	 * @return
	 */
	int size();
	
	/**
	 * Return <code>true</code> if holding no variables
	 * @return
	 */
	boolean isEmpty();
}
