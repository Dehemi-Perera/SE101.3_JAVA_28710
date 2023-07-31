public class EncapCls {
    // Private data members
    private String empname;
    private int empage;
    private double empsalary;

    // Setter methods to set the values of the private data members
    public void setempname(String empname) {
        this.empname = empname;
    }

    public void setempage(int empage) {
        this.empage = empage;
    }

    public void setempsalary(double empsalary) {
        this.empsalary = empsalary;
    }

    // Getter methods to access the values of the private data members
    public String getempname() {
        return empname;
    }

    public int getempage() {
        return empage;
    }

    public double getempsalary() {
        return empsalary;
    }
}
