package Udemy;

public class LinkedList {
	Node head;

	LinkedList() {
		this.head = null;
	}

	void addFirst(int data) {
		Node node = new Node(data, this.head);
		this.head = node;
	}

	Node getFirst() {
		return this.head;
	}

	Node getLast() {
		Node node = this.head;
		while (node != null) {
			if (node.next == null) {
				return node;
			}
			node = node.next;
		}
		return node;
	}

	void removeFirst() {
		Node node = this.head;
		if (node != null) {
			node = node.next;
			this.head = node;
		}
	}

	void removeLast() {
		Node node = this.head;
		Node previous = null;
		while (node != null) {
			previous = node;
			node = node.next;
			if (node.next == null) {
				previous.next = null;
				break;
			}

		}
	}

	void addLast(int data) {
		Node lastNode = this.getLast();
		if(lastNode==null) {
			this.head = new Node(data,null);
		}else {
			lastNode.next = new Node(data,null);
		}
	}
	
	Node getAt(int n) {
		int size = this.size();
		Node first = this.head;
		Node current = null;
		int counter = 0;
		if(n>=size)
			return null;
		while(counter>=0 && counter<n+1) {
			current = first;
			first = current.next;
			counter++;
		}
		return current;
	}
	
	int size() {
		int size = 0;
		Node node = this.head;
		while (node != null) {
			size++;
			node = node.next;
		}
		return size;
	}

	void clear() {
		this.head = null;
	}

	public String toString() {
		String s = "";
		Node node = this.head;
		while (node != null) {
			s = s + " Data:" + node.data + ", Node:" + node.next;
			node = node.next;
		}
		return s;
	}

	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.addFirst(5);
		li.addFirst(10);
		li.addFirst(15);
		li.addFirst(1);
		li.removeLast();
		li.addLast(20);
		li.addLast(55);
		li.addLast(999);
		System.out.println("First Node");
		System.out.println(li.getFirst() != null ? li.getFirst().data : null);
		System.out.println("Last Node");
		System.out.println(li.getLast() != null ? li.getLast().data : null);
		System.out.println(li.size());
		System.out.println(li);
		System.out.println(li.getAt(2).data);
		li.clear();
	}
}
