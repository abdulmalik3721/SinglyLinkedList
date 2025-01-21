package linkedList.Dsa;

public class SinglyLinkedList {
	public Node head;
	public Node tail;
	public int size;

	public Node createSinglyLinkedList(int nodeValue) {
		head = new Node();
		tail = new Node();
		Node node = new Node();
		node.next = null;
		node.value = nodeValue;
		head = node;
		tail = node;
		size = 1;
		return head;
	}

	// Insert method SinglyLinkedList
	public void insertInLinkedList(int NodeValue, int location) {
		Node node = new Node();
		node.value = NodeValue;
		if (head == null) {
			createSinglyLinkedList(NodeValue);
			return;
		} else if (location == 0) {
			node.next = head;
			head = node;
			tail = node;
		} else if (location >= size) {
			node.next = null;
			tail.next = node;
			tail = node;

		} else {
			Node tempNode = head;
			int index = 0;
			while (index < location - 1) {
				tempNode = tempNode.next;
				index++;
			}
			Node nextNode = tempNode.next;
			tempNode.next = node;
			node.next = nextNode;
		}
		size++;
	}

	// Traversal in SinglyLinkedList

	public void traversalLinkedList() {
		if (head == null) {
			System.out.println("Singly LinkedList does not exist");
		} else {
			Node tempNode = head;
			for (int i = 0; i < size; i++) {
				System.out.println(tempNode.value);

				if (i != size - 1) {
					System.out.print("->");
				}
				tempNode = tempNode.next;
			}
		}
		System.out.println("\n");
	}

	// Search for a node in singlyLinkedList

	public boolean searchNode(int nodeValue) {

		if (head != null) {
			Node tempNode = head;
			for (int i = 0; i < size; i++) {
				if (tempNode.value == nodeValue) {
					System.out.println("found the node at the index " + i + "\n");
					return true;
				}
				tempNode = tempNode.next;
			}
		}
		System.out.println("node not found");
		return false;

	}

	// Deleting a Node from SinglyLinkedList

	public void deletionOfNode(int location) {
		if (head == null) {
			System.out.println("SinglyLinkedList does not exist");
			return;
		} else if (location == 0) {
			// more than one nodes
			head = head.next;
			size--;
			if (size == 0) {
				head = null;
				tail = null;
			}
		} else if (location >= size) {
			Node tempNode = head;
			for (int i = 0; i < size - 1; i++) {
				tempNode = tempNode.next;
			}
			if (tempNode == head) {
				tail = head = null;
				size--;
				return;
			}
			tempNode.next=null;
			tail=tempNode;
			size--;
		}
		else {
			Node tempNode=head;
			for(int i=0;i<location-1;i++) {
				tempNode=tempNode.next;
			}
			tempNode.next=tempNode.next.next;
			size--;
		}
	}
	
	//Delete entire Singly Linked List
	
	public void deleteEntireSinglyLinkedList() {
		head=null;
		tail=null;
		System.out.println("the SLL deleted successfully");
	}

}
