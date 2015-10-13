import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Class {
	@SuppressWarnings("unchecked")
	public ArrayList<Object> GetStudents(){
		ArrayList<Object> students = new ArrayList<Object>();
		students.add(new StudentRecord("F",123));
		students.add(new StudentRecord("G",123));
		students.add(new StudentRecord("B",123));
		students.add(new StudentRecord("S",123));
		students.add(new StudentRecord("B",123));
		students.add(new StudentRecord("A",123));
		
		//StudentRecord s = new StudentRecord();
		//Collections.sort(students,s);
		return students;
	}
}
