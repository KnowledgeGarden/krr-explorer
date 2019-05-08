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
 * @see https://wiki.opencog.org/w/DefineLink
 * @see https://github.com/opencog/atomspace/blob/master/opencog/atoms/core/DefineLink.h
 * The DefineLink is used to give a name to a hypergraph (schema,
 * pattern, concept, predicate, etc).  The name is unique, in that,
 * any attempt to make a different definition with the same name will
 * throw an error.  Thus, only ONE DefineLink with a given name can
 * exist at a time.
 *
 * This class is intended to be used for anything that needs to be
 * accessed by name: for, if there were two things with the same name,
 * it would be ambiguous as to which to access. (It would not make
 * sense to access both: would the result of access have 'and'
 * semantics? 'or' semantics ??)  Thus, names are unique.
 *
 * This is useful for three different purposes. These are:
 * -- The definition of new predicates and schemas. Yes, the 
 *    EquivalenceLink could be used for this; but right now, we are
 *    experimenting with DefineLink.
 * -- A programmer/use convenience. Handy for tagging some atom with
 *    a name, and then referring to that atom by it's name, later on.
 * -- Enabling recursion. A definition can occur within itself, and
 *    can thus specify an infinitely-recursive pattern.  When evaluated
 *    or executed, this inifinite pattern must, of course terminate,
 *    or your code will hang.  Bummer if your code hangs.
 *
 * Of the three, the last is the most important, as, right now, there
 * is no other way of specifying recursive functions in the atomspace.
 */
public interface IDefineLink extends IUniqueLink {

}
