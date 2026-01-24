package day8.practice;

public class EmployeeWageComputation {

    // Class Variables
    static final int EMP_RATE_PER_HOUR = 20;
    static final int FULL_TIME_HOURS = 8;
    static final int PART_TIME_HOURS = 8;
    static final int MAX_WORKING_DAYS = 20;
    static final int MAX_WORKING_HOURS = 100;

    // Class Method to Compute Employee Wage
    public static void computeEmployeeWage() {

        int totalWorkingDays = 0;
        int totalWorkingHours = 0;
        int totalWage = 0;

        while (totalWorkingDays < MAX_WORKING_DAYS &&
                totalWorkingHours < MAX_WORKING_HOURS) {

            totalWorkingDays++;

            int empHours = 0;
            int empType = (int) (Math.random() * 3); // 0,1,2

            switch (empType) {
                case 1:
                    empHours = FULL_TIME_HOURS;
                    break;

                case 2:
                    empHours = PART_TIME_HOURS;
                    break;

                default:
                    empHours = 0;
            }

            totalWorkingHours += empHours;
            totalWage += empHours * EMP_RATE_PER_HOUR;
        }

        System.out.println("Total Working Days: " + totalWorkingDays);
        System.out.println("Total Working Hours: " + totalWorkingHours);
        System.out.println("Total Employee Wage: ₹" + totalWage);
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");
        computeEmployeeWage();
    }
}

