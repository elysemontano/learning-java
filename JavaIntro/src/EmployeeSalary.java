
public class EmployeeSalary {

    public static double calculateSalary(double hoursWorked, double hourlyWage, double vacationDays) {
        if(hoursWorked < 0 || hourlyWage < 0) {
            return -1;
        }
        
        double totalHours = (hoursWorked * 52) - (vacationDays * 8);
        double result = (totalHours * hourlyWage);
        return result;
    }
    public static void main(String[] args) {
        double salary = calculateSalary(40, 50, 2);
        System.out.println(salary);

        double errorSalary1 = calculateSalary(-2, 30, 0);
        System.out.println(errorSalary1);

        double errorSalary2 = calculateSalary(30, -4, 0);
        System.out.println(errorSalary2);
    }
}
