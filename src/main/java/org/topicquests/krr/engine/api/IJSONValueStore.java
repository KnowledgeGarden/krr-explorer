/**
 * Copyright 2019, TopicQuests Foundation
 * 
 * Adapted from and references work (c) Linas Vepstas
 * 
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.krr.engine.api;

import java.io.Reader;
import java.io.Writer;

/**
 * @author jackpark
 *
 */
public interface IJSONValueStore extends IValueStore {

	/**
	 * Save this database to <code>writer</code>
	 * @param writer
	 * @throws Exception
	 */
	void saveValueDatabase(Writer writer) throws Exception;

	/**
	 * Reconstruct this database from <code>reader</code>
	 * @param reader
	 * @throws Exception
	 */
	void restoreValueDatabase(Reader reader) throws Exception;

}
