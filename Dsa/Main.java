package linkedList.Dsa;

public class Main {
	public static void main(String[] args) {
		SinglyLinkedList SLL = new SinglyLinkedList();
		SLL.createSinglyLinkedList(4);
		System.out.println(SLL.head.value);
		SLL.insertInLinkedList(12, 0);
		SLL.insertInLinkedList(11, 4);
		SLL.insertInLinkedList(55, 5);
		SLL.insertInLinkedList(67, 3);
		System.out.println(SLL.head.value);
		System.out.println(SLL.head.next.value);

		// System.out.println(SLL.searchNode(12));
		SLL.searchNode(11);
		SLL.deletionOfNode(0);
		SLL.traversalLinkedList();
		SLL.deleteEntireSinglyLinkedList();
		SLL.traversalLinkedList();

	}
}
