/**
 * Copyright 2019, TopicQuests Foundation
 * 
 * Adapted from and references work (c) Linas Vepstas
 * 
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.krr.engine.api;

import java.io.Writer;
import java.io.Reader;

/**
 * @author jackpark
 *
 */
public interface IJSONAtomSpace extends IAtomSpace {

	/**
	 * Save this database to <code>outStream</code>
	 * @param writer
	 * @throws Exception
	 */
	void saveNodeDatabase(Writer writer) throws Exception;
	
	void saveLinkDatabase(Writer writer) throws Exception;
	
	/**
	 * Reconstruct this database from <code>inStream</code>
	 * @param reader
	 * @throws Exception
	 */
	void restoreNodeDatabase(Reader reader) throws Exception;
	
	void restoreLinkDatabase(Reader reader) throws Exception;
}
