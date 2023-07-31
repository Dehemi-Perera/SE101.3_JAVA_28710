public class testencapmethods{

  private String empname;
 private double empsalary;
 private double bonus;
 public void setempname(String empname){
 this.empname=empname;
 }
 
 public void setempsalary(double empsalary){
 this.empsalary=empsalary;
 }
 public String getempname(){
 return empname;
 }
 public double getempsalary(){
 return empsalary;
 }
 public testencapmethods(double bonus){
 this.bonus=bonus;
 
 }
 public double getbonus(){
 return bonus;
 }
 public double calcbonusamount(){
 return bonus+empsalary;
 }

}