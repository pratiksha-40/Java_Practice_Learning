import java.util.Scanner;

public class CircleAP {
    static float Pi=3.14f;
   public static void main(String args[])
   { 
     Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Diameter:");
    float dia=sc.nextFloat();
    float radius=dia/2;
    System.out.println("The radius will be: "+radius);
    System.out.println("Area of circle is:"+area(radius));
    System.out.println("Parimeter of circle is:"+perimeter(radius));
    
   
   }
   public static float area(float radius){
    return Pi*radius*radius;
   }
   
   public static float perimeter (float radius){
    return 2*Pi*radius;
   }
}
