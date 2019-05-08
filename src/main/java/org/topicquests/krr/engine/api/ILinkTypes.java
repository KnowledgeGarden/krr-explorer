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
 * @see https://wiki.opencog.org/w/SignatureLink
 * @see https://wiki.opencog.org/w/ArrowLink
 * @see https://wiki.opencog.org/w/EvaluationLink
 * @see https://wiki.opencog.org/w/MemberLink
 * @see https://wiki.opencog.org/w/ExecutionLink
 * @see https://wiki.opencog.org/w/ExecutionOutputLink
 * @see https://wiki.opencog.org/w/SatisfyingSetLink
 * @see https://wiki.opencog.org/w/SatisfyingSetScopeLink
 * @see https://wiki.opencog.org/w/SatisfactionLink_and_BindLink
 * @see https://wiki.opencog.org/w/EquivalenceLink
 * @see https://wiki.opencog.org/w/InheritanceLink
 * @see https://wiki.opencog.org/w/OrderedLink_and_UnorderedLink
 * @see https://wiki.opencog.org/w/AndLink
 * @see https://wiki.opencog.org/w/OrLink
 * @see https://wiki.opencog.org/w/SequentialAndLink
 * @see https://wiki.opencog.org/w/NotLink
 * @see https://wiki.opencog.org/w/SetLink
 * @see https://wiki.opencog.org/w/AbsentLink
 * @see https://wiki.opencog.org/w/PresentLink
 * @see https://wiki.opencog.org/w/GetLink
 * @see https://wiki.opencog.org/w/PutLink
 * @see https://wiki.opencog.org/w/LambdaLink_and_ScopeLink
 * @see https://wiki.opencog.org/w/TypedVariableLink
 * @see https://wiki.opencog.org/w/ChoiceLink
 * @see https://wiki.opencog.org/w/TypeChoice
 * @see https://wiki.opencog.org/w/TypeSetLink
 * @see https://wiki.opencog.org/w/IntervalLink
 * @see https://wiki.opencog.org/w/TimeIntervalLink <-- semideprecated; under review
 * @see https://wiki.opencog.org/w/QuoteLink
 * @see https://wiki.opencog.org/w/AtTimeLink <-- deprecated
 * @see https://wiki.opencog.org/w/PredictiveImplicationLink
 * @see https://wiki.opencog.org/w/UnquoteLink
 * @see https://wiki.opencog.org/w/LocalQuoteLink
 * @see https://wiki.opencog.org/w/DontExecLink
 * @see https://wiki.opencog.org/w/ExistsLink
 * @see https://wiki.opencog.org/w/ForAllLink
 * @see https://wiki.opencog.org/w/FreeLink
 * @see https://wiki.opencog.org/w/DeleteLink
 * @see https://wiki.opencog.org/w/StateLink
 * @see https://wiki.opencog.org/w/FunctionLink
 * @see https://wiki.opencog.org/w/PlusLink
 * @see https://wiki.opencog.org/w/DefineLink
 * @see https://wiki.opencog.org/w/ListLink
 * @see https://wiki.opencog.org/w/EqualLink
 * @see https://wiki.opencog.org/w/GreaterThanLink
 * @see https://wiki.opencog.org/w/PredicateFormulaLink
 * @see https://wiki.opencog.org/w/UniqueLink
 * @see https://wiki.opencog.org/w/TypedAtomLink
 * @see https://wiki.opencog.org/w/FoldLink
 * @see https://wiki.opencog.org/w/RandomChoiceLink
 * @see https://wiki.opencog.org/w/RandomNumberLink
 * @see https://wiki.opencog.org/w/SleepLink
 * @see https://wiki.opencog.org/w/JoinLink
 * @see https://wiki.opencog.org/w/ParallelLink
 * @see https://wiki.opencog.org/w/VariableList
 * @see https://wiki.opencog.org/w/ValueOfLink
 * @see https://wiki.opencog.org/w/TruthValueOfLink
 * @see https://wiki.opencog.org/w/StrengthOfLink
 * @see https://wiki.opencog.org/w/CondLink
 * @see https://wiki.opencog.org/w/ConsLink
 * @see https://wiki.opencog.org/w/ContextLink
 * @see https://wiki.opencog.org/w/IdenticalLink
 * @see https://wiki.opencog.org/w/IfThenElseLink
 * @see https://wiki.opencog.org/w/ImplicationLink
 * @see https://wiki.opencog.org/w/ImplicationScopeLink
 * @see https://wiki.opencog.org/w/IntensionalImplicationLink
 * @see https://wiki.opencog.org/w/IntensionalSimilarityLink
 * @see https://wiki.opencog.org/w/DualLink
 * @see https://wiki.opencog.org/w/AssociativeLink
 * @see https://wiki.opencog.org/w/AttractionLink
 * @see https://wiki.opencog.org/w/AverageLink
 * @see https://wiki.opencog.org/w/ExtensionalEquivalenceLink
 * @see https://wiki.opencog.org/w/ExtensionalImplicationLink
 * @see https://wiki.opencog.org/w/ExtensionalSimilarityLink
 * @see https://wiki.opencog.org/w/FalseLink
 * @see https://wiki.opencog.org/w/FilterLink <-- unimplemented
 * @see https://wiki.opencog.org/w/FuzzyLink
 * @see https://wiki.opencog.org/w/HebbianLink
 * @see https://wiki.opencog.org/w/MapLink
 * @see https://wiki.opencog.org/w/PartOfLink
 * @see https://wiki.opencog.org/w/PrenexLink
 * @see https://wiki.opencog.org/w/QuantityLink
 * @see https://wiki.opencog.org/w/RewriteLink
 * @see https://wiki.opencog.org/w/SimilarityLink
 * @see https://wiki.opencog.org/w/SubsetLink
 * @see https://wiki.opencog.org/w/SymmetricInverseHebbianLink
 * @see https://wiki.opencog.org/w/TrueLink
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/atom_types/atom_types.script
 */
