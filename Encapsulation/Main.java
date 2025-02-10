package Encapsulation;

class Person {
    // Private variables
    private String name;
    private int age;

    // Constructor to initialize values
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method to get name
    public String getName() {
        return name;
    }

    // Setter method to set name
    public void setName(String name) {
        this.name = name;
    }

    // Getter methos to get age
    public int getAge() {
        return age;
    }

    // Setter method to set age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age can not be negetive!");
        }
    }

    // Display details
    public void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Miraj", 25);

        System.out.println(p1.getName());

        p1.setName("Mustak");

        System.out.println(p1.getName());

        p1.display();

    }
}
