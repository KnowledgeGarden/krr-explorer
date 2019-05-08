/**
 * 
 */
package tests;
import java.util.*;
/**
 * @author jackpark
 *
 */
public class MapTest {
	private List<String> inList = new ArrayList<String>();
	private List<String> outList = new ArrayList<String>();
	private ITest xyz;
	/**
	 * 
	 */
	public MapTest() {
		xyz = new TheTest();
		inList.add("Hello");
		inList.add("World");
		mapTest(xyz);
		System.out.println("DID "+outList);
		System.exit(0);
		
	}
	
	void mapTest(ITest callback) {
		for (String x: inList) {
			outList.add(callback.process(x));
		}
	}
	
	interface ITest {
		String process(String inString);
	}
	
	class TheTest implements ITest {
		
		public String process(String inString) {
			return inString+" "+System.currentTimeMillis();
		}
	}

}
