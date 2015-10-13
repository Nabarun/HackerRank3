import com.sun.beans.editors.IntegerEditor;

public class PrimitiveObject {
	Integer i;
	int j;
	
	public static void main(String[] args){
		PrimitiveObject o = new PrimitiveObject();
		o.go();
	}
	
	private void go(){
		i= new Integer(0);
		j=1000000000;
		double floatNum = 100000000.8908;
		System.out.println(String.format("%d", "*"));
		System.out.println(i);
	}
}
