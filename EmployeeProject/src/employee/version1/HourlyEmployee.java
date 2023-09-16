/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;


/**
 *
 * @author User
 */
public class HourlyEmployee {
    private int empID;    
    private String empName;   
    private String empDateHired; 
    private String empBirthDate;
    private float totalHoursWorked;
    private float ratePerHour;

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpDateHired(String empDateHired) {
        this.empDateHired = empDateHired;
    }

    public void setEmpBirthDate(String empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public int getEmpID() {
        return empID;
    }

    public String getEmpName() {
        return empName;
    }

    public String getEmpDateHired() {
        return empDateHired;
    }

    public String getEmpBirthDate() {
        return empBirthDate;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public float getRatePerHour() {
        return ratePerHour;
    }

    public HourlyEmployee(int empID, String empName, String empDateHired, String empBirthDate, float totalHoursWorked, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    
    public HourlyEmployee() {
       
    }

    public HourlyEmployee(int empID, String empName, String empDateHired, String empBirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.empBirthDate = empBirthDate;
    }
    
    
    public double computeSalary(){
        
        // 40 hours expected total for 5 days
        //  ratePerHour = 200.00
        
        float Salary;
        if(totalHoursWorked > 40){
            //150% RATE
            float ExcessHours = totalHoursWorked - 40;
            Salary = (float) (totalHoursWorked * ratePerHour + (ExcessHours * 1.5));
        }else{
            Salary = (float) (totalHoursWorked * ratePerHour);
        }
        
        return Salary;
             
    }
    

    public void displayInfo(){
        System.out.println("Employee ID: " + empID);
        System.out.println("Name: " + empName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("BirthDate: " + empBirthDate);
        System.out.println("Total Hours Worked: " + String.format("%.2f", totalHoursWorked));
        System.out.println("Rate Per Hour: ₱" + String.format("%.2f", ratePerHour));
        System.out.println("Salary: ₱" + String.format("%.2f", computeSalary()));
        
    }

    @Override
    public String toString() {
        return "EmployeeID: " + empID + "\nEmployeeName: " + empName + "\nDate Hired:" + empDateHired + "\nBirthdate: " + empBirthDate + "\nTotal Hours Worked: " + totalHoursWorked + "\nRate Per Hour: " + ratePerHour;
    }

    

       
    
    
    
}
