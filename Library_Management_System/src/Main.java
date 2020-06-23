public class Main {

    public static void main(String[] args) {
        LibrarySystem<Book> a =new LibrarySystem<>();
        Book b = new Book("T1212412", "category", "name", "author");
        Book c = new Book("R121123412", "123", "123", "123");
        LibrarySystem.addBook(b);
        LibrarySystem.addBook(c);

        LibrarySystem.showBook();

       //System.out.println(LibrarySystem.books);
        LibrarySystem.removeBook("R121123412");
//        String asd = "T124";
//        char first = asd.charAt(0);
//        char[] others1 = new char[asd.length()-1];
//        asd.getChars(1,asd.length(),others1,0);
//        System.out.println(first);
//        System.out.println(others1);
    }
}
