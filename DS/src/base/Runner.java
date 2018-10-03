package base;



public class Runner {

	public static void main(String[] args) {
		SingleLL list=new SingleLL();
		DoubleLL dlist=new DoubleLL();
		
		list.insert(2);
		list.insert(6);
		list.insert(5);
		list.insert(7);
		list.insert(9);
		list.show();
	//list.head=list.mergeSort(list.head);
	//list.show();
		list.middle();
		/*
		list.show();
		
		list.insertAtStart(8);
		list.insertAtStart(1);
		list.show();
		list.insertAt(4, 55);
		list.show();
		list.deleteAt(5);
		list.show();
		list.reverse();
		list.show();
		list.middle();
		boolean result=list.search(list.head, 8);
		System.out.println(result);
		dlist.insertAtStart(1);
		dlist.insertAtStart(2);
		dlist.insertAtStart(6);
		dlist.insertAtEnd(7);
		dlist.insertAfter(dlist.head.getNextNode().getNextNode(), 9);
		dlist.insertBefore(dlist.head.getNextNode().getNextNode(), 4);
		dlist.show();
		dlist.delete(6);
		dlist.show();
		dlist.reverseShow();*/
	}

}
