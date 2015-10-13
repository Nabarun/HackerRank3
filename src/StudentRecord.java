import java.util.Comparator;

public class StudentRecord implements Comparator<StudentRecord> {
	
	private String Name;
	private int RollId;
	
	public StudentRecord(String name, int rollId){
		this.Name = name;
		this.setRollId(rollId); 
	}
	
	public StudentRecord(){
		
	}
	
	public String getName(){
		return Name;
	}

	public int getRollId() {
		return RollId;
	}

	public void setRollId(int rollId) {
		RollId = rollId;
	}

	

	@Override
	public int compare(StudentRecord student1, StudentRecord student2) {
		// TODO Auto-generated method stub
		return student1.getName().compareTo(student2.getName());
	}
}
