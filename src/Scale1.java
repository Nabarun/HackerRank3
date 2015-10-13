import java.util.HashMap;
public class Scale1 {
	HashMap<Integer, Scale1Machine> machines = new HashMap<Integer, Scale1Machine>();
	HashMap<Integer, Integer> personToMachineMap = new HashMap<Integer, Integer>();
	
	public Scale1Machine getMachineWithId(int machineId){
		return machines.get(machineId);
	}
	
	public int getMachineIdForUser(int personId){
		Integer machineId = personToMachineMap.get(personId);
		return machineId==null ? -1 : machineId;
	}
	
	public Person getPersonWithId(int personId){
		Integer machineId = personToMachineMap.get(personId);
		if(machineId == null)
			return null;
		
		Scale1Machine machine = getMachineWithId(machineId);
		if(machine == null)
			return null;
		return machine.getPersonWithId(personId);
	}
}


