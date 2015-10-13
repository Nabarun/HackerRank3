import java.util.Scanner;
import org.junit.*;
public class UnitTestSet {
	@Test
	public void verifyUniqueCharacters(){
		Scanner s = new Scanner(System.in);
		String str = "abcbde";
		UniqueString unique = new UniqueString();
		boolean result = unique.getUnique(str);
		Assert.assertSame(result, true);
	}
	
	@Test
	public void verifyDuplicateCharacters(){
		Scanner s = new Scanner(System.in);
		
		String str = "zyz";
		UniqueString unique = new UniqueString();
		boolean result = unique.getUnique(str);
		Assert.assertSame(result, false);
	}
	
	@Test 
	public void reverseCodeTest(){
		
		ReverseCode reverse = new ReverseCode();
		Boolean resp = reverse.reverseString("acxz");
		if(resp){
			System.out.println("Funny");
		}
		else{
			System.out.println("Not Funny");
		}
		
		resp = reverse.reverseString("bcxz");
		if(resp){
			System.out.println("Funny");
		}
		else{
			System.out.println("Not Funny");
		}
	}
	
	@Test
	public void VerifyCircularLinkList(){
		LinkListNode node = new LinkListNode(10);
		node.next = new LinkListNode(20);
		node.next.next = new LinkListNode(30);
		node.next.next.next = new LinkListNode(40);
		node.next.next.next.next = new LinkListNode(50);
		node.next.next.next.next.next = node.next.next;
		
		int circularPosition = node.getCircularNodePosition(node);
		System.out.println(circularPosition);
		Assert.assertEquals(30,circularPosition);
	}
	
	@Test
	public void verifyMatrixOptimizedParanthesis()
	{
		int[][] resultant = new int[4][4];
		int[][]a = randMatrixCreation(2,3);
		int[][]b = randMatrixCreation(3,4);
		int[][]c = randMatrixCreation(4,6);
		int[][]d = randMatrixCreation(6,8);
		
		for(int i=0;i<4;i++){
			for(int j=0; j<4;j++){
				if(i==j){
					resultant[i][j] = 0;
				}
				if(i==0 && j==1){
					//resultant[i][j]= Math.min(a.length * a[i].length*b[i].length +)
				}
			}
		}
	}
	
	@Test
	public void VerifyTowerOfHanoi(){
		Stack st1 = new Stack();
		Stack st2 = new Stack();
		Stack st3 = new Stack();
		
		st1.push(10);
		st1.push(8);
		st1.push(6);
		st1.push(4);
		st1.push(2);
		st1.push(0);
		
		ToweOfHanoi tower = new ToweOfHanoi();
		LinkListNode node =st1.pop();
		if(st2.top == null){
			st2.push(node.data);
		}
		while(node !=null){
			tower.movePlates(st1,st2,st3);
			node = st1.pop();
		}
		
		LinkListNode expectedNode = st3.pop();
		Assert.assertSame(expectedNode.getData(), 0);
		
	}
	
	@Test
	public void VerifyQueueOperationUsingStack(){
		Queue queue = new Queue();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(60);
		queue.enqueue(70);
		
		int item = queue.dequeue();
		
		Assert.assertSame(10, item);
	}
	
	public int[][] randMatrixCreation(int i, int j){
		int count =0;
		int[][] arr = new int[i][j];
		for(int loop=0; loop<i; loop++){
			for(int innerloop =0; innerloop<j; innerloop++){
				arr[i][j]=count;
				count++;
			}
		}
		return arr;
	}
}
