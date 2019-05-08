/**
 * 
 */
package tests;

import java.util.ArrayList;
import java.util.List;

import tests.MapTest.ITest;
import tests.MapTest.TheTest;

/**
 * @author jackpark
 *
 */
public class MapTest2 {
	private List<String> inList = new ArrayList<String>();
	private ITest xyz;

	/**
	 * 
	 */
	public MapTest2() {
			xyz = new TheTest();
			inList.add("Hello");
			inList.add("World");
			boolean t = mapTest(xyz);
			System.out.println("DID "+t);
			System.exit(0);
	}
	boolean mapTest(ITest callback) {
		boolean result = false;
		for (String x: inList) {
			result = callback.process(x);
			if (result)
				break;
		}
		return result;
	}

	
	interface ITest {
		boolean process(String inString);
	}
	
	class TheTest implements ITest {
		
		public boolean process(String inString) {
			return inString.equalsIgnoreCase("world");
		}
	}

}
