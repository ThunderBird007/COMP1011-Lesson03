/**
 * 
 */

/**
 * @author tsea Class Description: Creating a vehicle class to use as a
 *         superclass for all other vehicle subclasses
 * 
 */
public class Vehicle {
	private int numWheels = 4;
	private int numDoors = 2;
	private String colour = "";
	private String make = "";
	private String model = "";
	private String year = "";
	private float speed = 0;
	private final int MAX_SPEED = 40;

	public int getNumWheels() {
		return this.numWheels;
	}
	
	public int getNumDoors() {
		return this.numDoors;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String getColour() {
		return this.colour;
	}
	
	public float getSpeed() {
		return this.speed;
	}
	
	public Vehicle() {

	}
	public void accelerate() {
		this.speed += 4;
		if (this.speed >= this.MAX_SPEED) {
			this.speed = this.MAX_SPEED;
		}
	}

	public void decelerate() {
		this.speed -= 6;
		if (this.speed < 0) {
			this.speed = 0;
		}
	}

	public void turnLeft() {
		System.out.println("Turning Left");
	}

	public void turnRight() {
		System.out.println("Turning Right");
	}


}
