
class Parking{
    private byte freePlaces; 
    private Car place1A;
    private Car place1B;
    private Car place1C;
    private Car place2A;
    private Car place2B;
    private Car place2C;
    
	public Parking() {
		this.freePlaces = 6;
	}
	 
	public void parkCar(Car c, String place) {
		if (place.equals("1A") && place1A == null) {
			place1A = c;
			freePlaces--;
		}
			
		else if (place.equals("1B") && place1B == null) {
			place1B = c;
			freePlaces--;
		}
			
		else if (place.equals("1C") && place1C == null) {
			place1C = c;
			freePlaces--;
		}
			
		else if (place.equals("2A") && place2A == null) {
			place2A = c;
			freePlaces--;
		}
			
		else if (place.equals("2B") && place2B == null) {
			place2B = c;
			freePlaces--;
		}
			
		else if (place.equals("2C")  && place2C == null) {
			place2C = c;
			freePlaces--;
		}
			
		else
			System.err.println("PARKING PLACE " + place + " IS OCCUPIED!");
	}
	public void printFreePlaces() {
		System.out.println(freePlaces);
	}
	
	public void printMap() {
		System.out.println("-----------------");
		System.out.printf("| %s\t|%s\t|\n", checkPlace(place1A), checkPlace(place2A));
		System.out.println("-----------------");
		System.out.println("-----------------");
		System.out.printf("| %s\t|%s\t|\n", checkPlace(place1B), checkPlace(place2B));
		System.out.println("-----------------");
		System.out.println("-----------------");
		System.out.printf("| %s\t|%s\t|\n", checkPlace(place1C), checkPlace(place2C));
		System.out.println("-----------------");
	}
	
	public String checkPlace(Car place) {
		if(place != null)
			return place.print();
		else
			return "0";
	} 
}