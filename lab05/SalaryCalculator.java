public class SalaryCalculator {

    // Full-time
    static double calculateSalary(double base, double bonus) {
        return base + bonus;
    }

    // Part-time
    static double calculateSalary(int hours, double rate) {
        return hours * rate;
    }

    public static void main(String[] args) {
        System.out.println("Full-time Salary: " + calculateSalary(50000, 10000));
        System.out.println("Part-time Salary: " + calculateSalary(40, 500));
    }
}
