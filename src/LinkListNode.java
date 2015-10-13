
public class LinkListNode {
	int data;
	LinkListNode next;
	
	public int getData(){
		return data;
	}
	public void setNextNode(LinkListNode newItem){
		this.next = newItem;
	}
	public LinkListNode getNextNode(){
		return next;
	}
	
	public LinkListNode(int data){
		this.data = data;
	}
	
	public int getCircularNodePosition(LinkListNode head){
		LinkListNode slow = head;
		LinkListNode fast = head;
		slow = slow.next;
		fast = fast.next.next;
		while(slow!= null && fast !=null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow.getData() == fast.getData()){
				break;
			}
		}
		slow = head;
		while(slow.getData()!=fast.getData()){
			slow= slow.next;
			fast=fast.next;
		}
		
		return fast.getData();
	}
}
