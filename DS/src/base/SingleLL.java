package base;

public class SingleLL {

	Node head;
	
	public void insert(int data) {
		System.out.println("inserting "+ data+" in the end");
		Node node=new Node();
		node.setData(data);
		node.setNextNode(null);
		
		if(head==null)
		{
			head=node;
		}
		else
		{
			Node n=head;
			while(n.getNextNode()!=null)
			{
				n=n.getNextNode();
			}
			n.setNextNode(node);
		}	
	}
	
	public void insertAtStart(int data) {
		
		System.out.println("inserting "+ data+" At start/zero index");
		
		Node node=new Node();
		node.setData(data);
		node.setNextNode(null);
		node.setNextNode(head) ;
		head=node;
	}
	
	public void insertAt(int index, int data) {
		
		System.out.println("inserting "+ data+" At index " + index);
		
		Node node=new Node();
		node.setData(data);
		node.setNextNode(null);
		int length=count();
		if(index>length) {
			System.out.println("incorrect index, cannot insert");
		}
		else if (index==0)
		{
			insertAtStart(data);
		}
		else {
		Node n=head;
		for(int i=0;i<index-1;i++) {
			n=n.getNextNode();
		}
		node.setNextNode(n.getNextNode());
		n.setNextNode(node);
		}
	}
	
	public void deleteAt(int index)
	{
		
		int length=count();
		if(index>=length) {
			System.out.println("incorrect index, cannot delete");
		}
		else if (index==0)
		{
			head=head.getNextNode();
		}
		else
		{
			Node n=head;
			Node n1=null;
			for(int i=0;i<index-1;i++) {
				n=n.getNextNode();
			}
			n1=n.getNextNode();
			n.setNextNode(n1.getNextNode());
			System.out.println("deleting "+ n1.getData() +" At index " + index);
		}
		
	}
	public void reverse() { 
		
		System.out.println("Reversing the Link List");
        Node prev = null; 
        Node current = head; 
        Node next = null; 
        while (current != null) { 
            next = current.getNextNode(); // Before changing next of current,store next node
            current.setNextNode(prev); //where actual reversing happens
            prev = current; //Move previous to current
            current = next; //Move Current to next
        } 
        head = prev; //re-assign the head node
        
    } 
	public void show()
	{
		Node node=head;
		//System.out.println(head.getData());
				//System.out.println(head.getNextNode());
		
		while(node.getNextNode()!=null) {
			System.out.println(node.getData());
			node=node.getNextNode();
		}
		System.out.println(node.getData());
		System.out.println("----end of function show----");
	}
	
	public int count() {
		Node node=head;
		int count=0;
		
		while(node.getNextNode()!=null) {
		
			node=node.getNextNode();
			count++;
			
		}
		count++;
		//System.out.println("count is "+count);
		return count;
		
	}
	
	public void middle()
	{
		
		Node slow=head,fast=head;
		if (head!=null) {
			while(fast.getNextNode()!=null) {
				if(fast.getNextNode().getNextNode()!=null)
				fast=fast.getNextNode().getNextNode();
				else
				fast=fast.getNextNode();	
				slow=slow.getNextNode();
			}
			System.out.println("middle element is"+slow.getData());
		}
		
		
	}
}
