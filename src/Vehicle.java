/**
 * 
 */

/**
 * @author tsea Class Description: Creating a vehicle class to use as a
 *         superclass for all other vehicle subclasses
 * 
 */
public abstract class Vehicle {
	protected int numWheels = 4;
	protected int numDoors = 2;
	protected String colour = "";
	protected String make = "";
	protected String model = "";
	protected String year = "";
	protected float speed = 0;
	protected final int MAX_SPEED = 40;

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

	public Vehicle(int wheels, int doors, String colour, String make, String model, String year) {
		this.numWheels = wheels;
		this.numDoors = doors;
		this.colour = colour;
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public Vehicle(String colour, String make, String model, String year) {
		this.colour = colour;
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public abstract void accelerate();

	public abstract void decelerate();

	public void turnLeft() {
		System.out.println("Turning Left");
	}

	public void turnRight() {
		System.out.println("Turning Right");
	}

}
