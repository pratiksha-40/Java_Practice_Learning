import java.util.*;
public class factorial {
    public static void main(String[] args) {
        int i , fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no:");
         int num =sc.nextInt();    
             for(i=1;i<=num;i++)
            {
                fact=fact*i;
                
            }
            System.out.println(fact);
    }
}
