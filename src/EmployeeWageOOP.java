public class EmployeeWageOOP {

    public int empCheck(){
        int empCheck = (int) Math.floor((Math.random() * 10) % 3);
        return empCheck;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        EmployeeWageOOP empCheck = new EmployeeWageOOP();
        int isPresent = empCheck.empCheck();

    }
}