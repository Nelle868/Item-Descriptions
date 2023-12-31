
public class CD extends Item{

	private int trackCount;
	
	// ****** Constructors ****** //	
	
	public CD() {
		super();
		trackCount = 0;
	}

	public CD(int newTrackCount) {
		super();
		trackCount = newTrackCount;
	}
	
	public CD(String name, String desc, double cost, int newTrackCount) {
		super(name, desc, cost);
		trackCount = newTrackCount;
	}
	
	// ****** Getters ****** //
	
	public int getTrackCount() {
		return trackCount;
	}
	// ****** Setters ****** //
	
	public void setTrackCount(int newTrackCount) {
		trackCount = newTrackCount;
	}
	
	
	@Override
	public String toString(){					//override toString()
		return "A CD called " + super.get_Title() + " about " + this.getDescription() + ". It costs $" + this.getPrice() + " and has " + this.getTrackCount() + " tracks on it."; 	//title, description, price, pages, copyright date
	}
}
