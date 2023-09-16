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
public class CommissionEmployee {
    
    private int empID;
    private String empName;
    private String empDateHired;
    private String BirthDate;
    private double totalSales;
    private double salary;

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setEmpDateHired(String empDateHired) {
        this.empDateHired = empDateHired;
    }

    public void setBirthDate(String BirthDate) {
        this.BirthDate = BirthDate;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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

    public String getBirthDate() {
        return BirthDate;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public double getSalary() {
        return salary;
    }

   

    public CommissionEmployee(int empID, String empName, String empDateHired, String BirthDate, double totalSales) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.BirthDate = BirthDate;
        this.totalSales = totalSales;
    }

    public CommissionEmployee(int empID, String empName, String empDateHired, String BirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.BirthDate = BirthDate;
    }

    public CommissionEmployee() {
    }
    
    public double computeSalary(){
        
        if(totalSales < 50_000){
           salary = totalSales * .05;     
        }else if(totalSales >= 50_000 && totalSales < 100_000){
            salary = totalSales * .20;
        }else if(totalSales >= 100_000 && totalSales < 500_000){
            salary = totalSales * .30;
        }else if(totalSales >= 500_000){
            salary = totalSales * .50;
        }
        
        return salary;
        
    }
    
    public void displayInfo(){
        System.out.println("Employee ID: " + empID);
        System.out.println("Name: " + empName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("BirthDate: " + BirthDate);
        System.out.println("Total Sales: " + String.format("%.2f", totalSales));
        System.out.println("Salary: ₱" + String.format("%.2f", computeSalary()));
    }
    

    @Override
    public String toString() {
        return "Employee ID: " + empID + "\nEmployee Name: " + empName + "\nDate Hired: " + empDateHired + "\nBirthday: " + BirthDate + "\nTotal Sales: " + String.format("%.2f", totalSales) + "\nSalary: " + salary ;
    }
    
    
    
    
    
    
    
}
