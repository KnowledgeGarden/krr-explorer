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
  * 
  * @author jackpark
  * @see https://wiki.opencog.org/w/ConceptNode
  * A Node representing any concept.
  * A ConceptNode has a TruthValue, composed of at least a strength and a confidence value, which are both values between 0 and 1.
  * The strength indicates the occurence of a concept within the context of experience. The confidence indicates how sure the agent or system is of this value.
  * These values are used by PLN to perform probabilistic reasoning.
  */
public interface IConceptNode extends INode {
	//TODO
	// Do we need a POJO for this?
	// Concept nodes could be like Proxy nodes with their own API
}
