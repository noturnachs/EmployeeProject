package employee.version3;


public class CommissionEmployee extends Employee {
    private double totalSales;
    private String saleType;


    public CommissionEmployee() {

    }

    public CommissionEmployee(int empID, Name empName, String empDateHired, String empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
    }
    public CommissionEmployee(int empID, Name empName, String empDateHired, String empBirthDate, double totalSales) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double computeSalary() {

        double salary = 0;

        if (totalSales < 50000) {
            salary = totalSales * 0.05;
            saleType = "Low Sales";
        } else if (totalSales >= 50000 && totalSales < 100000) {
            salary = totalSales * 0.20;
            saleType = "Typical Sales";
        } else if (totalSales >= 100000 && totalSales < 500000) {
            salary = totalSales * 0.30;
            saleType = "Typical Sales";
        } else if (totalSales >= 500000) {
            salary = totalSales * 0.50;
            saleType = "High Sales";
        }
        return salary;
    }

    public void displayInfo() {
        double ComputedSalary = computeSalary();
        System.out.println("Total Sales: " + totalSales);
        System.out.println("Sale Type: " + saleType);
        System.out.println("Total Salary: " + ComputedSalary);
    }


    @Override
    public String toString() {
        return super.toString() +"\nTotal sales: " + this.totalSales;
    }
}