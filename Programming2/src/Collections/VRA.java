package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VRA {
	
	public static void main(String[] args) {
		
		Map<String, Cars> registeredCars = new HashMap<>();
		ArrayList <Cars> mycars = new ArrayList<>();
		
		mycars.add(new Cars ("Ford", "Escort", "BL 23500", 1000));
		registeredCars.put(mycars.get(0).getRegistration(), mycars.get(0));
		// associate the key registration with the value car object		
		mycars.add(new Cars("Renault", "Captur", "BS 32123", 1600));
		registeredCars.put(mycars.get(1).getRegistration(), mycars.get(1));
		// System.out.println(mycars.toString());
		
		// print out the keys registration numbers
		// System.out.println(registeredCars.keySet());
		
		// print values
		// System.out.println(registeredCars.values());
		
		// iterate over the registered cars
		Set<String> regNums = registeredCars.keySet();
		for(String reg : regNums) {
			System.out.println(registeredCars.get(reg));
		}

	}

}
