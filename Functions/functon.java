import java.util.*;
public class functon {
    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=console.nextLine();
        printNameLength( name);
        printNameCharacter( name);
        console.close();
    }

    public  static void printNameLength(String name){
     System.out.println(name.length());
    }
    public  static void printNameCharacter(String name){
        for(int i=0; i<name.length();i++){
            System.out.println(name.charAt(i));
        }
    }
}
