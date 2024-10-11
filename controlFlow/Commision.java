import java.util.*;
public class Commision {
    /*
     * Part 1: Commission Calculator
        Using IntelliJ, write a Java app that takes numerical input from a user
        The app should calculate commission based on this chart used by the retail store.
        Sales Range	Commission
        above 10000$	30%
        5001 - 9999$	20%
        1001 - 4999$	10%
        below 1000$	N/A
        Example: if a user enters 7677 as their sales figure, it should calculate commission at 20%.
     */
     
      public static void main(String[] args) {

        int commission_per=0;
        float com;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the sales amount for which we have to calculate commision:");

        int sales_amount=sc.nextInt();

        if(sales_amount<=1000){
            System.out.println("Sorry better luck next time your sales is not fit");
        }

        else if(sales_amount>=1001 && sales_amount<=4999 ){
         
         System.out.println("on your salea amount you have 10% commision");
         commission_per=10;
         com=calculation(commission_per, sales_amount);
         System.out.println("You have including commition calculate:"+com);
         System.out.println("**********************************************************");

        }

        else if(sales_amount>=5001 && sales_amount<=9999){
            System.out.println("on your salea amount you have 20% commision");
            commission_per=20;
            com=calculation(commission_per, sales_amount);
            System.out.println("You have including commition calculate:"+com);
            System.out.println("**********************************************************");
   
        }

        else if(sales_amount>10000){
            System.out.println("on your salea amount you have 30% commision");
            
            commission_per=30;
            com=calculation(commission_per, sales_amount);
            System.out.println("You have including commition calculate:"+com);
            System.out.println("**********************************************************");
   
        }
        else{
            System.out.println("Envalid Input !");
        }
      }
      public static float  calculation(int com, int sales_amount){
        return (sales_amount*com)/100;
      }
}
