import java.util.*;

public class TestEncap {
 public static void main(String[] args) {
 EncapCls e1=new EncapCls();
 e1.setempname("Mr.Perera");
 e1.setempage(56);
 e1.setempsalary(340000.50);
 System.out.println("Employee name is "+e1.getempname());
 System.out.println("Employee Age is "+e1.getempage());
 System.out.println("Employee salary is "+e1.getempsalary());
 }
}