import java.util.*;
public class PrintString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=sc.nextLine();
        System.out.println(name);

        for( int i=0; i<name.length(); i++){
            System.out.println(name.charAt(i));
        }
    }
}