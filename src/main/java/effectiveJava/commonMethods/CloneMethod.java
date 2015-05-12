
package effectiveJava.commonMethods;


public class CloneMethod {

	public static void main(String[] args) throws CloneNotSupportedException {

		B b = new B();
		B b1 = (B) b.clone();

		System.out.println(b1.getClass());
		b1.t1.start();

	}
}

class A implements Cloneable {

	public A() {
		System.out.println("I shall not be called while cloning");
	}


	private transient int x = 10;
	public Thread t1 = new Thread(new Runnable() {

		public void run() {
			System.out.println("do this");

		}
	});

	public int getX() {
		return x;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

class B extends A {

}
