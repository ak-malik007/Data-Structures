
package base;
public class Node {
	private int data ;
	private Node next = null;
	private Node prev = null;
	public void setData(int data){
		this.data = data;
	}
	
	public int getData(){
		return this.data;
	}
	
	public void setNextNode(Node node){
		this.next = node;
	}
	
	public Node getNextNode(){
		return this.next;
	}

	public void setPrevNode(Node node) {
		this.prev=node;
	}
	public Node getPrevNode(){
		return this.prev;
	}
}
