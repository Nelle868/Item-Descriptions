
public class Book extends Item{
	
	private int pageCount;
	private String copyrightDate;
	
	// ****** Constructors ****** //

		public Book() {
			super();
			pageCount = 0;
			copyrightDate = "None";
		}
		
		public Book(int updatePages) {
			super();
			pageCount = updatePages;
		}
		
		public Book(String date) {
			super();
			copyrightDate = date;
		}
		
		public Book(int pages, String date) {
			super();
			pageCount = pages;
			copyrightDate = date;
		}
		
		public Book(String name, String desc, double cost) {
			super(name, desc, cost);
		}
		
		public Book(String name, String desc, double cost, int pages, String date) {
			super(name, desc, cost);
			pageCount = pages;
			copyrightDate = date;
		}

	// ****** Getters ****** //
	
		public int getPageCount(){
			return pageCount;
		}
		
		public String getDate() {
			return copyrightDate;
		}
	
	// ****** Setters ****** //
	
		public void setPages(int pages) {
			pageCount = pages;
		}
		
		public void setDate (String date) {
			copyrightDate = date;
		}
		
		
		
		@Override
		public String toString(){					//override toString()
			return "A book called " + this.get_Title() + " about " + this.getDescription() + ". It costs $" + this.getPrice() + " and has " + this.getPageCount() + " pages. It was copyrighted " + this.getDate() + ". "; 	//title, description, price, pages, copyright date
		}
	
}
