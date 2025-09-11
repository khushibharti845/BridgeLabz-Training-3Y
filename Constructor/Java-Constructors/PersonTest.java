class Person {
    String name;
    int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    public Person(Person another) {
        this.name = another.name;
        this.age = another.age;
    }

    // Method to display person details
    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}

public class PersonTest {
    public static void main(String[] args) {
        // Original person object
        Person person1 = new Person("Alice", 30);
        System.out.println("Original Person:");
        person1.displayPerson();

        System.out.println();

        // Clone using copy constructor
        Person person2 = new Person(person1);
        System.out.println("Cloned Person:");
        person2.displayPerson();
    }
}
