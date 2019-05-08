/**
 * Copyright 2019, TopicQuests Foundation
 * 
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.krr.engine.api;

/**
 * @author jackpark
 * Used in Java lambda expressions
 * @see https://medium.freecodecamp.org/learn-these-4-things-and-working-with-lambda-expressions-b0ab36e0fffc
 */
public interface ICallback {

	boolean process(IAtom atom);
}
