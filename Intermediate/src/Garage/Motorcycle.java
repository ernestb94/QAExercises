package Garage;

public class Motorcycle extends Vehicle {

	private String typeBike;
	private int bikeRepair;
	
	Motorcycle(int id, String type, String brand, String model, int year, int door, int wheel, String typeBike, int bikeRepair ) {
		super(id, type, brand, model, year, door, wheel);
		this.typeBike = typeBike;
		this.bikeRepair = bikeRepair;
	}
	
	String getBikeType() 
	{
		return typeBike;
	}
	
	int getBikeRepear()
	{
		return bikeRepair;
	}

	void print()
	{
		super.print();
		System.out.println("Type of bike: " + typeBike);
	}
	
}
