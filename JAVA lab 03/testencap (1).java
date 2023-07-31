import java.util.*;

public class testencap {
    public static void main(String[] args) {
 testencapmethods e1=new testencapmethods(1000);
 e1.setempname("bogdan");
 e1.setempsalary(5000);
 System.out.println("Employee Name: " + e1.getempname());
 System.out.println("Basic Salary:" + e1.getempsalary());
 System.out.println("Bonus: " +e1.getbonus());
 System.out.println("Bonus Amount: " + e1.calcbonusamount());
 
   
  }
}