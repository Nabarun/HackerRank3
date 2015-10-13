
public class ReverseCode {
	protected boolean reverseString(String str){
		int start =0;
		int end = str.length()-1;
		while(start+1<str.length() && end >0){
			int val1 = str.charAt(start+1)-str.charAt(start);
			int val2 = str.charAt(end)-str.charAt(end-1);
			if(val1 != val2)
				return false;
			start++;
			end--;
		}
		
		return true;
	}	
}
