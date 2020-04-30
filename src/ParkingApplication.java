
public class ParkingApplication {

	public static void main(String[] args) {
		Parking parkingPlaces = new Parking();
		Car c1 = new Car("BMW", "ABC-123");
		Car c2 = new Car("Fiat", "HIL-513");
		Car c3 = new Car("Mercedes", "WAT - 000");
				
		System.out.println("c1.print(): " + c1.print());
		System.out.println("c2.print(): " + c2.print());
		System.out.println("c3.print(): " + c3.print());
		
		System.out.println("Total free parking places:");
		parkingPlaces.printFreePlaces();
		parkingPlaces.parkCar(c1,"2A");
		parkingPlaces.parkCar(c2,"1C");
		parkingPlaces.parkCar(c3,"2A"); //ERROR: OCCUPIED
		parkingPlaces.printMap();
		System.out.println("Free parking places:");
		parkingPlaces.printFreePlaces();
		
	}

}



