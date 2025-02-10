package class_and_objects;

class Car {
    String brand;
    String color;
    int seats = 4;

    Car() {
        brand = "Unknown";
        color = "Unknown";
        seats = 4;
    }

    Car(String b, String c, int s) {
        brand = b;
        color = c;
        seats = s;
        System.out.println(brand + " car is created!");
    }

    void showDetails() {
        System.out.println(brand);
        System.out.println(color);
        System.out.println(seats);
    }
}

class Person {
    String name;
    String address;
    int age;

    void showDetails() {
        System.out.println(name);
        System.out.println(address);
        System.out.println(age);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyotaa", "Red", 2);
        Car car2 = new Car("BMW", "Black", 4);
        Car car3 = new Car();
        // car1.brand = "Toyota";

        Person p1 = new Person();
        p1.name = "Mokhles";
        p1.address = "New York";
        p1.age = 32;

        car1.showDetails();
        car2.showDetails();
        p1.showDetails();
        car3.showDetails();
    }
}