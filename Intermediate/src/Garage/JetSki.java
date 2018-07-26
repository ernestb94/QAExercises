package Garage;

public class JetSki extends Vehicle {

	private String jType;
	private int jetRepair;

	JetSki(int id, String type, String brand, String model, int year, int door, int wheel, String jType,
			int jetRepair) {
		super(id, type, brand, model, year, door, wheel);
		this.jType = jType;
		this.jetRepair = jetRepair;

	}

	String getJType() {
		return jType;
	}

	int getJetRepair() {
		return jetRepair;
	}

	void print() {
		super.print();
		System.out.println("Type of Jet Ski: " + jType);
	}

}
