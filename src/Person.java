import java.util.ArrayList;
public class Person {
	private ArrayList<Integer> friendIds;
	private int personId;
	
	public Person(int id){
		this.personId = id;
	}
	
	public int getId(){
		return personId;
	}
	
	public void addFriend(int id){
		friendIds.add(id);
	}
}
