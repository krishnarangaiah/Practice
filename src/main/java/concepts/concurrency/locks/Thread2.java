
package concepts.concurrency.locks;

import java.util.concurrent.TimeUnit;


public class Thread2 implements Runnable {

	public void run() {
		while (true) {

			try {

				System.out.println("From 2: waiting for Lock");

				synchronized (MustreamLocks.KILL_LOCK) {
					System.out.println("From 2: Hi");
					TimeUnit.MILLISECONDS.sleep(100);
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
