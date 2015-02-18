
package concepts.inheritance;


public class Test {

	public static void main(String[] args) {
		
		A a = new A();
		a.method1();

	}

}


class A implements I {

	public void method1() {
		throw new NullPointerException();
	}

}

interface I {
	void method1();
}
