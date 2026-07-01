import java.util.Scanner;
class Input
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name = x.nextLine();
        System.out.println("Hello " + name);
        Scanner y = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = y.nextInt();
        System.out.println("Your age is " + age);
    }
    
}
