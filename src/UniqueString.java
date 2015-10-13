
public class UniqueString {
	public boolean getUnique(String str){
		int i =0;
		int checker =0;
		while(i<str.length()){
			int val = str.charAt(i)-'a';
			if((checker & (1<<val))>0){
				return false;
			}
			checker = checker | (1<<val);
			i++;
		}
		
		return true;
	}
}
