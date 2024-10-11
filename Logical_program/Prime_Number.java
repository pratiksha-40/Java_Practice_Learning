import java.util.*;
public class Prime_Number {
    public static void main(String[] args){
        long num_checks, flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        num_checks = sc.nextInt();
        if(num_checks==0||num_checks==1){
            System.out.println("Not prime Number");
        }
        for(int i=2;i<=num_checks%i;i++){
            if(num_checks%i==0){
                flag=1;
            }
        }
        if(flag==1){
            System.out.println("Not an prime number");

        }
        else {
            System.out.println("Prime Number");
        }
    }
}
