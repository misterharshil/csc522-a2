import java.util.ArrayList;

/**
 * Created by harshil on 9/28/16.
 */
public class Student{
    String fname;
    String lname;
            String course;
    int ID;
    public void Student(String fname,String lname,String course,int ID) {
        this.fname = fname;
        this.lname = lname;
        this.course = course;
        this.ID = ID;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }


}
