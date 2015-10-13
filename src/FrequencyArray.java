
public class FrequencyArray {

	public static void getNewString(String str, int start){
		StringBuffer stringBuffer = new StringBuffer();
		int count =1;
		int length = str.length();
		for(int i =1; i<length; i++){
			if(str.charAt(i) == str.charAt(i-1)){
				count++;
			}
			else{
				stringBuffer.append(str.charAt(i-1)+Integer.toString(count));
				count =1;
			}
		}
		stringBuffer.append(str.charAt(length-1)+Integer.toString(count));
		System.out.println(stringBuffer);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "aabbbbbbbccddaa ddd";
		getNewString(string, 0);
	}

}
