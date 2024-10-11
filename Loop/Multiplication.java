import java.util.*;
public class Multiplication {
    public static void main(PrintString[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the any limit foe table:");
        int limit=sc.nextInt();

        int multiplier, multiplicant=1;

        while(multiplicant<=limit){
                multiplier =1;

            while(multiplier<=10){
                int product=multiplicant*multiplier;
                System.out.println(multiplicant + "X" + multiplier + "=" +product);
                multiplier++;
            } //inner loop end
        multiplicant++;
        }// outer loop end
    }
}
