package employee.version5;
import java.util.ArrayList;
import java.util.Iterator;
public class EmployeeRoster {

    public static int MAX=10;
    public static int count = 0;
    private ArrayList<Employee> empList = new ArrayList<>();

    public EmployeeRoster() {

    }

    public EmployeeRoster(int max) {
        MAX = max;
    }

    public boolean addEmployee(Employee emp) {
        if (count < MAX) {
            empList.add(emp);
            count++;
            return true;
        } else {
            System.out.println("LIST IS FULL!");
            return false;
        }
    }

    public boolean removeEmployee(int ID) {
        Iterator<Employee> iterator = empList.iterator();

        while (iterator.hasNext()) {
            Employee emp = iterator.next();
            if (emp.getEmpID() == ID) {
                iterator.remove();
                count--;
                System.out.printf("Employee with ID %d has been removed.%n", ID);
                return true;
            }
        }
        return false;
    }

    public Employee getEmployee(int ID) {
        for (Employee emp : empList) {
            if (emp.getEmpID() == ID) {
                System.out.printf("Employee with ID %d has been obtained.%n", ID);
                return emp;
            }
        }
        return null;
    }

    public boolean updateEmployee(int ID) {
        MyDate newDate = new MyDate(14, 5, 2003);

        for (Employee emp : empList) {
            if (emp.getEmpID() == ID) {
                emp.setEmpBirthDate(newDate);
                System.out.printf("Employee with ID %d has been updated.%n", ID);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }
    private String getType(Employee emp) {
        if (emp instanceof HourlyEmployee) {
            return "Hourly";
        }
        else if(emp instanceof PieceWorkerEmployee) {
            return "Piece Worker";
        }
        else if(emp instanceof CommissionEmployee) {
            return "Commission";
        }
        else if(emp instanceof BasePlusCommissionEmployee) {
            return "Base Plus Commission";
        }
        else {
            return "N/A";
        }
    }

    public int countHE() {
        int counter = 0;
        for (Employee emp : empList) {
            if (emp instanceof HourlyEmployee) {
                counter++;
            }
        }
        return counter;
    }
    public int countPWE() {
        int counter = 0;
        for (Employee emp : empList) {
            if (emp instanceof PieceWorkerEmployee) {
                counter++;
            }
        }
        return counter;
    }

    public int countCE() {
        int counter = 0;
        for (Employee emp : empList) {
            if (emp instanceof CommissionEmployee) {
                counter++;
            }
        }
        return counter;
    }


    public int countBPCE() {
        int counter = 0;
        for (Employee emp : empList) {
            if (emp instanceof BasePlusCommissionEmployee) {
                counter++;
            }
        }
        return counter;
    }

    public void displayHE() {
        System.out.println("Hourly Employees:");
        for (Employee emp : empList) {
            if (emp instanceof HourlyEmployee) {
                System.out.println(emp);
            }
        }
    }

    public void displayPWE() {
        System.out.println("Piece Worker Employees:");
        for (Employee emp : empList) {
            if (emp instanceof PieceWorkerEmployee) {
                System.out.println(emp);
            }
        }
    }

    public void displayCE() {
        System.out.println("Commission Employees:");
        for (Employee emp : empList) {
            if (emp instanceof CommissionEmployee) {
                System.out.println(emp);
            }
        }
    }
    public void displayBPCE() {
        System.out.println("Base Plus Commission Employees:");
        for (Employee emp : empList) {
            if (emp instanceof BasePlusCommissionEmployee) {
                System.out.println(emp);
            }
        }
    }

    public void displayAllEmployees() {
        System.out.println("Employee Roster");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-5s | %-32s | %-20s | %-14s | %-28s | %n", "ID", "Name", "Type", "Salary", "Remarks");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");

        for (Employee emp : empList) {
            System.out.printf("| %-5s | %-32s | %-20s | Php %-10s | %-28s | %n",
                    emp.getEmpID(),
                    emp.getEmpName(),
                    this.getType(emp),
                    emp.computeSalary(),
                    addRemarks(emp));
        }

        System.out.println("-------------------------------------------------------------------------------------------------------------------");
    }

    public String addRemarks(Employee emp) {
        if (emp instanceof HourlyEmployee) {
            return "Total hours worked: " + ((HourlyEmployee)emp).getTotalHoursWorked();
        }
        else if(emp instanceof PieceWorkerEmployee) {
            return "Total pieces finished: " + ((PieceWorkerEmployee)emp).getTotalPiecesFinished();
        }
        else if(emp instanceof CommissionEmployee) {
            return "Total sales: " + ((CommissionEmployee)emp).getTotalSales();
        }
        else if(emp instanceof BasePlusCommissionEmployee) {
            return "Base salary: " + ((BasePlusCommissionEmployee)emp).getBaseSalary();
        }
        else {
            return "N/A";
        }
    }
}