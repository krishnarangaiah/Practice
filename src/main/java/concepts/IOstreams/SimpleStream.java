
package concepts.IOstreams;

import java.io.FileInputStream;
import java.io.IOException;


public class SimpleStream {

	public static void main(String[] args) throws IOException {
		
		FileInputStream stream = new FileInputStream("/home/krishna/engine.log.2014-09-29");

		int c;
		while ((c = stream.read()) != -1) {
			System.out.println(c);
		}

	}

}
