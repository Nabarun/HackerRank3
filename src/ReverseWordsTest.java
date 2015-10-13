import java.util.Scanner;

public class ReverseWordsTest {

	public static void main(String[] args) {
		int count =1;
		System.out.println("Enter a word:");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for(int i=0; i<= num; i++){
			String word = s.nextLine();
			ReverseWords reverse = new ReverseWords(word);
			String rslt = reverse.reverse();
			if(rslt != null){
				
					System.out.println("Case #"+count+": "+rslt);
					count++;	
								
			}			
		}
	}

}
