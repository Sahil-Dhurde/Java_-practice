class Calculator {

    // Method with two integer parameters
    void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    // Overloaded method with three integer parameters
    void add(int a, int b, int c) {
        System.out.println("Sum of three integers: " + (a + b + c));
    }

    // Overloaded method with double parameters
    void add(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Calling different overloaded methods
        calc.add(10, 20);
        calc.add(10, 20, 30);
        calc.add(10.5, 20.5);
    }
}