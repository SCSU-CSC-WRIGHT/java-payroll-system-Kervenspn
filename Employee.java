public class Employee {
    //private fields for code
    private String name;
    private int employeeId;
    String department;
    private double hourlyWage;
    private double hoursWorked;

    //constructor
    public Employee(String name, int employeeId, String department, double hourlyWage, double hoursWorked) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;

    }

    //getter and setter
    public String getName() {
        return name;

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getDepartment() {
        return department;

    }

    public double getHourlyWage() {
        return hourlyWage;

    }

    public double getHoursWorked() {
        return hoursWorked;

    }

    public void setName(String name) {
        this.name = name;

    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setDepartment(String department) {
        this.department = department;

    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //math for weekly salary using conditions
    public double calculateWeeklySalary() {
        double salary;
        //just in case there isn't overtime


        if (hoursWorked > 40) {
            double normalPayment = 40 * hourlyWage;
            //if hours are more than 40
            double overTimePayment = (hoursWorked - 40) * hourlyWage * 1.5;
            salary = normalPayment + overTimePayment;

        } else {
            //below 40 hours worked is regular pay
            salary = hourlyWage * hoursWorked;
        }
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + "', " +  // name
                "employeeId=" + employeeId + ", " +  // employeeId
                "department='" + department + "', " +  // department
                "hourlyWage=" + hourlyWage + ", " +  // hourlyWage
                "hoursWorked=" + hoursWorked + ", " +  // hoursWorked
                "weeklySalary=" + calculateWeeklySalary() +  // weeklySalary
                "}";
    }
}
