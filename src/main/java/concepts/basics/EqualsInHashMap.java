
package concepts.basics;

import java.util.HashMap;
import java.util.Map;


public class EqualsInHashMap {

	private static Map<String, Bean> hashMap = new HashMap<String, Bean>();

	public static void main(String[] args) {

		for (int i = 0; i < 100; i++) {
			hashMap.put(String.valueOf(i), new Bean("Name" + i, "Color" + i));
		}


		System.out.println(hashMap.containsValue(new Bean("Name10", "Color10")));


	}

}


class Bean {

	private String name;
	private String color;


	public Bean(String name, String color) {
		this.name = name;
		this.color = color;
	}


	public String getName() {
		return name;
	}


	public String getColor() {
		return color;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof Bean) {

			if (this.color == ((Bean) obj).color) {
				return true;
			}

		}

		return false;
	}

}