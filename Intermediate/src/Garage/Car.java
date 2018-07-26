package Garage;

public class Car extends Vehicle {

	private String classType;
	private int carRepair;

	Car(int id, String type, String brand, String model, int year, int door, int wheel, String classType, int cPriceRepair) 
	{
		super(id, type, brand, model, year, door, wheel);
		this.classType = classType;
		this.carRepair = cPriceRepair;
	}

	String getClassType() 
	{
		return classType;
	}
	
	int getCarRepair()
	{
		return carRepair;
	}

	void print() 
	{
		super.print();
		System.out.println("Class: " + classType );
	}

}

