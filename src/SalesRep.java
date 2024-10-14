
import java.util.*;

public class SalesRep extends Employee {
    
     private double salesMade;

     public double getSalesMade() {
        return salesMade;
    }
    
    public void setSalesMade(double salesMade) {
        this.salesMade = salesMade;
    }

    public SalesRep(String fiststName, String lastName, int registration, int age, int daysWorked,
            int vacationdaystaken, int yearWorked, double salary, double salesMade) {
        super(fiststName, lastName, registration, age, daysWorked, vacationdaystaken, yearWorked, salary);
        this.salesMade = salesMade;
    }


    
   
}
