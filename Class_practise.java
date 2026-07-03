class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Class_practise {
    public static void main(String[] args) {
        Student s1 = new Student(); // Object creation

        s1.name = "Alice";
        s1.age = 20;

        s1.display();
    }
}