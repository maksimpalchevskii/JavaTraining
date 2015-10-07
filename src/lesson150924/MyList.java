package lesson150924;

public class MyList<T> {
	Node<T> first;
	Node<T> last;

	public void add(T data) {
		Node<T> node = new Node<T>();
		node.data = data;
		node.next = null;
		if (first == null) {
			first = node;
		}
		if (last == null) {
			last = node;
		} else {
			last.next = node;
			last = node;
		}
	}

	@Override
	public String toString() {
		
		String s = "[";
		
		Node temp = first;
		
		while (temp != null) {
			s += temp.data;
			s += ", ";
			temp = temp.next;
		}
		
		return s + "]";
	}

}
