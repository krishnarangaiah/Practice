
package concepts.jni;


public class Test {

	static {
		System.load("/home/krishna/c_programs/dataType.so");
	}

	public static void main(String[] args) {
		CallNative callNative = new CallNative();

		Bean bean = new Bean();
		bean.setXint(10);
		bean.setYint(20);

		Bean b = callNative.getBean(bean);
		System.out.println(b.getXint());

	}

}
