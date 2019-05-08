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
 * @see https://wiki.opencog.org/w/TypeNode
 * @see https://wiki.opencog.org/w/ConceptNode
 * @see https://wiki.opencog.org/w/GroundedSchemaNode
 * @see https://wiki.opencog.org/w/VariableNode
 * @see https://wiki.opencog.org/w/TimeNode
 * @see https://wiki.opencog.org/w/NumberNode
 * @see https://wiki.opencog.org/w/DefinedTypeNode
 * @see https://wiki.opencog.org/w/ProcedureNode
 * @see https://wiki.opencog.org/w/PredicateNode
 * @see https://wiki.opencog.org/w/GroundedPredicateNode
 * @see https://wiki.opencog.org/w/SchemaNode
 * @see https://wiki.opencog.org/w/DefinedPredicateNode
 * @see https://wiki.opencog.org/w/DefinedSchemaNode
 * @see https://wiki.opencog.org/w/CutNode
 * @see https://wiki.opencog.org/w/DefinedSetNode
 * @see https://wiki.opencog.org/w/AnyNode
 * @see https://wiki.opencog.org/w/GeneNode
 * @see https://wiki.opencog.org/w/NewNode <-- proposed, not implemented
 * @see https://wiki.opencog.org/w/TypeCoInhNode
 * @see https://wiki.opencog.org/w/TypeInhNode
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/atom_types/atom_types.script
 */
public interface INodeTypes {
	
	public static final int
		ANCHOR_NODE_TYPE			= 2001,
		ANY_NODE_TYPE				= 2002,
		CONCEPT_NODE_TYPE			= 2003,
		CUT_NODE_TYPE				= 2004,
		DEFINED_PREDICATE_NODE_TYPE = 2005,
		DEFINED_SCHEMA_NODE_TYPE	= 2006,
		DEFINED_SET_NODE_TYPE		= 2007,
		DEFINED_TYPE_NODE			= 2008,
		GENE_NODE_TYPE				= 2009,
		GLOB_NODE_TYPE				= 2010,
		GROUNDED_PREDICATE_NODE_TYPE= 2011,
		GROUNDED_PROCEDURE_NODE_TYPE= 2012,
		GROUNDED_SCHEMA_NODE_TYPE	= 2013,
		NUMBER_NODE_TYPE			= 2014,
		PREDICATE_NODE_TYPE			= 2015,
		PROCEDURE_NODE_TYPE			= 2016,
		SCHEMA_NODE_TYPE			= 2017,
		TIME_NODE_TYPE				= 2018,
		TYPE_CO_INH_NODE_TYPE		= 2019,
		TYPE_INH_NODE_TYPE			= 2020,
		TYPE_NODE_TYPE				= 2021,
		VARIABLE_NODE_TYPE			= 2022;

}
