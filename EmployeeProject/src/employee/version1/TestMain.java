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
public class TestMain {
    public static void main(String[] args) {
        
//      HOURLY - HOURLY - HOURLY - HOURLY - HOURLY - HOURLY - HOURLY - HOURLY - HOURLY - HOURLY - HOURLY - HOURLY - HOURLY - HOURLY 
        
        System.out.println("[+] Hourly Employee \n");
        HourlyEmployee hremp1 = new HourlyEmployee();
        HourlyEmployee hremp2 = new HourlyEmployee(22102950, "Dan Monsales", "2000/12/12", "2000/12/12", 100, 5000);
        HourlyEmployee hremp3 = new HourlyEmployee(22102950, "Dan Monsales", "2000/12/12", "2000/12/12"); 
        
        hremp1.setEmpID(22102950);
        hremp1.setEmpName("Danny Boy");
        hremp1.setEmpDateHired("2020/12/12");
        hremp1.setEmpBirthDate("2020/12/12");
        hremp1.setTotalHoursWorked(500);
        hremp1.setRatePerHour(100);
        
        System.out.println(hremp1);
        System.out.println("\n");
        hremp1.computeSalary();
        hremp1.displayInfo();
        System.out.println("\n");
        
        System.out.println(hremp2);
        System.out.println("\n");
        hremp2.computeSalary();
        hremp2.displayInfo();
        System.out.println("\n");
        
        System.out.println(hremp3);
        System.out.println("\n");
        hremp3.computeSalary();
        hremp3.displayInfo();
        System.out.println("\n");
                
//      HOURLY - HOURLY - HOURLY - HOURLY - HOURLY - HOURLY - HOURLY - HOURLY - HOURLY - HOURLY - HOURLY - HOURLY - HOURLY - HOURLY 

//      PIECE WORKER - PIECE WORKER - PIECE WORKER - PIECE WORKER - PIECE WORKER - PIECE WORKER - PIECE WORKER - PIECE WORKER - PIECE WORKER

        System.out.println("[+] =========== Piece Worker Employee =========== [+]\n\n");
        PieceWorkerEmployee hremp11 = new PieceWorkerEmployee();
        PieceWorkerEmployee hremp22 = new PieceWorkerEmployee(22102950, "Dan Monsales", "2000/12/12", "2000/12/12", 100, 5000);
        PieceWorkerEmployee hremp33 = new PieceWorkerEmployee(22102950, "Dan Monsales", "2000/12/12"); 
        
        hremp11.setEmpID(22102950);
        hremp11.setEmpName("Danny Boy");
        hremp11.setEmpDateHired("2020/12/12");
        hremp11.setBirthDate("2020/12/12");
        hremp11.setTotalPiecesFinished(500);
        hremp11.setRatePerPiece(100);
        
        
        
        System.out.println(hremp11);
        System.out.println("\n");
        hremp11.computeSalary();
        hremp11.displayInfo();
        System.out.println("\n");
        
        System.out.println(hremp22);
        System.out.println("\n");
        hremp22.computeSalary();
        hremp22.displayInfo();
        System.out.println("\n");
        
        System.out.println(hremp33);
        System.out.println("\n");
        hremp33.computeSalary();
        hremp33.displayInfo();
        System.out.println("\n");
        
        System.out.println("[+] =========== Piece Worker Employee =========== [+]\n\n");



//      PIECE WORKER - PIECE WORKER - PIECE WORKER - PIECE WORKER - PIECE WORKER - PIECE WORKER - PIECE WORKER - PIECE WORKER - PIECE WORKER

//      COMMISSION EMPLOYEE - COMMISSION EMPLOYEE - COMMISSION EMPLOYEE - COMMISSION EMPLOYEE - COMMISSION EMPLOYEE - COMMISSION EMPLOYEE - COMMISSION EMPLOYEE
        System.out.println("[+] =========== Commission Employee =========== \n");
        CommissionEmployee hremp111 = new CommissionEmployee();
        CommissionEmployee hremp222 = new CommissionEmployee(22102950, "Dan Monsales", "2000/12/12", "2000/12/12", 25000);
        CommissionEmployee hremp333 = new CommissionEmployee(22102950, "Dan Monsales", "2000/12/12", "2000/12/12"); 
        
        hremp111.setEmpID(22102950);
        hremp111.setEmpName("Danny Boy");
        hremp111.setEmpDateHired("2020/12/12");
        hremp111.setBirthDate("2020/12/12");
        hremp111.setTotalSales(26000);
        
        System.out.println(hremp111);
        System.out.println("\n");
        hremp111.computeSalary();
        hremp111.displayInfo();
        System.out.println("\n");
        
        System.out.println(hremp222);
        System.out.println("\n");
        hremp222.computeSalary();
        hremp222.displayInfo();
        System.out.println("\n");
        
        System.out.println(hremp333);
        System.out.println("\n");
        hremp333.computeSalary();
        hremp333.displayInfo();
        System.out.println("\n");
           
        
        System.out.println("[+] =========== Commission Employee =========== \n");

//      COMMISSION EMPLOYEE - COMMISSION EMPLOYEE - COMMISSION EMPLOYEE - COMMISSION EMPLOYEE - COMMISSION EMPLOYEE - COMMISSION EMPLOYEE - COMMISSION EMPLOYEE
        
//      BASE PLUS COMMISSION EMPLOYEE - BASE PLUS COMMISSION EMPLOYEE - BASE PLUS COMMISSION EMPLOYEE - BASE PLUS COMMISSION EMPLOYEE - BASE PLUS COMMISSION EMPLOYEE

        System.out.println("[+] =========== Base Plus Commission Employee =========== \n");
        BasePlusCommissionEmployee hremp1111 = new BasePlusCommissionEmployee();
        BasePlusCommissionEmployee hremp2222 = new BasePlusCommissionEmployee(22102950, "Dan Monsales", "2000/12/12", "2000/12/12", 25000, 20000);
        BasePlusCommissionEmployee hremp3333 = new BasePlusCommissionEmployee(22102950, "Dan Monsales", "2000/12/12", "2000/12/12"); 
        
        hremp1111.setEmpID(22102950);
        hremp1111.setEmpName("Danny Boy");
        hremp1111.setEmpDateHired("2020/12/12");
        hremp1111.setBirthDate("2020/12/12");
        hremp1111.setTotalSales(26000);
        hremp1111.setBaseSalary(20000);
        
        System.out.println(hremp1111);
        System.out.println("\n");
        hremp1111.computeSalary();
        hremp1111.displayInfo();
        System.out.println("\n");
        
        System.out.println(hremp2222);
        System.out.println("\n");
        hremp2222.computeSalary();
        hremp2222.displayInfo();
        System.out.println("\n");
        
        System.out.println(hremp3333);
        System.out.println("\n");
        hremp3333.computeSalary();
        hremp3333.displayInfo();
        System.out.println("\n");

        
        System.out.println("[+] =========== Base Plus Commission Employee =========== \n");
//      BASE PLUS COMMISSION EMPLOYEE - BASE PLUS COMMISSION EMPLOYEE - BASE PLUS COMMISSION EMPLOYEE - BASE PLUS COMMISSION EMPLOYEE - BASE PLUS COMMISSION EMPLOYEE




    }
}
