/**
 * 
 */

/**
 * @author Alan Tse
 * @Program Description: Demo Files for COMP1011 Lesson 03
 * @version 0.2 - Added Vehicle class
 *
 */
public class Project {

	/**
	 * Main Method for Project
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vehicle myHonda = new Vehicle(4, 4, "Black", "Honda", "Pilot", "2015");
		SUV myHonda = new SUV("Black", "Honda", "Pilot", "2015");
		
		Truck myFord = new Truck(6,3,"White", "Ford", "FX", "2008");
		
		for (int seconds = 0; seconds < 10; seconds++) {
			myHonda.accelerate();
			myFord.accelerate();
		}
        System.out.println("Vehicle speed: " + myHonda.getSpeed());
        System.out.println("Truck speed: " + myFord.getSpeed());
	}

}
