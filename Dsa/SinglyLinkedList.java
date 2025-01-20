package linkedList.Dsa;

public class SinglyLinkedList {
	public Node head;
	public Node tail;
	public int size;
	
	public Node createSinglyLinkedList(int nodeValue) {
		head=new Node();
		tail=new Node();
		Node node = new Node();
		node.next=null;
		node.value=nodeValue;
		head=node;
		tail=node;
		size=1;
		return head;
	}
	//Insert method SinglyLinkedList 
	public void insertInLinkedList(int NodeValue, int location) { 
		Node node = new Node();
		node.value=NodeValue;
		if(head==null) {
			createSinglyLinkedList(NodeValue);
			return;
		}
		else if(location==0) {
			node.next=head;
			head=node;
			tail=node;
		}
		else if(location>=size) {
			node.next=null;
			tail.next=node;
			tail=node;
			
		}
		else {
			Node tempNode = head;
			int index=0;
			while(index<location-1) {
				tempNode=tempNode.next;
				index++;
			}
			Node nextNode = tempNode.next;
			tempNode.next=node;
			node.next=nextNode;
		}
		size++;
	}
	
	
}
