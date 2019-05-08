/**
 * 
 */
package org.topicquests.krr.engine.api;

/**
 * @author jackpark
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/execution/Instantiator.h
 * class Instantiator -- create grounded expressions from ungrounded ones.
 * Given an ungrounded expression (i.e. an expression containing variables)
 * and a map between variables and ground terms, it will create a new
 * expression, with the ground terms substituted for the variables.
 *
 * This also implements generic execution: any executable links are
 * executed as the variable substitution is performed.  In particular,
 * execution is implemented as instantiation, with an empty variable
 * map.
 */
public interface IInstantiator {

}
