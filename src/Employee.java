import java.util.*;
import java.lang.Math;

public class Employee {

    String FiststName, lastName;
    int Registration, age, daysWorked, vacationDaysTaken, yearsWorked ;
    double salary;

    
    public Employee(String fiststName, String lastName, int registration, int age, int daysWorked,
            int vacationdaystaken, int yearWorked, double salary) {
            FiststName = fiststName;
            this.lastName = lastName;
            this.Registration = registration;
            this.age = age;
            this.daysWorked = daysWorked;
            this.vacationDaysTaken = vacationdaystaken;
            this.yearsWorked = yearWorked;
            this.salary = salary;
            
    }

    public int timeToRetirement( int age, int yearsWorked){
        return Math.min(60 - age, 40 - yearsWorked);
     }

     public int vacationTimeLeft(int daysWorked, int vacationDaysTaken){
        return (daysWorked/360)*(30 - vacationDaysTaken);
    }
 
    public double calculateBonus( double salary){
        return 2.2*salary;
    }
    
}
