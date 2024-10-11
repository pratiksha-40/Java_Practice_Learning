import java.util.*;

public class WeightGuruChallenge {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the height:");
        float height= sc.nextFloat();

        System.out.println("Enter the weight:");
        float weight=sc.nextFloat();

        Float bmi=calc(weight, height);

        System.out.println(" Your body BMI IS:"+bmi);
        
        System.out.println("Your weight ratio is:"+BMI(bmi));
        

    }

    public static float calc(float weight, float height){
        return weight/height*height;
    }

    public static String BMI(float bmi){
        //     Underweight: BMI < 18.5
        // Normal weight: 18.5 ≤ BMI < 24.9
        // Overweight: 25 ≤ BMI < 29.9
        // Obesity: BMI ≥ 30

        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }
}

