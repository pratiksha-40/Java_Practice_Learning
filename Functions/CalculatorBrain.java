import java.util.*;
public class CalculatorBrain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a snd b:");
        int a = sc.nextInt();
        int b = sc .nextInt();
        int base = sc.nextInt();
        Addition(a,b);
        Subtraction(a,b);
        Multiplication(a,b);
        Division(a,b);
        SquareRoot(a);
        PowerOf(a, base);
        sc.close();
    }

    public static void Addition( int a, int b){
        System.out.println("Addition is: "+(a+b));
    }

    public static void Subtraction( int a, int b){
       System.out.println("Subtraction is: " + (a-b));
    }

    public static void Multiplication( int a, int b){
       System.out.println("Multiplication is: " +(a*b));
    }

    public static void Division( float a, float b){
       System.out.println("Division is:"+(a/b));
    }

    public static void SquareRoot(long a){
        System.out.println("Square root  is: " + Math.sqrt(a));
    }
    public static void PowerOf(long a, long base){
        System.out.println("power of is: " + Math.pow(a, base));
    }
}
