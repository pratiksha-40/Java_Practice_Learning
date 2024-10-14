

public class SalesManager extends SalesRep 
{
    double salesbyTeam;
      
    
    public SalesManager(String fiststName, String lastName, int registration, int age, int daysWorked,
            int vacationdaystaken, int yearWorked, double salary, double salesMade, double salesbyTeam) {
        super(fiststName, lastName, registration, age, daysWorked, vacationdaystaken, yearWorked, salary, salesMade);
        this.salesbyTeam = salesbyTeam;
    }


    public void calculateCommition(){
      // 0.03 * all sales made by team
      System.out.println("The Manegers comission is:---------------->"+0.03f*salesbyTeam);
    }
}
