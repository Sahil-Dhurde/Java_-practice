class Condiditional
{
    public static void main(String[] args)
    {
        int a = 10;
        int b = 20;

        if (a > b)
        {
            System.out.println("a is greater than b");
        }
        else
        {
            System.out.println("a is not greater than b");
        }

        //greater between 3 numbers
        int x = 30;
        if (a > b && a > x)
        {
            System.out.println("a is greater than b and x");
        }
        else if (b > a && b > x)
        {
            System.out.println("b is greater than a and x");
        }
        else
        {
            System.out.println("x is greater than a and b");
        }
    }
}