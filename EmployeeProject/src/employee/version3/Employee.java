package employee.version3;

public class Employee {
    private int empID;
    private Name empName;
    private String empDateHired;
    private String empBirthDate;

    public Employee() {

    }

    public Employee(int empID, Name empName, String empDateHired, String empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }

    public Employee(int empID, Name empName) {
        this.empID = empID;
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public Name getEmpName() {
        return empName;
    }

    public void setEmpName(Name empName) {
        this.empName = empName;
    }

    public String getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(String empDateHired) {
        this.empDateHired = empDateHired;
    }

    public String getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(String empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    @Override
    public String toString() {
        return "\n\n\nID: " + this.empID + "\nName: " + this.empName + "\nDate Hired: " + this.empDateHired + "\nBirth Date: " + this.empBirthDate;
    }
}