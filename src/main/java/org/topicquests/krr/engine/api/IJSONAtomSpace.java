/**
 * Copyright 2019, TopicQuests Foundation
 * 
 * Adapted from and references work (c) Linas Vepstas
 * 
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.krr.engine.api;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author jackpark
 *
 */
public interface IJSONAtomSpace extends IAtomSpace {

	/**
	 * Save this database to <code>outStream</code>
	 * @param outStream
	 * @throws Exception
	 */
	void saveDatabase(OutputStream outStream) throws Exception;
	
	/**
	 * Reconstruct this database from <code>inStream</code>
	 * @param inStream
	 * @throws Exception
	 */
	void restoreDatabase(InputStream inStream) throws Exception;
}
