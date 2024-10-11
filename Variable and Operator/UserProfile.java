import java.util.*;

public class UserProfile {
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        System.out.println("Enter the current year:");
        int year=sc.nextInt();
           System.out.println("your birth  year is:" +calculateYear(age,year));
        
       }
       public static int calculateYear(int age,int year){
         int a=year-age;
         return a;
       }
}
