/**
 * Created by harshil on 9/28/16.
 */
import java.util.*;
public class Main {

   static List<Student> StudentList;
    static String fname;
    static String lname;
    static String course;
   static int ID;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
            StudentList = new ArrayList<Student>();
             System.out.println("How many students do you want? ");
             int no = scan.nextInt();
        for(int i = 0;i<=no-1;i++) {
            System.out.println("Enter first name");

            fname = scan.next();
            System.out.println("Enter last name ");
            lname = scan.next();
            System.out.println("Enter your course ");
            course = scan.next();
            System.out.println("Enter your ID");
            ID = scan.nextInt();

            Student s = new Student();
            s.Student(fname, lname, course, ID);
            StudentList.add(s);
            System.out.println(s.getFname());

        }
        for(int i =0;i<=no-1;i++) {
            System.out.println()
        }

    }
}
