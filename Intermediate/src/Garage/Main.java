package Garage;

public class Main {

	public static void main(String[] args) {
		
		

		
		//Array of Vehicle
		//Vehicle [] vArray = new Vehicle[v];
		//for (int v = 0; v < vArray.length; v++) {
			
		//} 
		
		
		//Create Vehicle
		Car c = new Car (1,"Car", "Nissan","GTR", 2017, 2, 4, "Sports", 500);
		Motorcycle m = new Motorcycle (2, "Motorbike", "Harley-Davidson", "Softail", 2011, 0, 2, "Chopper", 250);
		JetSki j = new JetSki (3, "Jet Ski","Honda", "Aquatrax", 2004, 0, 0, "Solo Jet", 350 );
		
		//Print Vehicle

		c.print();
		System.out.println("--------------------------------------------");
		m.print();
		System.out.println("--------------------------------------------");
		j.print();
		
		
		
	}

}
