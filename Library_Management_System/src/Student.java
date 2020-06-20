<<<<<<< HEAD
//ögrenci icin sahip oldugu kitapları bastırıp
// ona göre sure uzatma talebi gönderebilir

import java.util.ArrayList;

public class Student extends User {

    private Integer tableCounter;   // max 1
    private Integer bookCounter;    // max 5
    private String myTable;     //objeler yerine id tutuyorum
    private ArrayList<Book> myBook;     //objeler yerine id tutuyorum
=======
import java.util.ArrayList;
import java.util.Scanner;

public class Student extends User {
    public static final Integer MAX_TABLE_COUNT = 1;
    public static final Integer MAX_BOOK_COUNT = 5;
    private Integer tableCounter;
    private Integer bookCounter;
    private String my_table;
    private ArrayList<Book> my_book;

>>>>>>> 3438362a2510b9fd78973b91e6a3357fadbdce14
    public Student(String name, String surname, String ID, String password) {
        super(name, surname, ID, password);
        tableCounter = 0;
        bookCounter = 0;
    }

<<<<<<< HEAD

    public void requestBook(String bookID){
        //  Book new_book = LibrarySystem.requestBook(this.getID(),bookID);
        //    if(new_book != null){   //sistemde öğrenicinin 5 den az kitabı olduğu kontrol edildi
        //sistemdeki data update edildi kitap öğrenciye verildi.
        // burda sadece hangi kitaplara ve masaya sahip olduğumu bilmek için id tutuyorum
        //     my_book.add(new_book);
        //      bookCounter++;
        //  }
    }
    public void reserveTable(String tableID){
        if(this.getTableCounter() == 0)
           // LibrarySystem.acceptRejectTableReservation(this,tableID);
            return;
        else
            System.out.println("Reservation denied by system.\nYou still have a reserved table. You can't reserve more than 1 table at the same time.");



        // Table new_table = LibrarySystem.requesBook(this.getID(),tableID);
        //    if(new_table != null){   //sistemde öğrenicinin başka masada olmadığı kontrol edildi
        //sistemdeki data update edildi kitap öğrenciye verildi.
        // burda sadece hangi kitaplara ve masaya sahip olduğumu bilmek için id tutuyorum
=======
    public Integer getTableCounter() {
        return tableCounter;
    }

    public void setTableCounter(Integer tableCounter) {
        this.tableCounter = tableCounter;
    }

    public Integer getBookCounter() {
        return bookCounter;
    }

    public void setBookCounter(Integer bookCounter) {
        this.bookCounter = bookCounter;
    }

    public void requestBook(String bookID){
        //  Book new_book = LibrarySystem.requestBook(this.getID(),bookID);
        //  if(new_book != null){
        //     my_book.add(new_book);
        //     bookCounter++;
        //  }
    }

    public void reserveTable(String tableID){
       // String new_table = LibrarySystem.requesBook(this.getID(),tableID);
        //    if(new_table != null){
>>>>>>> 3438362a2510b9fd78973b91e6a3357fadbdce14
        //      my_table = new_table;
        //      tableCounter ++;
        //  }
    }
<<<<<<< HEAD
    public void extendTimeBook(){
        //kitapları bastır
        // uzatmak istediğin kitabiın id sini gir.
    }
    public void extendTimeTable(){
        if(this.getTableCounter() == 1)
            //LibrarySystem.approveTableTimeExtend(this);
            return ;
        else
            System.out.println("Permission denied by system.\nYou don't have any reserved table.");


        // LibrarySystem.extendTimeTable(this.getID(),my_table.getID());
    }

    public void takeBreak(){
        // LibrarySystem.takeBreak(this.getID(),my_table.getID());
    }
    public void leaveTable(){
        // LibrarySystem.leaveTable(this.getID(),my_table.getID());
    }
    public void checkTableTime(){
        // LibrarySystem.checkTableTime(this.getID(),my_table.getID());
    }
    public void checkBookTime(){
        //kitapları bastır
    }

    public Integer getTableCounter() {
        return tableCounter;
    }
    public void setTableCounter(Integer tableCounter) {
        this.tableCounter = tableCounter;
    }
    public Integer getBookCounter() {
        return bookCounter;
    }
    public void setBookCounter(Integer bookCounter) {
        this.bookCounter = bookCounter;
    }

    public String getMyTable() {
        return myTable;
    }

    public void setMyTable(String myTable) {
        this.myTable = myTable;
    }
}
=======

    public void extendTimeBook(){
        checkBookTime();
        System.out.println(ANSI_RED + "PLEASE ENTER BOOK ID");
        Scanner scanner = new Scanner(System.in);
        String bookID = scanner.next();
        // LibrarySystem.extendTimeBook(bookID);
    }

    public void extendTimeTable(){
       // LibrarySystem.extendTimeTable(this.getID(),my_table.getID());
    }

    public void takeBreak(){
       // LibrarySystem.takeBreak(this.getID(),my_table.getID());
    }

    public void leaveTable(){
        // LibrarySystem.leaveTable(this.getID(),my_table.getID());
    }

    public void checkTableTime(){
        // LibrarySystem.checkTableTime(this.getID(),my_table.getID());
    }

    public void checkBookTime(){
        for (Book book : my_book) {
            System.out.println(ANSI_GREEN + "BOOK NAME : " + book.getName()
                    + " BOOK ID : " + book.getID() +  " REMAINING TIME : " + book.getTime() + ANSI_RESET);
        }
    }
}
>>>>>>> 3438362a2510b9fd78973b91e6a3357fadbdce14
