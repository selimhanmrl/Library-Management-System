import java.util.ArrayList;
import java.util.Scanner;

class LibrarySystem<E> {
    ArrayList<Librarian> librarian = new ArrayList<>();
    ArrayList<Student> student = new ArrayList<>();

    Object login(String Id,String password){
        for (int i = 0; i < librarian.size() ; i++) {
            if(librarian.get(i).getId().equals(Id) && librarian.get(i).getPassword().equals(password))
                return librarian.get(i);
        }
        for (int i = 0; i < student.size() ; i++) {
            if(student.get(i).getId().equals(Id) && student.get(i).getPassword().equals(password))
                return student.get(i);

        
        }
        Object a = SignUp( Id,password);
        return a;
    }
    Object SignUp(String Id,String password){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("1 - Librarian");
        System.out.println("1 - Student");
        System.out.println("Enter Choice");
        int a = myObj.nextInt();
        if (a == 1)
            return new Librarian(Id,password);
        else if (a == 2)
            return new Student(Id,password);
        else
            return null;
    }
}
