package employee.version2;

public class TestMain {
    public static void main(String[] args) {
        // TODO code application logic here
        String date0 = "12/12/1990";
        String date1 = "10/12/2003";


//        HOURLY EMPLOYEE HOURLY EMPLOYEE HOURLY EMPLOYEE HOURLY EMPLOYEE HOURLY EMPLOYEE HOURLY EMPLOYEE HOURLY EMPLOYEE

        System.out.println("\n\n\nHOURLY EMPLOYEES:");

        HourlyEmployee Emp1 = new HourlyEmployee();
        HourlyEmployee Emp2 = new HourlyEmployee(22103999, "Luis James", date0, date1, 120, 1200);
        HourlyEmployee Emp3 = new HourlyEmployee(29329322, "Makar Lper", date0, date1);

        Emp1.setEmpID(22094244);
        Emp1.setEmpName("Jones King");
        Emp1.setEmpDateHired(date0);
        Emp1.setEmpBirthDate(date1);
        Emp1.setTotalHoursWorked(20);
        Emp1.setRatePerHour(500);

        System.out.println(Emp1);
        System.out.println("\nComputation:");
        Emp1.displayInfo();

        System.out.println("\n==========================================");



        System.out.println(Emp2);
        System.out.println("\nComputation:");
        Emp2.displayInfo();

        System.out.println("\n==========================================");

        Emp3.setTotalHoursWorked(60);
        Emp3.setRatePerHour(1400);

        System.out.println(Emp3);

        System.out.println("\nComputation:");
        Emp3.displayInfo();

        System.out.println("\n==========================================");

//       PIECE WORKER EMPLOYEE PIECE WORKER EMPLOYEE PIECE WORKER EMPLOYEE PIECE WORKER EMPLOYEE PIECE WORKER EMPLOYEE

        System.out.println("\n\n\n\nPIECE WORKER EMPLOYEES:");


        PieceWorkerEmployee EmpA = new PieceWorkerEmployee();
        PieceWorkerEmployee EmpB = new PieceWorkerEmployee(22103999, "Luis James", date0, date1, 120, 1200);
        PieceWorkerEmployee EmpC = new PieceWorkerEmployee(221039559, "Makar Lper", date0, date1);

        EmpA.setEmpID(22094244);
        EmpA.setEmpName("Jones King");
        EmpA.setEmpDateHired(date0);
        EmpA.setEmpBirthDate(date1);
        EmpA.setTotalPiecesFinished(50);
        EmpA.setRatePerPiece(2000);

        System.out.println(EmpA);
        System.out.println("\nComputation:");
        EmpA.displayInfo();

        System.out.println("\n==========================================");


        System.out.println(EmpB);
        System.out.println("\nComputation:");
        EmpB.displayInfo();

        System.out.println("\n==========================================");

        EmpC.setTotalPiecesFinished(300);
        EmpC.setRatePerPiece(500);

        System.out.println(EmpC);

        System.out.println("\nComputation:");
        EmpC.displayInfo();

        System.out.println("\n==========================================");

        //    COMMISSION EMPLOYEECOMMISSION EMPLOYEECOMMISSION EMPLOYEECOMMISSION EMPLOYEECOMMISSION EMPLOYEECOMMISSION EMPLOYEECOMMISSION EMPLOYEECOMMISSION EMPLOYEECOMMISSION EMPLOYEECOMMISSION EMPLOYEECOMMISSION EMPLOYEE

        System.out.println("\n\n\n\nCOMMISSION EMPLOYEES:");


        CommissionEmployee EmpA1 = new CommissionEmployee();
        CommissionEmployee EmpB1 = new CommissionEmployee(11029325, "Karl Jones", date0, date1, 35000);
        CommissionEmployee EmpC1 = new CommissionEmployee(22939922, "Vincent John", date0, date1);

        EmpA1.setEmpID(22103323);
        EmpA1.setEmpName("Mark Neel");
        EmpA1.setEmpDateHired(date0);
        EmpA1.setEmpBirthDate(date1);
        EmpA1.setTotalSales(5000);

        System.out.println(EmpA1);
        System.out.println("\nComputation:");
        EmpA1.displayInfo();

        System.out.println("\n==========================================");


        System.out.println(EmpB1);
        System.out.println("\nComputation:");
        EmpB1.displayInfo();

        System.out.println("\n==========================================");

        EmpC1.setTotalSales(90000);

        System.out.println(EmpC1);

        System.out.println("\nComputation:");
        EmpC1.displayInfo();

        System.out.println("\n==========================================");

        //        BASE PLUS COMMISSION EMPLOYEEBASE PLUS COMMISSION EMPLOYEEBASE PLUS COMMISSION EMPLOYEEBASE PLUS COMMISSION EMPLOYEE

        System.out.println("\n\n\n\nBASE PLUS COMMISSION EMPLOYEES:");

        BasePlusCommissionEmployee EmpA2 = new BasePlusCommissionEmployee();
        BasePlusCommissionEmployee EmpB2 = new BasePlusCommissionEmployee(22094922, "Carlu Diaz", date0, date1, 32000, 10000);
        BasePlusCommissionEmployee EmpC2 = new BasePlusCommissionEmployee(22039233, "Andrey Frah", date0, date1);

        EmpA2.setEmpID(22039233);
        EmpA2.setEmpName("Jonas Karl");
        EmpA2.setEmpDateHired(date0);
        EmpA2.setEmpBirthDate(date1);
        EmpA2.setTotalSales(6000);
        EmpA2.setBaseSalary(80000);

        System.out.println(EmpA2);
        System.out.println("\nComputation:");
        EmpA2.displayInfo();

        System.out.println("\n==========================================");


        System.out.println(EmpB2);
        System.out.println("\nComputation:");
        EmpB2.displayInfo();

        System.out.println("\n==========================================");


        EmpC2.setTotalSales(90000);
        EmpC2.setBaseSalary(200000);

        System.out.println(EmpC2);
        System.out.println("\nComputation:");
        EmpC2.displayInfo();

        System.out.println("\n==========================================");


    }
}