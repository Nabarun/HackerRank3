import java.util.HashMap;

public class Scale1Machine {
	public HashMap<Integer, Person> persons = new HashMap<Integer, Person>();
	
	public int machineId;
	
	public Person getPersonWithId (int personId){
		return persons.get(personId);
	}
}
