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
		
		Node slow=head,fast=head.getNextNode();
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
	//Geeks for Geeks implementation
	public Node getmiddle(Node head) {
	 
	        Node fastptr = head.getNextNode(); 
	        Node slowptr = head; 
	          
	        // Move fastptr by two and slow ptr by one 
	        // Finally slowptr will point to middle node 
	        while (fastptr != null) 
	        { 
	            fastptr = fastptr.getNextNode(); 
	            if(fastptr!=null) 
	            { 
	                slowptr = slowptr.getNextNode(); 
	                fastptr=fastptr.getNextNode(); 
	            } 
	        } 
	     return slowptr;
	}
	
	public boolean search(Node node,int x) {
		if(node==null) {	
		return false;
		}
		if (node.getData()==x) {
		return true;
		}
		
		return search(node.getNextNode(), x); 
	}
	public Node sortedMerge(Node a, Node b) {
		Node result=null;
		/* Base cases */
        if (a == null) 
            return b; 
        if (b == null) 
            return a; 
  
        /* Pick either a or b, and recur */
        if (a.getData() <= b.getData())  
        { 
            result = a; 
            result.setNextNode(sortedMerge(a.getNextNode(), b));
        }  
        else 
        { 
            result = b; 
            result.setNextNode(sortedMerge(a, b.getNextNode())); 
        } 
        return result; 
	}
	Node mergeSort(Node h)  
    { 
        // Base case : if head is null 
        if (h == null || h.getNextNode() == null) 
        { 
            return h; 
        } 
  
        // get the middle of the list 
        Node middle = getmiddle(h); 
        Node nextofmiddle = middle.getNextNode(); 
  
        // set the next of middle node to null 
        middle.setNextNode(null); 
  
        // Apply mergeSort on left list 
        Node left = mergeSort(h); 
  
        // Apply mergeSort on right list 
        Node right = mergeSort(nextofmiddle); 
  
        // Merge the left and right lists 
        Node sortedlist = sortedMerge(left, right); 
        return sortedlist; 
    } 
}
