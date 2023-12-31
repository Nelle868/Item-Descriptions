
public class Item {
	
	
	
	private String title;
	private String description;
	private double price;

	// ****** Constructors ****** //

	public Item(){
		title = "None";
		description = "None";
		price = 0.00;
	}
	
	public Item(String newtitle, String newdescription, double newprice){
		
		title = newtitle;
		description = newdescription;
		price = newprice;
	}
	
	
	// ****** Getters ****** //
	double getPrice(){
		return price;
	}

	String getDescription() {
		return description;
	}
	
	String get_Title() {
		return title;
	}

	
	// ****** Setters ****** //
	void setPrice(double newPrice) {
		price = newPrice;
	}
	void setDescription(String newDescription) {
		description = newDescription;
	}
	void set_Title(String new_Title) {
		title = new_Title;
	}
	
	
}
