package Garage;

public class Vehicle {

	private int id;
	private String type;
	private String brand;
	private String model;
	int year;
	int door;
	int wheel;

	Vehicle(int id, String type, String brand, String model, int year, int door, int wheel) 
	{
		this.id = id;
		this.type = type;
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.door = door;
		this.wheel = wheel;
	}

	int getID() 
	{
		return id;
	}
	
	String getType()
	{
		return type;
	}

	String getBrand() 
	{
		return brand;
	}

	String getModel() 
	{
		return model;
	}

	int getYear() 
	{
		return year;
	}
	
	int getDoor()
	{
		return door;
	}
	
	int getWheel()
	{
		return wheel;
	} 

	void print() {
		System.out.println("ID: " + id );
		System.out.println("Vehicle: " + type);
		System.out.println("Brand: " + brand );
		System.out.println("Model: " + model );
		System.out.println("Year: " + year );
		System.out.println("No. of Doors: " + door );
		System.out.println("No. of Wheels: " + wheel );
	}

}
