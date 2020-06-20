public class Main {

    public static void main(String[] args) {
        LibrarySystem<Book> a =new LibrarySystem<>();
        Book b = new Book("T1212412", "category", "name", "author");
        Book c = new Book("T1212412", "category", "name", "author");
        LibrarySystem.addBook(b);
        System.out.println(LibrarySystem.books);
        LibrarySystem.removeBook(c);
//        String asd = "T124";
//        char first = asd.charAt(0);
//        char[] others1 = new char[asd.length()-1];
//        asd.getChars(1,asd.length(),others1,0);
//        System.out.println(first);
//        System.out.println(others1);
    }
}
