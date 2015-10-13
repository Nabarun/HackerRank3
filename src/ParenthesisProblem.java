import java.util.Set;
import java.util.HashSet;;
public class ParenthesisProblem {
	public static Set<String> generateParenthsis(int remaining){
		Set<String> set = new HashSet<String>();
		if(remaining == 0){
			set.add("");
		}
		else{
			Set<String> prev = generateParenthsis(remaining -1);
			for(String str: prev){
				for(int i=0; i<str.length(); i++){
					if(str.charAt(i) == '('){
						String s = insertInside(str, i);
						set.add(s);
					}					
				}
				set.add("()"+str);
			}
		}
		return set;
	}
	
	public static String insertInside(String str, int leftIndex){
		String left = str.substring(0, leftIndex+1);
		String right = str.substring(leftIndex +1, str.length());
		return left +"()"+right;
	}
	
	public static void main(String[] args){
		Set<String> result = generateParenthsis(3);
		for(String i: result){
			System.out.println(i);
		}
	}
}
