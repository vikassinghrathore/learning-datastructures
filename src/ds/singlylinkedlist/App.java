package ds.singlylinkedlist;

public class App {
	public static void main(String[] args) {
		SinglyLinkedList singlyList = new SinglyLinkedList();
		singlyList.insertFirst(100);
		singlyList.insertFirst(50);
		singlyList.insertFirst(99);
		singlyList.insertFirst(88);
		singlyList.insertLast(9999999);
		singlyList.insertLast(8888888);

		singlyList.displayList();
	}
}
