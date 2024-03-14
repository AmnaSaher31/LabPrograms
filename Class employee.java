public class Employee {
    // Attributes
    private String name;
    private String position;
    private double salary;

    // Constructor
    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        // Instantiate an employee object
        Employee employee1 = new Employee("John Doe", "Software Engineer", 60000);

        // Display employee information
        employee1.displayInfo();
    }
}
