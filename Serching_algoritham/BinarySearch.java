import java.util.*;
public class BinarySearch {

    public static void binery_search(int array[], int key,int end, int begin){
        
         while(begin<=end){
             int mid= (begin+end)/2;
         if(array[mid]==key){
            System.out.println("Key is found at the position:"+mid);
            break;
         }
         else if(array[mid]<key){
            
            begin=mid+1;
            
         }
         else{
            end=mid-1;
           
         }
        
         }
        
          
        
         
    }
    public static void main(String[] args){
        int[] array= { 2,49,50,75,80,81,85};
        int key=80;
        int begin=0, end=array.length-1;
        binery_search(array, key, end, begin);

    }
}
