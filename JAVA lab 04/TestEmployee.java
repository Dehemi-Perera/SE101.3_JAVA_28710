import java.util.*;


      public class TestEmployee {
    public static void main(String[] args) {
      
        Employee mrBogdan = new Employee();
        Employee msBird = new Employee();

        
        mrBogdan.setEmpID(101);
        mrBogdan.setEmpName("Mr. Bogdan");
        mrBogdan.setEmpDesignation("Software Engineer");

        
        msBird.setEmpID(102);
        msBird.setEmpName("Ms. Bird");
        msBird.setEmpDesignation("Marketing Manager");

       
        System.out.println("Employee ID: " + mrBogdan.getEmpID());
        System.out.println("Employee Name: " + mrBogdan.getEmpName());
        System.out.println("Employee Designation: " + mrBogdan.getEmpDesignation());

    
        System.out.println("Employee ID: " + msBird.getEmpID());
        System.out.println("Employee Name: " + msBird.getEmpName());
        System.out.println("Employee Designation: " + msBird.getEmpDesignation());
    }
}

  
