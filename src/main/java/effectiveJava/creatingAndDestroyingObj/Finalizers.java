
package effectiveJava.creatingAndDestroyingObj;

import java.util.concurrent.TimeUnit;


public class Finalizers {

	public static void main(String[] args) throws Throwable {
		FinalizerA a = new FinalizerB();
		a = null;


		System.gc();
		TimeUnit.SECONDS.sleep(10);

	}

}


class FinalizerA {

	private Object finalizeGaurdien = new Object() {

		protected void finalize() throws Throwable {
			// FIXME: How will you make a call to FinalizerA finalize() method?
		};
	};

	@Override
	protected void finalize() throws Throwable {
		System.out.println("this is from A");
		super.finalize();
	}

}

class FinalizerB extends FinalizerA {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("this is from B");
		// super.finalize();
	}

}