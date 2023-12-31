
public class Bookshelf extends Book{

	
	private String name;
	public static final int BOOKSHELF_MAX = 5;
	private Book [] shelf = new Book [BOOKSHELF_MAX];
	private boolean trueOrFalse = true;
	private int availableIndex;
	private int availableSlots;

	// ****** Constructors ****** //	

	public Bookshelf() {										// Make each space on the shelf empty
		for (int a = 0; a< BOOKSHELF_MAX; a++) {
			shelf[a] = null; 
		}
	}
	
	// ****** Getters ****** //

	public void getShelfInfo(int counter){
		System.out.println(shelf[counter]);
	}
	
	public int getPageCount(Item item) {
		return ((Book) item).getPageCount();
	}
	
	// ****** Setters not necessary for this class ****** //
	
	// ****** Methods ****** //
	
		public int spaceCounter() {								// number of available spaces on the shelf
			for (int a = 0; a < BOOKSHELF_MAX; a++) {
				if (shelf[a] == null)
					availableSlots++;
			}
			return availableSlots;
		}
	
		public boolean roomAvailable() {						// determine which space is available, if any
			availableIndex = 0;
			availableSlots = 0;
			for (int a = 0; a< BOOKSHELF_MAX; a++) {
				if (shelf[a] == null) {
					trueOrFalse = true;
					availableIndex = a;
					return trueOrFalse;
				}	
			}
			trueOrFalse = false;
			return trueOrFalse;
		}
	
		public void addBook(Book newBook) {						// add a book in any open space
			if (this.roomAvailable() == true) {
				shelf[availableIndex] = newBook;
			}
			else System.out.println("Sorry, there is no space available for this book on the shelf.");
			this.displayShelf();
		}
		public void addBook(Item newBook) {						// add an item on the shelf 
			if (this.roomAvailable() == true) {
				shelf[availableIndex] = (Book) newBook;
			}
			else {
				System.out.println("Sorry, there is no space available for this book on the shelf.");
				this.displayShelf();
			}
		}
		
		public void addBook(Book newBook, int index) {			// add a book in a specific space in the array
			if ((index >= shelf.length) || (index < 0)|| (shelf[index] != null)) {
				System.out.println("Sorry, a book cannot be placed there.");
				this.displayShelf();
			
			}
			else 
				shelf[index] = newBook;
			
		}
		
		public void removeBook(Book book) {						// remove a book if it is on the shelf
			for (int a = 0; a < BOOKSHELF_MAX; a++) {
				if (shelf[a] == book)
					shelf[a] = null;
			}
		}
		
		public boolean isFull() {								// Is it full?
			for (int a = 0; a < BOOKSHELF_MAX; a++) {
				if (shelf[a] == null) {
					trueOrFalse = false;
					return trueOrFalse;
				}	
			}
			trueOrFalse = true;
			return trueOrFalse;
		}
		
		public boolean isEmpty() {								// Is it empty?
			for (int a = 0; a < BOOKSHELF_MAX; a++) {
				if (shelf[a] != null) {
					trueOrFalse = false;
					return trueOrFalse;
				}	
			}
			trueOrFalse = true;
			return trueOrFalse;
		}
		
		public int bookCount() {								// Number of books currently on the shelf
			int numberofbooks = 0;
			for (int a = 0; a< BOOKSHELF_MAX; a++) {
				if (shelf[a] != null) 
					numberofbooks++;
			}
			return numberofbooks;
		}
		
		public String toString(Item [] item){						
			System.out.println("There are " + this.bookCount() + " books on the shelf. ");
			int count = 1;
			for(int a = 0; a< this.bookCount(); a++) {
				System.out.print(count + ". ");
				System.out.println(item[a].toString());
				count++;
			}
			this.displayShelf();
			return "";
		}
		
		public void displayShelf() {							// Output the current shelf status
			System.out.println();
			System.out.println("Current Status of the bookshelf: ");
			
			if (this.isFull() == true)
				System.out.println("The shelf is full.");
			else if (this.isEmpty() == true)
				System.out.println("The shelf is empty");
			else System.out.println("The shelf has " + this.spaceCounter() + " space(s) available.");
			
			System.out.println(this.bookCount() + " books are on the shelf.");
			System.out.println();
			
			for(int a = 0; a < BOOKSHELF_MAX; a++) {
				System.out.println(shelf[a]);
			}
			System.out.println();
			
		}

}
