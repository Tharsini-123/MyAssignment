package week1.day2;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library libobj2 = new Library();
		
		String book2 = libobj2.addBook("PS II");
		System.out.println(book2);
		
		libobj2.issueBook();
	}

}
