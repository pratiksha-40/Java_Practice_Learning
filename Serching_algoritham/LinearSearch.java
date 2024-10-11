import java.util.*;
public class LinearSearch {
    public static void main(String[] args){
        int pos=-1;

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the array element:");
        int n=sc.nextInt();

        System.out.println("Enter the key for serching elemrnt:");
        int key= sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                 pos=i+1;
                System.out.println("The searching key is matched:"+ pos);
                break;
            }
            
         //System.out.println("Not matched"+pos);
        }
        
    }
}
