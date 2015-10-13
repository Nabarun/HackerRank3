
public class Queue {
	LinkListNode top;
	Stack st1;
	Stack st2;
	public Queue(){
		st1= new Stack();
		st2= new Stack();
	}
	public void enqueue(int item){
		st1.push(item);		
	}
	
	public int dequeue(){
		LinkListNode node = st1.top;
		while(node!= null){
			st2.push(node.data);
			node = st1.pop();
		}
		
		return st2.pop().getData();
	}
}
