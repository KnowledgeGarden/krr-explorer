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
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/atom_types/atom_types.script
 * basic arithmetic operator
 * https://github.com/opencog/atomspace/blob/master/opencog/atoms/reduct/ArithmeticLink.h
 * The ArithmeticLink implements the simple arithmetic operations.
 * It uses FoldLink to perform delta-reduction.
 * .h says it only extends IFoldLink
 */
public interface IArithmeticLink extends IFoldLink/*, INumericLink, INumericOutputLink*/ {

}
