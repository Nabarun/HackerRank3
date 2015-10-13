class StaticSuper{
	static{
		System.out.println("super satic block");		
	}
	
	StaticSuper(){
		System.out.println("super construcor");
	}
}
public class Statictest extends StaticSuper{
	static int rand;
	static{
		rand = (int) (Math.random() * 6);
		System.out.println("static block "+rand);
	}
	
	Statictest(){
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("in main");
		Statictest st = new Statictest();
	}

}
