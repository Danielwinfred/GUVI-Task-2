// Base class
class Person {
    String name;
    int age;

    // Constructor for Person class
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Subclass Employee that extends Person
class Employee extends Person {
    int employeeID;
    double salary;

    // Constructor for Employee class
    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age);  // Using super to initialize name and age
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to display Employee details
    public void displayEmployeeInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: $" + salary);
    }

    // Main method
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 30, 101, 75000.00);
        emp.displayEmployeeInfo();
    }
}

