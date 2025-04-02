public class LibraryTester {
    public static void main(String[] args) {
        BookShelf shelfO = new BookShelf('O');
        BookShelf shelfT = new BookShelf('T');
        
        System.out.println(shelfO);
        System.out.println(shelfT);
        
        Book book1 = new Book("The Heart of the Betrayed", "Crime");
        Book book2 = new Book("Our Hill of Stars", "Fantasy");
        Book book3 = new Book("One of a Kind", "Science Fiction");
        Book book4 = new Book("The Vision of Roses", "Romance");
        
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);
        
        shelfO.addBook(book1);
        shelfO.addBook(book2);
        shelfO.addBook(book3);
        shelfO.addBook(book4);
        
        shelfT.addBook(book1);
        shelfT.addBook(book2);
        shelfT.addBook(book3);
        shelfT.addBook(book4);
        
        System.out.println(shelfO);
        System.out.println(shelfT);
    }
}
