
package concepts.threads;


public class Test {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Thread1());
		Thread t2 = new Thread(new Thread2());

		t1.start();
		t2.start();

	}

}


class Thread1 implements Runnable {

	public void run() {

		try {
			wait(100);
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class Thread2 implements Runnable {

	public void run() {

		try {
			wait(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}