package week1.day2;

public class Library {
	
	public String addBook(String bookTitle){
		// TODO Auto-generated method stub
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) {
		Library libObj = new Library();
		
		String book = libObj.addBook("PSI");
		System.out.println(book);
		
		libObj.issueBook();
	}

}
