
package concepts.jni;


public class CallNative {

	/*
	 * Modify the below instance variables using native functions
	 */

	public int number = 88;
	public String message = "Hi Krishna this is from Java";


	native void getInteger(int i);

	native void getLong(long l);

	native void getString(String s);

	native void modifyInstanceVariables();

	native Bean getBean(Bean bean);
	
}
