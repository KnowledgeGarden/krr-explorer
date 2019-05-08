/**
 * Copyright 2019, TopicQuests Foundation
 * 
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.krr.util;

import org.joou.ULong;
import static org.joou.Unsigned.*;

/**
 * @author jackpark
 * For comparing contentHash values
 */
public class CompareHashUtil {

	public static boolean greaterThan(long hashA, long hashB) {
		int which = compareTo(hashA, hashB);
		return which > 0;
	}
	
	public static boolean equalTo(long hashA, long hashB) {
		int which = compareTo(hashA, hashB);
		return which == 0;
	}

	public static boolean lessThan(long hashA, long hashB) {
		int which = compareTo(hashA, hashB);
		return which < 0;
	}
	
	public static int compareTo(long hashA, long hashB) {
		ULong x = ulong(hashA);
		ULong y = ulong(hashB);
		return x.compareTo(y);
		
	}

}
