package class_and_objects;

public class School {
    public static void main(String[] args) {
        class_and_objects.Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "BOB";
        student2.id = "13";

        System.out.println(student1.name);
        System.out.println(student1.id);
        System.out.println(student2.name);
        System.out.println(student2.id);
    }
}
