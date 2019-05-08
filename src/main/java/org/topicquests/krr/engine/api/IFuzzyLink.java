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
 * @see https://wiki.opencog.org/w/FuzzyLink
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/atom_types/atom_types.script
 * The FuzzyLink is a kind of type specification that can be imprecise.
 * It is used to specify a pattern that is then matched only
 * approximately by the pattern matcher, to find "similar" graphs.
 * See also GlobNode, which performs a more narrow kind of matching.
 * (viz. bunch-in-a-row globbing)
 */
public interface IFuzzyLink extends ISignatureLink {

}
