
class Car{
    private String model;
  //  private String id;
    
    Car(String model){
    	setModel(model);
   // 	setId(id);
    }

	public String getModel() {
		return model;
	}
	

	public void setModel(String model) {
		if(model.equals("BMW") || model.equals("Mercedes") || model.equals("Fiat")) {
			this.model = model;
		}
		else
			System.err.println("Only models BMW, Mercedes and Fiat are available!");
	}
	
	public String print() {
		return model;
	}
    
//	public String getId() {
//		return id;
//	}
//
//	public void setId(String id) {
//		if(id.trim().length() != 0) {
//    		this.id = id;
//    	}
//    	else
//    		System.err.println("ID of the car can't be empty!");
//	}
}    