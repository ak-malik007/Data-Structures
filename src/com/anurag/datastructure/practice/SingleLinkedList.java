package com.anurag.datastructure.practice;

public class SingleLinkedList {

	Node head = null;
	Node tail = null;

	public void insertionAtStart(int data) {

		Node node = new Node();

		if (head == null) {
			node.setData(data);
			node.setNextNode(null);
			head = node;
			tail = head;

		} else {
			node.setData(data);
			node.setNextNode(head);
			head = node;

		}
	}

	public void insertionAtEnd(int data) {
		Node insert = new Node();
		
		if (size() == 0) {
			insert.setData(data);
			insert.setNextNode(null);
			head = insert;
			tail = head;			
		} else if (size() == 1) {
			insert.setData(data);
			insert.setNextNode(null);
			tail.setNextNode(insert);
			tail = insert;
		} else {
			Node node = head;
			while(node.getNextNode() != null) {
				node = node.getNextNode();				
			}
			if(node.getNextNode() == null) {
				insert.setData(data);
				insert.setNextNode(null);
				node.setNextNode(insert);
				tail = insert;	
			}
			
		}
	}

	public void deletion() {

	}

	public void display() {
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
			return -1;
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
		sll.insertionAtStart(1);
		sll.insertionAtStart(0);
		sll.insertionAtStart(-1);
		sll.insertionAtEnd(2);
		sll.insertionAtEnd(3);
		sll.insertionAtEnd(4);
		sll.display();
		//System.out.println(sll.size());

	}
}
