
package concepts.weakreferences;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;


public class Main {

	public static void main(String[] args) {
		new Main().doFunction();
	}

	private void doFunction() {

		Map<Integer, String> map = new HashMap<Integer, String>();
		WeakReference<Map<Integer, String>> myMap = new WeakReference<Map<Integer, String>>(map);
		 map = null;


		int i = 0;
		while (true) {
			if (myMap != null && myMap.get() != null) {
				// map.put(i++, "test" + i);
				myMap.get().put(i++, "test" + i);

				System.out.println("im still working!!!!");
			} else {

				System.out.println("*******im free*******");
				System.exit(0);

			}
		}
	}
}
