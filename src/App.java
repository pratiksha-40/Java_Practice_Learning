public class App{
    public static void main(String[] args) {
        System.out.println("Hellow");
        Employee e1= new Employee("Pratiksha", "Ingale", 10, 30, 2500, 10, 6,25000.3 );
        System.out.println("Time to retire:" +e1.timeToRetirement(e1.age, e1.yearsWorked));
        System.out.println("vacation Time To Left:" +e1.vacationTimeLeft(e1.daysWorked, e1.vacationDaysTaken));
        System.out.println("Calculate Bonus:" +e1.calculateBonus( e1.salary)); 
        System.out.println("*************************************************************************************************");

        SalesRep s1= new SalesRep("Pratiksha","Ingale", 10, 30,730,05,300000,2,100000);
        SalesRep s2= new SalesRep("Hrusahali","Patil", 11, 20,750,10,300000,2,10000);
        SalesRep s3= new SalesRep("Renuka","choudhary", 12, 35,700,15,30000,2,1000000);
        System.out.println("*************************************************************************************************");


        SalesManager SM=new SalesManager("Prakash", "Patil", 10, 30, 750, 15, 3000000, 20, 80000,s1.getSalesMade()+s2.getSalesMade()+s3.getSalesMade());
        SM.calculateCommition();        
    }
}
