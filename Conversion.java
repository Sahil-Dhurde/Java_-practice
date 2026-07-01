public class Conversion {
    public static void main(String[] args) {
        // int a = 10;
        // double b = a; // Implicit conversion from int to double
        // System.out.println("Implicit conversion: " + b);

        // double c = 9.78;
        // int d = (int) c; // Explicit conversion from double to int
        // System.out.println("Explicit conversion: " + d);


        byte b = 127;
        System.out.println("Byte Value: " +b);
        int a =b;
        System.out.println("Int Value: " +a);  

        float f = 10.5f;
        int c=(int) f; // Explicit conversion from float to int
        System.out.println("Explicit conversion from float to int: " + c);
    }
}
