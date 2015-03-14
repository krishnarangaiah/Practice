
package concepts.inheritance;


public class Test2 {

}

/**
 * 
 * @author krishna
 * 
 *         How to make A1 non expendable class
 * 
 *         1. using final keyword
 * 
 *         2. make all methods final, variables final
 * 
 *         3. Make methods private // I do not agree
 * 
 *         4. Make methods static
 * 
 *         5. Make constructor private and provide FactoryMethods
 * 
 *
 */


class A1 {

	public void m1() {

	}

}

class B1 extends A1 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		super.m1();
	}

}


class C1{
	
}