package base;

public class DoubleLL {
	
	Node head;
	
	public void insertAtStart(int data) {
		/* 1. allocate node  
		    * 2. put in the data */
		Node node=new Node();
		node.setData(data);
		 /* 3. Make next of new node as head and previous as NULL */
		node.setNextNode(head);
		node.setPrevNode(null);
		/* 4. change prev of head node to new node */
		if (head!=null)
			head.setPrevNode(node);
		/* 5. move the head to point to the new node */
		head=node;
	}
	
	public void insertAtEnd(int data)
	{
		/* 1. allocate node  
		    * 2. put in the data */
		Node node=new Node();
		node.setData(data);
		
		Node last = head; //temporary node to traverse the list till end
		
		/* 3. This new node is going to be the last node, so 
	     * make next of it as NULL*/
	    node.setNextNode(null);
	    
	    /* 4. If the Linked List is empty, then make the new 
	     * node as head */
	    if (head == null) { 
	        node.setPrevNode(null);
	        head = node;
	        return;
	    } 
	    
	    /* 5. Else traverse till the last node */
	    while (last.getNextNode() != null) 
	        last = last.getNextNode(); 
		
	    /* 6. Change the next of last node */
	    last.setNextNode(node);
	    
	    /* 7. Make last node as previous of new node */
	    node.setPrevNode(last);
	}
	
	public void insertAfter(Node prev, int data) {
		if(prev==null) {
			System.out.println("The given previous node cannot be NULL "); 
	        return; 
	    }
		Node node=new Node();
		node.setData(data);
		
		node.setNextNode(prev.getNextNode());
		prev.setNextNode(node);
		node.setPrevNode(prev);
		
		if (node.getNextNode() != null) 
	        //node.setNode(node.getNextNode().getPrevNode()); 
		node.getNextNode().setPrevNode(node);
			
	}
	
	public void insertBefore(Node next,int data)
	{
		if(next==null) {
			System.out.println("The given next node cannot be NULL "); 
	        return; 
	    }
		
		Node node=new Node();
		node.setData(data);
		node.setPrevNode(next.getPrevNode());
		next.setPrevNode(node);
		node.setNextNode(next);
		 if (node.getPrevNode() != null) 
		//node.setNode(node.getPrevNode().getNextNode());
			 node.getPrevNode().setNextNode(node);
	}
	
	public void delete(int index) {
		int length=count();
		if(head!=null) {
			if(index>=length) {
				System.out.println("incorrect index, cannot delete");
			}
			else if(index==0) {
				if(count()==1)
				head=head.getNextNode();
				else {
					head.getNextNode().setPrevNode(null);
				head=head.getNextNode();
				}
		}
			else {
				Node n=head;
				for(int i=0;i<index;i++) {
					n=n.getNextNode();
				}
				if(n.getNextNode()==null) {
					n.getPrevNode().setNextNode(null);
					n.setPrevNode(null);
				}
				else {
					n.getPrevNode().setNextNode(n.getNextNode());
					n.getNextNode().setPrevNode(n.getPrevNode());
				}
			}
		}
		else
			System.out.println("list is empty");
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
	
	public void reverseShow() {
		Node last=head;
		
		while(last.getNextNode()!=null) {
			
			last=last.getNextNode();
			
		}
while(last.getPrevNode()!=null) {
	System.out.println(last.getData());
last=last.getPrevNode();
}	
System.out.println(last.getData());
	}

}
