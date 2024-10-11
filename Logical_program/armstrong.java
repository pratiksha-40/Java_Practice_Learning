import java.util.*;
public class armstrong {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = s.nextInt();
        int rev=0;
        int rem;
        int n = num;
        int len = String.valueOf(num).length();
        int[] a = new int[len];
        while(num>0){
            rem = num%10;
            rev +=Math.pow(rem, len);
            num=num/10;
        }
        if(n==rev){
            System.out.println("armstrong");
        }else{
            System.out.println("not an armstong");
        }
 
    }
}
