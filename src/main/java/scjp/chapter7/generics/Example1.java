
package scjp.chapter7.generics;


public class Example1 {

	public static void main(String[] args) {
		Generic<C> g = new Generic<C>();
		g.printAll();


	}

}


class A {

}

class B extends A {

}

class C extends B {

}


class Generic<E extends A> implements Genericsm<E> {

	public void add(E e) {
		System.out.println("Adding element: " + e);
	}

	public void remove(E e) {
		System.out.println("Removing element: " + e);
	}

	public void printAll() {
		System.out.println("Printing all elements: ");
	}
}

interface Genericsm<E> {

	void add(E e);

	void remove(E e);

	void printAll();

}
