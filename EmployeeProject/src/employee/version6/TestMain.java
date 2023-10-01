package employee.version6;

public class TestMain {
    public static void main(String[] args) {
        // TODO code application logic here
        MyDate date1 = new MyDate(14, 7, 1975);

        MyDate dateA = new MyDate(13, 1, 2012);
        MyDate dateB = new MyDate(14, 7, 1994);
        MyDate dateC = new MyDate(26, 8, 2008);
        MyDate dateD = new MyDate(10, 9, 2009);
        MyDate dateE = new MyDate(16, 2, 2015);

        Name name1 = new Name("Juan", "Dela Cruz", "Santos");
        Name name2 = new Name("Maria", "Gonzales", "Reyes");
        Name name3 = new Name("Pedro", "Lopez", "Garcia");
        Name name4 = new Name("Luisa", "Torres", "Rodriguez");
        Name name5 = new Name("Antonio", "Santos", "Fernandez");

        Employee emp1 = new HourlyEmployee(10, name1, dateA, date1, 40, 2000);
        Employee emp2 = new PieceWorkerEmployee(20, name2, dateB, date1, 100, 10000);
        Employee emp3 = new CommissionEmployee(30, name3, dateC, date1, 500000);
        Employee emp4 = new BasePlusCommissionEmployee(40, name4, dateD, date1, 150000, 30000);
        Employee emp5 = new PieceWorkerEmployee(50, name5, dateE, date1, 90, 10000);

        EmployeeRoster list = new EmployeeRoster(10);

        list.addEmployee(emp1);
        list.addEmployee(emp2);
        list.addEmployee(emp3);
        list.addEmployee(emp4);
        list.addEmployee(emp5);

        list.displayAllEmployees();

        System.out.println("\nTotal Hourly Employees: " + list.countHE());
        System.out.println("\nListing Hourly Employees: ");
        list.displayHE();

        System.out.println("\n-------------------------------------------------------------------------------------------------------------------");

        System.out.println("\nTotal Piece Worker Employees: " + list.countPWE());
        System.out.println("\nListing Piece Worker Employees: ");
        list.displayPWE();

        System.out.println("\n-------------------------------------------------------------------------------------------------------------------");

        System.out.println("\nTotal Commission Employees: " + list.countCE());
        System.out.println("\nListing Commission Employees: ");
        list.displayCE();

        System.out.println("\n-------------------------------------------------------------------------------------------------------------------");

        System.out.println("\nTotal Base Plus Commission Employees: " + list.countBPCE());
        System.out.println("\nListing Base Plus Commission Employees: ");
        list.displayBPCE();

        System.out.println("\n-------------------------------------------------------------------------------------------------------------------");

        list.removeEmployee(30);
        System.out.println("\nUpdated Employee List: ");
        list.displayAllEmployees();
        System.out.println("\n");

        Employee catcher = list.getEmployee(50);

        System.out.println("Employee with ID 50: " + catcher);
        System.out.println("\n");

        // changing birthdate without requiring user input
        list.updateEmployee(50);

        System.out.println("Updated Employee with ID 50: " + catcher);
    }
}
