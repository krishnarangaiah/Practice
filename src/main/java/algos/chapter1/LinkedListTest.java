
package algos.chapter1;

public class LinkedListTest {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();

		for (String s : "Hi Krishna Rangaiah How Are you".split(" ")) {

			System.out.println(s);
			ll.setItem(s);

		}
	}
}

class LinkedList<T> {

	private T item;
	private LinkedList<T> next;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public LinkedList<T> getNext() {
		return next;
	}

	public void setNext(LinkedList<T> next) {
		this.next = next;
	}

}