public interface ILinkTypes {
	
	public static final int 
		ABSENT_LINK_TYPE				= 10,
		ALPHA_EQUAL_LINK_TYPE			= 11,
		AND_LINK_TYPE					= 12,
		ARITHMETIC_LINK_TYPE			= 13,
		ARITY_LINK_TYPE					= 14,
		ARROW_LINK_TYPE					= 15,
		ASSOCIATIVE_LINK_TYPE			= 16,
		ATTENTION_VALUE_OF_LINK_TYPE	= 17,
		ATTRACTION_LINK_TYPE			= 18,
		AVERAGE_LINK_TYPE				= 19,
		BIND_LINK_TYPE					= 20,
		BOOLEAN_LINK_TYPE				= 21,
		CHOICE_LINK_TYPE				= 22,
		COND_LINK_TYPE					= 23,
		CONS_LINK_TYPE					= 24,
		CONTEXT_LINK_TYPE				= 25,
		CONFIDENCE_OF_LINK_TYPE			= 26,
		CRISP_OUTPUT_LINK_TYPe			= 27,
		DEFINE_LINK_TYPE				= 28,
		DELETE_LINK_TYPE				= 29,
		DONT_EXECUTE_LINK_TYPE			= 30,
		DUAL_LINK_TYPE					= 31,
		EQUAL_LINK_TYPE					= 32,
		EQUIVALENCE_LINK_TYPE			= 33,
		EQUIVALENCE_SCOPE_LINK_TYPE		= 34,
		EVALUATABLE_LINK_TYPE			= 35,
		EVALUATION_LINK_TYPE			= 36,
		EXECUTION_LINK_TYPE				= 37,
		EXECUTION_OUTPUT_LINK_TYPE		= 38,
		EXISTS_LINK_TYPE				= 38,
		EXTENSIONAL_EQUIVALENCE_LINK_TYPE		= 40,
		EXTENSIONAL_EQUIVALENCE_SCOPE_LINK_TYPE	= 42,
		EXTENSIONAL_IMPLICATION_SCOPE_LINK_TYPE	= 43,
		EXTENSIONAL_SIMILARITY_LINK_TYPE		= 44,
		FALSE_LINK_TYPE							= 45,
		FOLD_LINK_TYPE							= 46,
		FORALL_LINK_TYPE						= 47,
		FREE_LINK_TYPE							= 48,
		FUNCTION_LINK_TYPE						= 49,
		FUZZY_LINK_TYPE							= 50,
		GET_LINK_TYPE							= 51,
		GREATER_THAN_LINK_TYPE					= 52,
		HEBBIAN_LINK_TYPE						= 53,
		IDENTICAL_LINK_TYPE						= 54,
		IF_THEN_ELSE_LINK_TYPE					= 56,
		IMPLICATION_LINK_TYPE					= 57,
		IMPLICATION_SCOPE_LINK_TYPE				= 58,
		INHERITANCE_LINK_TYPE					= 59,
		INTENSIONAL_EQUIVALENCE_LINK_TYPE		= 60,
		INTENSIONAL_EQUIVALENCE_SCOPE_LINK_TYPE	= 61,
		INTENSIONAL_IMPLICATION_LINK_TYPE		= 62,
		INTENSIONAL_IMPLICATION_SCOPE_LINK_TYPE	= 63,
		INTENSIONAL_SIMILARITY_LINK_TYPE		= 64,
		INTERVAL_LINK_TYPE						= 65,
		JOIN_LINK_TYPE							= 66,
		LAMBDA_LINK_TYPE						= 67,
		LIST_LINK_TYPE							= 68,
		LOCAL_QUOTE_LINK_TYPE					= 69,
		LTI_OF_LINK_TYPE						= 70, // ???
		MAP_LINK_TYPE							= 71,
		MEMBER_LINK_TYPE						= 72,
		MINUS_LINK_TYPE							= 73,
		NOT_LINK_TYPE							= 74,
		NUMERIC_LINK_TYPE						= 75,
		NUMERIC_OUTPUT_LINK_TYPE				= 76,
		OR_LINK_TYPE							= 77,
		ORDERED_LINK_TYPE						= 78,
		PARALLEL_LINK_TYPE						= 79,
		PART_OF_LINK_TYPE						= 80,
		PATTERN_LINNK_TYPE						= 81,
		PLUS_LINK_TYPE							= 82,
		PREDICATE_FORMULA_LINK_TYPE				= 83,
		PREDICTIVE_IMPLICATION_LINK_TYPE		= 84,
		PRENEX_LINK_TYPE						= 85,
		PRESENT_LINK_TYPE						= 86,
		PUT_LINK_TYPE							= 87,
		QUANTITY_LINK_TYPE						= 88,
		QUERY_LINK_TYPE							= 89,
		QUOTE_LINK_TYPE							= 90,
		RANDOM_CHOICE_LINK_TYPE					= 91,
		RANDOM_NUMBER_LINK_TYPE					= 92,
		REWRITE_LINK_TYPE						= 93,
		SCOPE_LINK_TYPE							= 94,
		SATISFACTION_LINK_TYPE					= 95,
		SATISFYING_LINK_TYPE					= 96,
		SATISFYING_SET_LINK_TYPE				= 97,
		SATISFYING_SET_SCOPE_LINK_TYPE			= 98,
		SET_LINK_TYPE							= 99,
		SEQUENTIAL_AND_LINK_TYPE				= 100,
		SEQUENTIAL_OR_LINK_TYPE					= 101,
		SIGNATURE_LINK_TYPE						= 102,
		SIMILARITY_LINK_TYPE					= 103,
		SLEEP_LINK_TYPE							= 104,
		STATE_LINK_TYPE							= 105,
		STI_OF_LINK_TYPE						= 106, // ???
		STRENGTH_OF_LINK_TYPE					= 107,
		SUBSET_LINK_TYPE						= 108,
		SYMMETRIC_INVERSE_HEBBIAN_LINK_TYPE		= 109,
		TIME_LINK_TYPE							= 110,
		TIME_INTERVAL_LINK_TYPE					= 111,
		TIMES_LINK_TYPE							= 112,
		TRUE_LINK_TYPE							= 113,
		TRUTH_VALUE_OF_LINK_TYPE				= 114,
		TYPE_CHOICE_LINK_TYPE					= 115,
		TYPE_LINK_TYPE							= 116,
		TYPE_OUTPUT_LINK_TYPE					= 117,
		TYPE_SET_LINK_TYPE						= 118,
		TYPED_ATOM_LINK_TYPE					= 119,
		TYPED_VAIABLE_LINK_TYPE					= 120,
		UNIQUE_LINK_TYPE						= 121,
		UNORDERED_LINK_TYPE						= 122,
		UNQUOTE_LINK_TYPE						= 123,
		VALUE_OF_LINK_TYPE						= 124,
		VARIABLE_LIST_LINK_TYPE					= 125,
		VIRTUAL_LINK_TYPE						= 126;

}
