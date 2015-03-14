
package effectiveJava.creatingAndDestroyingObj;


public class StaticMethods {

	public static void main(String[] args) {

		A a = B.getIntanceWithX(10);
		System.out.println(a.getX());

		B b = (B) B.getInstanceWithY(20);
		System.out.println(b.getX());

	}

}


class A {

	private int x;


	static A getInstance() {
		return new A();
	}

	static A getIntanceWithX(int x) {
		A a = new A();
		a.setX(x);
		return a;
	}


	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

}

class B extends A {

	@Override
	public int getX() {
		return super.getX();
	}

	public static A getInstanceWithY(int x) {
		A a = new B();
		a.setX(x);
		return a;
	}

}
