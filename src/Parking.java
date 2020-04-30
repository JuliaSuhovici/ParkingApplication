
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
			place1A = checkParkCar(c);
		}
			
		else if (place.equals("1B") && place1B == null) {
			place1B = checkParkCar(c);
		}
			
		else if (place.equals("1C") && place1C == null) {
			place1C = checkParkCar(c);
		}
			
		else if (place.equals("2A") && place2A == null) {
			place2A = checkParkCar(c);;
		}
			
		else if (place.equals("2B") && place2B == null) {
			place2B = checkParkCar(c);
		}
			
		else if (place.equals("2C")  && place2C == null) {
			place2C = checkParkCar(c);
		}
			
		else
			System.err.println("PARKING PLACE " + place + " IS OCCUPIED!");
	}
	
	public Car checkParkCar(Car c) {
		freePlaces--;
		return c;
	}
	public void printFreePlaces() {
		System.out.println(freePlaces);
	}
	
	public void printMap() {
		System.out.println("--------------------");
		System.out.printf("| %s\t  |%s\t   |\n", checkPlace(place1A), checkPlace(place2A));
		System.out.printf("| %s |%s |\n", checkId(place1A), checkId(place2A));
		System.out.println("--------------------");
		System.out.printf("| %s\t  |%s\t   |\n", checkPlace(place1B), checkPlace(place2B));
		System.out.printf("| %s |%s |\n", checkId(place1B), checkId(place2B));
		System.out.println("--------------------");
		System.out.println("--------------------");
		System.out.printf("| %s\t  |%s\t   |\n", checkPlace(place1C), checkPlace(place2C));
		System.out.printf("| %s |%s |\n", checkId(place1C), checkId(place2C));
		System.out.println("--------------------");
	}
	
	public String checkPlace(Car place) {
		if(place != null)
			return place.print();
		else
			return "0  ";
	} 
	public String checkId(Car place) {
		
		try {
			return place.getId();
		}
		catch(NullPointerException e){
			return "       ";
		}
			
	} 
}
