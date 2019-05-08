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
 * Synchronization primitive, used to mark stages of a processing
 * pipeline; used as a fence or guard barrier, make sure that earlier
 * stages have completed processing before later ones start.
 * Basically, hypergraphs may be attached to the anchor, with a
 * ListLink, to indicate that they are either done, or awaiting
 * processing.
 */
public interface IAnchorNode extends INode {

}
