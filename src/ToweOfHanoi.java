
public class ToweOfHanoi {
	public void movePlates(Stack st1, Stack st2, Stack st3){
		if(st3.top != null){
			LinkListNode node = st3.pop();
			while(node != null){
				st2.push(node.data);
				node = st3.pop();
			}
		}
		
		LinkListNode n = st1.pop();
		st3.push(n.data);
		LinkListNode tempNode = st2.pop();
		while(tempNode != null){
			st3.push(tempNode.data);
			tempNode = st2.pop();
		}
	}
}
