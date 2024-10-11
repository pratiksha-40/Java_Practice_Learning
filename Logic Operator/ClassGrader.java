import java.util.*;

public class ClassGrader {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the grade");
        int grade=sc.nextInt();
        
        if(grade < 0 || grade > 10) {
            System.out.println("Please enter a grade between the range (0-10)");
        } 
         else if (grade<=3){
            System.out.println("failed");
        }
        else if( grade>3 && grade<=5){
            System.out.println("Insufficient");
        }
        else if(grade>5 && grade<=8){
            System.out.println("Good");
            
        }
        else if(grade==10){
            System.out.println("Excellent Grade");
        }
        
        
    }
}
