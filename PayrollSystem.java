public class PayrollSystem {
    public static void main(String[] args) {
        Employee JD = new Employee("John Doe", 101, "Engineering", 25.0, 45.0);
        Employee JS = new Employee("Jane Smith", 102, "Marketing", 30.0, 40.0);
        Employee BJ = new Employee("Bob Johnson", 103, "HR", 20.0, 50.0);

        // showing employee details using toString() method
        System.out.println(JD);
        System.out.println(JS);
        System.out.println(BJ);

        // Calculating weekly salary
        System.out.println("\n");

        System.out.println("Weekly Salaries:");
        System.out.println("\n");

        System.out.println("John Doe's weekly salary is " + JD.calculateWeeklySalary());
        System.out.println("Jane Smith's weekly salary is " + JS.calculateWeeklySalary());
        System.out.println("Bob Johnson's weekly salary is " + BJ.calculateWeeklySalary());
    }
}
