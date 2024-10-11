import java.util.*;


/* Part 2: Movie Discounts
    A movie cinema does price discounting depending on a customer's age.
    The app prompts a user to enter their age on the IntelliJ console after which it checks whether the user meets the discount conditions.
    Age range	Ticket Price
    Normal ticket	7 Euros
    Below 5	60% Discount
    Over 60	55% Discount
    Write the app so that the conditions above are met and the correct ticket price is returned.*/

public class MovieDiscount {
    public static void main(String[] args) {
    
    int discount;
   
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Age:");
    int age=sc.nextInt();
    int tickit_price;


    if(age>=60 ){
        System.out.println("As per your age you have get 55% discount");
        discount=55;
        tickit_price=calcu_age(discount, age);
        System.out.println("After discount you have get the price for tickit:"+tickit_price);
        System.out.println("***********************************************************");
    }
    else if(age<=5){
        System.out.println("As per your age you have get 55% discount");
        discount=60;
        tickit_price=calcu_age(discount, age);
        System.out.println("After discount you have get the price for tickit:"+tickit_price);
        System.out.println("***********************************************************");
    }
   
 }
 public static int calcu_age(int dis_value, int age){

    return (7*dis_value)/100;
 }
}
