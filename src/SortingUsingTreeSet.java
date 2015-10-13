import java.util.TreeSet;

public class SortingUsingTreeSet {
	static TreeSet<Integer> sortOrder = new TreeSet<Integer>();
	
	protected void insert(int num){
		sortOrder.add(num);
	}
	
	protected void sort(){
		System.out.println("Sorted Order:");
		for(int num : sortOrder){
			System.out.print(num + " ");
		}
	}
}
