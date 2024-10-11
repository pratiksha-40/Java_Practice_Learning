package Basic;

import java.util.Scanner;

public class students {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
   //Default Syntax
    public students(){

    }
    //Paramerized Syntax
    public students(String firstName, String lastName,int registration,int grade,int year){
        this.firstName=firstName;
        this.lastName=lastName;
        this.registration=registration;
        this.grade=grade;
        this.year=year;
    }
    // Copy Constructor
    public students(students stu) {
        this.firstName=stu.firstName;
        this.lastName=stu.lastName;
        this.registration=stu.registration;
        this.grade=stu.grade;
        this.year=stu.year;

    }
    public void printFullname(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the registrationID:");
        registration= s.nextInt();
        System.out.println("Enter the FirstName:");
        firstName= s.next();
        System.out.println("Enter the LastName:");
        lastName= s.next();
    }
    public void isApproved(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the grade:");
        grade= s.nextInt();
        if(grade>=60){
          System.out.println(true);
        }
    }
    public int changeYearIfApproved(){
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the year:");
        year= s.nextInt();
        if(grade>=60){
            year++;
            System.out.println("Congratulation");
            System.out.println(year);
            
        }
        return year;
    }
    public static void main(String[] args) {
        students s1 = new students("Sakshi","Singh",101,60,2006);
        s1.printFullname();
        s1.isApproved();
        s1.changeYearIfApproved();
    }
}
