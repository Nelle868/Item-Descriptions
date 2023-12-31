
public class Movie extends Item{

	private int length;		//minutes 

	
	// ****** Constructors ****** //

	public Movie() {
		super();
		length = 0;
	}
	
	public Movie(int newLength) {
		super();
		length = newLength;
	}
	
	public Movie(String name, String desc, double cost, int newLength) {
		super();
		length = newLength;
	}
	
	
	// ****** Getters ****** //
	
	public String getLength() {
		return length + " minutes long";
	}
	
	public String getLength(Item item) {
		return ((Movie) item).length + " minutes long";
	}
	
	
	// ****** Setters ****** //
	
	public void setLength(int newLength) {
		length = newLength;
	}
	
	
	
	@Override
	public String toString(){					//override toString()
		return "A movie called " + this.get_Title() + " about " + this.getDescription() + ". It costs $" + this.getPrice() + " and is " + this.getLength() + "."; 	//title, description, price, pages, copyright date
	}
}
