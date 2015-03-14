
package concepts.concurrency.locks;



public class Test {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new Thread1());
		Thread t2 = new Thread(new Thread2());

		t1.start();
		t2.start();


	}

}
