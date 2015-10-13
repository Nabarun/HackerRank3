import java.util.Scanner;
import java.util.StringTokenizer;

public class SortingUsingTreeSetTest {
	public static void main(String[] args){
		try{
			
			SortingUsingTreeSet sortSet = new SortingUsingTreeSet();
			Scanner s = new Scanner(System.in);
			String input = s.nextLine();
			StringTokenizer st = new StringTokenizer(input);
			while(st.hasMoreTokens()){
				int num = Integer.parseInt(st.nextToken());
				sortSet.insert(num);
			}
			//Display all the sorted elements
			sortSet.sort();
			
		}
		catch(NumberFormatException ex){
			System.out.println("Bad format");
		}
	}
}
