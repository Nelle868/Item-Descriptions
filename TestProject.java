
public class TestProject {				//driver class

	
	public final int ARRAY_LENGTH = 9;
	static int moviecount = 0;
	static int bookcount = 0;
	static int cdcount = 0;
	

	public static void main(String[] args) {
		
		// 5 books
		Book book1 = new Book("The Art of Happiness", "the Dalai Lama", 15.00);
		Book book2 = new Book("6/19/1999");
		Book book3 = new Book(567);
		Book book4 = new Book(1001, "8/7/1929");
		Book book5 = new Book();
		
		//2 movies
		Movie movie1 = new Movie();
		Movie movie2 = new Movie(90);
		
		//2 CDs
		CD cd1 = new CD();
		CD cd2 = new CD(15);
		
		
		
		Item [] itemList = new Item[9];
		//this block of code is only being used because the assignment 
		//instructions explicitly said to use the above line of code.
		//an array list would have been most efficient. 
		//**********************
		itemList[0] = book1;//**
		itemList[1] = book2;//**
		itemList[2] = book3;//**
		itemList[3] = book4;//**
		itemList[4] = book5;//**
		itemList[5] = movie1;//*
		itemList[6] = movie2;//*
		itemList[7] = cd1;//****
		itemList[8] = cd2;//****
		//**********************
		
		System.out.println("The Item array has been created...");
		for (Item list : itemList) {
			System.out.println(list);
		}
		
		// ****** Books and the Shelf ****** //
		
		Bookshelf loneShelf = new Bookshelf();
		loneShelf.displayShelf();
		
//		

		System.out.println("Adding books to the shelf...");
		System.out.println();

		for(int a = 0; a < itemList.length; a++) {
			//add books from array itemList to Bookshelf array
			if (a < loneShelf.BOOKSHELF_MAX) {
				loneShelf.addBook(itemList[a]);
				
			//print the page count
				bookcount++;
				System.out.print("Book " + bookcount +" page count: ");
				System.out.println(loneShelf.getPageCount(itemList[a]));
			}
				
			//print movie length
			else if(itemList[a] instanceof Movie) {
				moviecount++;
				System.out.println("Movie " + moviecount + " length is " + ((Movie)itemList[a]).getLength() + ".");
				
			}
			
			//print cd track count
			else if(itemList[a] instanceof CD) {
				cdcount++;
				System.out.println("CD " + cdcount + " track count is " + ((CD)itemList[a]).getTrackCount() + ".");
			}
				
			
			
		}
		//Print bookshelf content
		loneShelf.displayShelf();
		
		//create a new book
		Book book6 = new Book("Java Book", "by Laing, Pearson", 200.00, 2016, "2016");
		
		//add to the bookshelf
		System.out.println("Attempting to add a book...");
		loneShelf.addBook(book6);
		
		System.out.println("Removing a book to fit this one...");
		loneShelf.removeBook(book5);
		
		loneShelf.displayShelf();
		
		System.out.println("Attempting to add a book again...");
		loneShelf.addBook(book6);
	
		

		
		System.out.println("Adding data to the books...");
		
		book1.setPages(600);
		book1.setDate("3/9/2003");
		
		book2.set_Title("Rich Dad, Poor Dad");
		book2.setPages(250);
		book2.setDescription("managing finances");
		book2.setPrice(15.00);

		book3.set_Title("Power");
		book3.setDate("9/25/2001");
		book3.setDescription("power and manipulation");
		book3.setPrice(22.00);
	
		book4.set_Title("The Mountain is You");
		book4.setDescription("self help");
		book4.setPrice(11.00);

		book5.set_Title("Becoming");
		book5.setDescription("the biography of Michelle Obama");
		book5.setPrice(20.00);
		book5.setDate("5/8/2013");
		book5.setPages(560);

		loneShelf.displayShelf();
		
		
		System.out.println("Adding movie data...");
		System.out.println();
		movie1.set_Title("The Last Kingdom");
		movie1.setDescription("Vikings");
		movie1.setPrice(5);
		movie1.setLength(75);
		System.out.println(movie1.toString());
		
		movie2.set_Title("Titanic");
		movie2.setDescription("Rose not sharing the plank");
		movie2.setPrice(20);
		movie2.setLength(140);
		System.out.println(movie2.toString());
		System.out.println();
		
		System.out.println("Adding CD data...");
		System.out.println();
		cd1.set_Title("Made in Lagos");
		cd1.setDescription("African music");
		cd1.setPrice(15.00);
		cd1.setTrackCount(19);
		System.out.println(cd1.toString());
		
		cd2.set_Title("Love Deluxe");
		cd2.setDescription("classic soul/jazz music");
		cd2.setPrice(15.00);
		cd2.setTrackCount(10);
		System.out.println(cd2.toString());
		System.out.println();
		System.out.println();
		
		//Print the content of array
		System.out.println("Last content of the Item array: ");
		for (Item list : itemList) {
			System.out.println(list);
		}
		System.out.println();


	}
	
}


