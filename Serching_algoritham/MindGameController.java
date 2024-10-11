import java.util.Random;
import java.util.Scanner;
public class MindGameController {
    public static void main(String[] args){
        Random r= new Random();

        int u_scr=0;
        int c_scr=0;
        int c_pre;
        int input;
        int predication;

    Scanner sc= new Scanner(System.in);  
    System.out.println("Please Enter iteration of game:");
    int iteration=sc.nextInt();

    for(int i=0;i<iteration;i++){

        System.out.println("Enter your input 0 or 1:");
        input=sc.nextInt();

        predication=(int)r.nextInt(2);
        c_pre =(int)r.nextInt(2);
        
        if(c_pre==predication){
            c_scr++;
        }
        if(input==predication){
            u_scr++;
        }
        if(u_scr>c_scr){
            System.out.println("Congratulation you are win...!");
        }
        else if(c_scr<u_scr){
            System.out.println("Better luck next Time...!");
        }
        else{
            System.out.println("There is tie between you.....!");
        }
    }
  }
}
