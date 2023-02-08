public class EmployeeWageOOP {
    public static final int IS_FULL_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public int empCheck(){
        int empCheck = (int) Math.floor((Math.random() * 10) % 3);
        return empCheck;
    }
    public int dailyWageOfEmployee(int empCheck){
        int empHrs = 0;
        int totalWage = 0;
        switch (empCheck) {
            case IS_FULL_TIME: //checking if full time or not
                empHrs = 8;
                break;
            default:
                empHrs = 0;
        }
        totalWage = empHrs * EMP_RATE_PER_HOUR;
        return totalWage;
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        EmployeeWageOOP employee = new EmployeeWageOOP();
        int isPresent = employee.empCheck();
        System.out.println(employee.dailyWageOfEmployee(isPresent));
    }
}