 public class Fibbo {
   public static void main(String[] args){
    long n1=0, n2=1;
    short count=10;
    long[] a= new long[count];
    fibbo1(n1,n2,count);  
 } 
   public static void fibbo1( long n1, long n2, short count){
    long[] a= new long[count];
    for(int i=0; i<count; i++){
    long n3;
    n3=n1+n2;
    a[i]=n3;
    n1=n2;
    n2=n3;
    }

    for(int i=0; i<=a.length;i++){
        System.out.println("A[" +i+ "]==>" +a[i]);
    }
   }
}
