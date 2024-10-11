package Basic;
import java.util.ArrayList;

public class Courses {
    String courseName;
    String professorName;
    int year;
    ArrayList<students> students = new ArrayList<>();

    public Courses(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
    }

    public void enroll(students student) {
        
            if (!students.contains(student)) {
                students.add(student);
            }
        
    }

    public void unEnroll(students student){
        students.remove(student);
    }
    public int countStudents(){
        return students.size();
    }

    public int bestGrade(){
        int best = 0;
        for (students student : students) {
            if (student.grade > best) {
                best = student.grade;
            }
        }
        return best;
    }

    public void enroll(students[] students){
        
        
     }
    public static void main(String[] args) {
        Courses c = new Courses("Computer Science", "Vinod Bhatiya",2005);
        students ss = new students();
        c.enroll(ss);
        System.out.println("Count of Students:" +c.countStudents());
        System.out.println("Student Best Grade:" +c.bestGrade());
        c.unEnroll(ss);
        System.out.println("Count of Students:" +c.countStudents());
        
    }
}
