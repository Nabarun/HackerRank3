
public class Bitwise {
	public static int sample(){
		int mask = 0x0000f;
		int value = 0x22228;
		Integer num = Integer.parseInt(String.valueOf(mask), 10);
		System.out.println(num);
		return mask&value;
	}
	
	public static int bitSwapRequired(int a, int b){
		int count = 0;
		for(int c= a^b; c!= 0; c=c&(c-1)){
			count++;
		}
		return count;
	}
	public static void main(String[] args){
		int number = sample();
		System.out.println(number);
		
		int a = 5;
		int b = 15;
		int result = bitSwapRequired(5, 15);
		System.out.println(result);
	}
}
