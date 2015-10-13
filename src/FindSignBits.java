
public class FindSignBits {
	public static int findTheGreaterNumber(int a, int b){
		int k = sign(a-b);
		int q = flip(k);
		return a*k + b*q;
	}
	
	public static int sign(int a){
		return flip((a>>31) & 0x1);
	}
	
	public static int flip(int bit){
		return 1^bit;
	}
	
	public static void main(String[] args){
		int a = 345;
		int b = 321;
		int c = findTheGreaterNumber(a,b);
		System.out.println(c);
	}
}
