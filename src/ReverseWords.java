import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseWords{
	private String word;
	public ReverseWords(String w){
		this.word = w;
	}
	
	public String reverse(){
		Stack<String> st = new Stack<String>();
		StringBuilder sb = new StringBuilder();
		
		if(this.word.equals(null) || this.word.trim().equals("")){
			return null;
		}
		
		StringTokenizer s = new StringTokenizer(this.word);
		if(s.countTokens()== 1){
			return "";
		}
		while(s.hasMoreTokens())
		{
				String token = (String)s.nextElement();
				st.push(token);
		}
			
		while(!st.empty()){
				sb.append(st.pop()+" ");
		}	
		
		return sb.toString();
	}
}
