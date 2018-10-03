package com.anurag.datastructure.practice;

public class SingleLinkedList {

	Node head = null;
	Node tail = null;

	public void insertionAtStart(int data) {
		Node node = new Node();

		if (size() == 0) {
			System.out.println("List is blank");
			node.setData(data);
			node.setNextNode(null);
			head = node;
			tail = head;
			System.out.println("1 Node added");
		} else {
			node.setData(data);
			node.setNextNode(head);
			head = node;
		}

	}

	public void insertionAtEnd(int data) {
		Node insert = new Node();

		if (size() == 0) {
			System.out.println("List is blank");
			insert.setData(data);
			insert.setNextNode(null);
			head = insert;
			tail = head;
			System.out.println("1 Node added");
		} else if (size() == 1) {
			System.out.println("List has 1 node");
			insert.setData(data);
			insert.setNextNode(null);
			tail.setNextNode(insert);
			tail = insert;
			System.out.println("1 more Node added");
		} else {
			Node node = head;
			while (node.getNextNode() != null) {
				node = node.getNextNode();
			}
			if (node.getNextNode() == null) {
				insert.setData(data);
				insert.setNextNode(null);
				node.setNextNode(insert);
				tail = insert;
			}

		}
	}

	public void insertionAtAnyPos(int pos, int data) {
		int count = 1;
		Node insert = new Node();
		if (pos > size()) {
			System.out.println("Invalid position");
		} else {
			Node node = head;
			while (count < pos) {
				node = node.getNextNode();
				count++;
			}
			insert.setData(data);
			insert.setNextNode(node.getNextNode());
			node.setNextNode(insert);

		}
	}

	public void deletionAtStart() {
		if (size() == 0) {
			System.out.println("Nothing to delete");
		} else if (size() == 1) {
			System.out.println("Only 1 node to delete");
			head = tail = null;
			System.out.println("Node deleted");
		} else {
			head = head.getNextNode();
		}

	}

	public void deletionAtEnd() {
		if (size() == 0) {
			System.out.println("Nothing to delete");
		} else if (size() == 1) {
			System.out.println("Only 1 node to delete");
			head = tail = null;
			System.out.println("Node deleted");
		} else {
			Node node = head;
			while (node.getNextNode().getNextNode() != null) {
				node = node.getNextNode();
			}
			node.setNextNode(null);
			tail = node;

		}

	}

	public void deletionAtAnyPos(int pos) {
		int count = 1;
		Node node = head;
		System.out.println("size of the list is: " + size());
		if (pos == size() - 1) {
			deletionAtEnd();
		} else if (pos > size()) {
			System.out.println("Invalid position");
		} else {
			while (count < pos) {
				node = node.getNextNode();
				count++;
			}
			node.setNextNode(node.getNextNode().getNextNode());
		}

	}

	public void reverseList() {

		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.getNextNode();
			current.setNextNode(prev);
			prev = current;
			current = next;
		}
		head = prev;
		tail = null;

	}

	public void printMid() {
		Node slow_ptr = head;
		Node fast_ptr = head;
		if (head != null) {
			while (fast_ptr != null && fast_ptr.getNextNode() != null) {
				slow_ptr = slow_ptr.getNextNode();
				fast_ptr = fast_ptr.getNextNode().getNextNode();
			}
			System.out.println("Mid node has value : " + slow_ptr.getData());
		}
	}

	public void displayList() {
		if (head == null) {
			System.out.println("Empty List");
		} else if (head == tail) {
			System.out.println(head.getData());
		} else {
			Node node = head;
			while (node != null) {
				System.out.print(node.getData() + " ");
				node = node.getNextNode();
			}
		}
	}

	public int size() {
		int count = 0;
		if (head == null) {
			return 0;
		} else if (head == tail) {
			return 1;
		} else {
			Node node = head;
			while (node != null) {
				count++;
				node = node.getNextNode();
			}
			return count;
		}

	}

	public static void main(String[] args) {

		SingleLinkedList sll = new SingleLinkedList();
		sll.insertionAtStart(0);
		sll.insertionAtEnd(1);
		sll.insertionAtEnd(2);
		sll.insertionAtEnd(3);
		sll.insertionAtEnd(4);
		sll.insertionAtEnd(5);
		sll.insertionAtEnd(6);
		sll.insertionAtEnd(7);
		sll.printMid();

		// sll.displayList();
		// sll.insertionAtAnyPos(5, 5);
		// sll.deletionAtAnyPos(2);
		// sll.displayList();
		// sll.displayList();
		// System.out.println(sll.size());
		// sll.reverseList();
		// sll.deletionAtEnd();
		// sll.displayList();
		// System.out.println(sll.size());

	}
}
