class Loops {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 10) {
            System.out.println("Hello World");
            i++;   // Increment i to avoid infinite loop
        }

        int j;
        for (j = 0; j <= 20; j += 2) {
            System.out.println("Even No : " + j);
        }
    }
}