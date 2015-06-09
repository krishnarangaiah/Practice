
package concepts.processbuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class A {

	public static void main(String[] args) throws IOException {

		ProcessBuilder processBuilder = new ProcessBuilder("ssh", "musigma@172.25.1.27", ";", "pwd");
		Process process = processBuilder.start();

		process.getInputStream();
		process.getErrorStream();

		char[] readBuffer = new char[1000000];
		InputStreamReader isr = new InputStreamReader(process.getInputStream());
		BufferedReader br = new BufferedReader(isr);

		int charCount;
		while (true) {

			charCount = br.read(readBuffer);

			if (charCount > 0) {


				try {

					String resultString = new String(readBuffer, 0, charCount);
					System.out.println(resultString);

				} catch (Exception e) {

					// the try covered area should run in all cases so Super
					// exception is caught and just logging it, and
					// supperssing the exception at log level (we need to go
					// with solid design to communicate on this exception)

					e.printStackTrace();

				}

			} else {
				break;
			}

		}


	}

}
