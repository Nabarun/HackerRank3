
import java.lang.reflect.Array;
import java.util.ArrayList;

public class StudentTest {
	public static void main(String[] args){
		Class c = new Class();
		ArrayList<Object> students = c.GetStudents();
		
		for(Object stud : students){
			System.out.println("Name: " + stud.hashCode());
		}
		
		int[] ae = new int[10];
		
	}
}
