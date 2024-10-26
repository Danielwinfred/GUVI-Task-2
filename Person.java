public class Person {
    private String name;
    private int age;

    // Default constructor setting age to 18
    public Person() {
        this.age = 18;
    }

    // initializes both name and age
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // displayss the name and age of the person
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // tests the Person class
    public static void main(String[] args) {
        // Creating a person object with default age
        Person person1 = new Person();
        person1.name = "Alice";
        person1.displayInfo();

        System.out.println();

        Person person2 = new Person("Bob", 25);
        person2.displayInfo();
    }
}
