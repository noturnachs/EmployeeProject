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
public class PieceWorkerEmployee {
    private int empID;
    private String empName;
    private String empDateHired;
    private String BirthDate;
    private int totalPiecesFinished;
    private float ratePerPiece;

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

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

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

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empID, String empName, String empDateHired, String BirthDate, int totalPiecesFinished, float ratePerPiece) {
        this.empID = empID;
        this.empName = empName;
        this.empDateHired = empDateHired;
        this.BirthDate = BirthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee() {
    }

    public PieceWorkerEmployee(int empID, String empName, String BirthDate) {
        this.empID = empID;
        this.empName = empName;
        this.BirthDate = BirthDate;
    }
    
    public double computeSalary(){
        int salary;
        if(totalPiecesFinished >= 100){
            
         int everyhundreds = totalPiecesFinished / 100;
//         totalPiecesFinished = totalPiecesFinished-everyhundreds;
         int everyHundredPrice = (int) (ratePerPiece * 10);
            
       
         salary = (int) (totalPiecesFinished * ratePerPiece + everyHundredPrice *everyhundreds);
            
            
        }else{
         salary = (int) (totalPiecesFinished * ratePerPiece);
        }
        
        
        return salary;
    }
    
    
    
    public void displayInfo(){
        System.out.println("Employee ID: " + empID);
        System.out.println("Name: " + empName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("BirthDate: " + BirthDate);
        System.out.println("Total Pieces Finished: " + totalPiecesFinished);
        System.out.println("Rate Per Piece: ₱" + String.format("%.2f", ratePerPiece));
        System.out.println("Salary: ₱" + String.format("%.2f", computeSalary()));
        
    }

    @Override
    public String toString() {
        return "EmployeeID: " + empID + "\nEmployeeName: " + empName + "\nDate Hired:" + empDateHired + "\nBirthdate: " + BirthDate + "\nTotal Pieces Finished: " + totalPiecesFinished + "\nRate Per Piece: " + ratePerPiece;
    }
    

    
    
    
    
}
