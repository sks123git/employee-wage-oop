public class EmployeeWageOOP {
    public static final int IS_FULL_TIME = 1;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int IS_PART_TIME = 2;
    public static final int NO_OF_WORKING_DAYS = 20;
    public static int empCheck(){
        int empCheck = (int) Math.floor((Math.random() * 10) % 3);
        return empCheck;
    }
    public int dailyWageOfEmployee() {
        int empHrs = 0;
        int totalHrs = 0;
        int totalWage = 0;
        int totalWorkingDays = 0;
        while (totalWorkingDays < NO_OF_WORKING_DAYS) {
            totalWorkingDays++;
            switch (empCheck()) {
                case IS_PART_TIME: //checking if part time or not
                    empHrs = 4;
                    break;
                case IS_FULL_TIME: //checking if full time or not
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalHrs+=empHrs;
        }
            totalWage = totalHrs * EMP_RATE_PER_HOUR;
        return totalWage;
        }

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        EmployeeWageOOP employee = new EmployeeWageOOP();
        System.out.println(employee.dailyWageOfEmployee());
    }
}