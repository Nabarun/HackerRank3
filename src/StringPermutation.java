import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringPermutation {
	protected static void perm(String str, int index, int last){
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
		while((str=reader.readLine())!= null){
			
		}
		if (index == last-1)
			System.out.println(str);
		else
		{
			for(int i= index; i< last; i++){
				str = new String(swap(str,i, index));
				perm(str, index+1, last);
				str = new String(swap(str, i, index));
			}
		}
	}
	
	protected static char[] swap(String str, int pos1, int pos2){
		char[] arr = str.toCharArray();
		char temp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = temp;
		
		return arr;
	}

	public static void main(String[] args){
		String str = "abcd";
		perm(str, 0, str.length());
	
	}
}