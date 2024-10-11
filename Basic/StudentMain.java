package Basic;

import java.util.ArrayList;
class Student{

    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

    public Student(String firstName,String lastName,int registration,int grade,int year){
            this.firstName=firstName;
            this.lastName=lastName;
            this.registration=registration;
            this.grade=grade;
            this.year=year;


    }
    public Student(){

    }

    public void printFullName(){
            System.out.println(firstName + " " + lastName);
    }

    public boolean isApproved(){
            return grade >=60;

    }

    public void changeYearIfApproved(){
            if(isApproved()){
                year++;
                System.out.println("Congratulations! You have been promoted to year" + year);
            }
            else{
                System.out.println(" You have  not been promoted to year" );
            }
        
    }
}
class Course{

        String courseName;
        String  professorName;
        int year;
        ArrayList<Student> students;

        public Course(String courseName, String professorName, int year) {
            this.courseName = courseName;
            this.professorName = professorName;
            this.year = year;
            this.students = new ArrayList<>();  
        }


        public void enroll(Student student){
            students.add(student);
            System.out.println(student.firstName +"has been enrolled in" + courseName );
        }

        public void unEnroll(Student student){
            if(students.remove(student)){
                System.out.println(student.firstName + "has been enrolled from " + courseName);
            }
        }

        public int countStudents(){
            return students.size();
        }
 
        public int bestGrade(){
            int bestGrade=0;
            for(Student student: students){
            if(student.grade>bestGrade){
                bestGrade=student.grade;
    }}
            return bestGrade;
        }









}







 public class StudentMain{
    public static void main(String args[]){

        Student stud1=new Student("vishal","sharma",123,75,5);
        stud1.printFullName();
        System.out.println("is vishal approved:"+stud1.isApproved());
        stud1.changeYearIfApproved();

    }
}