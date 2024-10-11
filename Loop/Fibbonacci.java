import java.util.*;
public class Fibbonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int i=0;
        int x=0, y=1, z;
        System.out.println("" +x);
        System.out.println("" +y);
        do {
        
            z=x+y;
            System.out.println(z);
            x=y;
            y=z;
            i++;
        } while(i<=num);
        //System.out.println(z);
    }
}
