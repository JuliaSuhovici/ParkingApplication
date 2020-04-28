
public class ParkingApplication {

	public static void main(String[] args) {
		Parking parkingPlaces = new Parking();
		Car c1 = new Car("BMW");
		Car c2 = new Car("Fiat");
		Car c3 = new Car("Mercedes");
				
		System.out.println("c1.print(): " + c1.print());
		System.out.println("c2.print(): " + c2.print());
		System.out.println("c3.print(): " + c3.print());
		
		System.out.println("Total free parking places:");
		parkingPlaces.printFreePlaces();
		parkingPlaces.parkCar(c1,"1A");
		parkingPlaces.parkCar(c2,"2C");
		parkingPlaces.parkCar(c3,"1A"); //ERROR: OCCUPIED
		parkingPlaces.printMap();
		System.out.println("Free parking places:");
		parkingPlaces.printFreePlaces();
		
	}

}



