
package concepts.inheritance;


public class Test3 {

}

interface I3 {

	void m1();
}

class A3 implements I3 {

	public void m1() {
		System.out.println("from A3");
	}

}

class B3 extends A3 {

	@Override
	public void m1() {
		System.out.println("from B3");
	}
}