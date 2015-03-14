
package effectiveJava.creatingAndDestroyingObj;


public class NonInstantiableClass {

	public static void main(String[] args) {
		NoConstructor constructor =  NoConstructor.getInstance();
	}

}


class NoConstructor {

	private NoConstructor() {
		throw new AssertionError("Do not create instance");
	}

	public static NoConstructor getInstance() {
		return new NoConstructor();
	}

}