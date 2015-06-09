
package scjp.chapter7.generics;

import java.util.ArrayList;
import java.util.List;


public class GenericTest {

	public static void main(String[] args) {

		GenericList<Integer> genericList = new GenericList<Integer>();
		genericList.addElement(1);
		System.out.println(genericList.size());

	}
}

class GenericList<E> {

	private List<E> list = new ArrayList<E>();

	public void addElement(E e) {
		list.add(e);
	}

	public Integer size() {
		return list.size();
	}


}