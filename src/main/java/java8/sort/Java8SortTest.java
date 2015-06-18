package java8.sort;

import java.util.ArrayList;
import java.util.List;

public class Java8SortTest {

	public static void main(String[] args) {

		List<Apple> apples = new ArrayList<Apple>();

		for (int i = 1; i <= 100; i++) {

			apples.add(new Apple(String.valueOf(i)));

		}

		
		for (Apple apple : apples) {
			System.out.println(apple.name);
		}

	}
}

class Apple {
	public String name;

	public Apple(String name) {
		this.name = name;
	}
}
