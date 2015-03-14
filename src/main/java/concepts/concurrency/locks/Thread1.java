
package concepts.concurrency.locks;

import java.util.concurrent.TimeUnit;


public class Thread1 implements Runnable {

	private int i;

	public void run() {

		synchronized (MustreamLocks.KILL_LOCK) {

			while (true) {

				try {

					System.out.println("From 1: waiting for Lock");

					System.out.println("From 1: Hi");
					TimeUnit.MILLISECONDS.sleep(100);
					i++;

					if (i > 30) {
						break;
					}

				} catch (Exception e) {
					e.printStackTrace();
				}
			}


		}

	}

}
