
package effectiveJava.creatingAndDestroyingObj;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class SingletonPattern {

	public static void main(String[] args) {
		Session.sessionObj.putValueToSession();
		System.out.println(Session.sessionObj.getValues());
	}
}

enum Session {
	sessionObj;

	private Map<String, String> globalVariable = new HashMap<String, String>();

	public void putValueToSession() {
		globalVariable.put("hi", "krishna");
	}

	public Collection<String> getValues() {
		return globalVariable.values();
	}


}