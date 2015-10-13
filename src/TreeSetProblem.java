import java.util.TreeSet;
public class TreeSetProblem {
	public static void main(String[] args){
		testTreeSetFeatures();
	}
	protected static void testTreeSetFeatures(){
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(4);
		set.add(5);
		set.add(2);
		set.add(8);
		set.add(1);
		set.add(3);
		set.add(7);
		
		System.out.println(set.pollLast());
	}
}
