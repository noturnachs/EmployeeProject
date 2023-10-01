package employee.version4;

public class BasePlusCommissionEmployee extends Employee {
    private double baseSalary;
    private double totalSales;
    private String saleType;


    public BasePlusCommissionEmployee() {

    }

    public BasePlusCommissionEmployee(int empID, Name empName, MyDate empDateHired, MyDate empBirthDate) {
        super(empID, empName, empDateHired, empBirthDate);
    }

    public BasePlusCommissionEmployee(int empID, Name empName, MyDate empDateHired, MyDate empBirthDate, double totalSales, double baseSalary) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double computeSalary() {

        double salary = 0;

        if (totalSales < 50000) {
            salary = totalSales * 0.05;
            saleType = "low sales";
        } else if (totalSales >= 50000 && totalSales < 100000) {
            salary = totalSales * 0.20;
            saleType = "typical sales";
        } else if (totalSales >= 100000 && totalSales < 500000) {
            salary = totalSales * 0.30;
            saleType = "typical sales";
        } else if (totalSales >= 500000) {
            salary = totalSales * 0.50;
            saleType = "high sales";
        }

        salary += baseSalary;

        return salary;
    }

    public void displayInfo() {
        double TotalSalary = computeSalary();
        System.out.println("Total Sales: " + totalSales + "\nSales Type: " + saleType + " \n" + "Total Salary: Php " + TotalSalary);
    }

    @Override
    public String toString() {
        return super.toString() + "\nBase salary: " + this.baseSalary;
    }
}