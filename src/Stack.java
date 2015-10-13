
public class Stack {
	LinkListNode top;
		
	public void push(int data){
		LinkListNode node = new LinkListNode(data);
		node.data = data;
		node.setNextNode(top);
		top = node;
	}
	
	 public LinkListNode pop(){
		 if(top == null)
			 return null;
		 LinkListNode item = top;
		 top = top.getNextNode();
		 
		 return item;
	 }
}
