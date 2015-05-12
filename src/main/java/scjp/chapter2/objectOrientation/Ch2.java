
package scjp.chapter2.objectOrientation;


/**
 * 
 * Encapsulation, IS-A, HAS-A (Objective 5.1)
 * 
 * 1. Encapsulation helps hide implementation behind an interface (or API).
 * 
 * 2. Encapsulated code has two features: - Instance variables are kept
 * protected (usually with the private modifier). - Getter and setter methods
 * provide access to instance variables.
 * 
 * 3. IS-A refers to inheritance or implementation.
 * 
 * 4. IS-A is expressed with the keyword extends.
 * 
 * 5. IS-A, "inherits from," and "is a subtype of " are all equivalent
 * expressions.
 * 
 * 6. HAS-A means an instance of one class "has a" reference to an instance of
 * another class or another instance of the same class.
 * 
 * Polymorphism ------------
 * 
 * Polymorphic method invocations apply only to instance methods. You can always
 * refer to an object with a more general reference variable type (a su-
 * perclass or interface), but at runtime, the ONLY things that are dynamically
 * selected based on the actual object (rather than the reference type) are
 * instance methods. Not static methods. Not variables. Only overridden instance
 * meth- ods are dynamically invoked based on the real object's type.
 * 
 */


public class Ch2 {

	public static void main(String[] args) {

		I i = new A(); // The depth of method invocation is defined by the
						// Object made
		i.toString();
	}

}


interface I {

}


class A implements I {
}

class B extends A {

	@Override
	public String toString() {
		System.out.println("You are a stupid");
		return "";
	}
}