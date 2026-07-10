class Student {
    int rollno;
    String name;

    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
}1

class Array_of_object
{
    public static void main(String args[])
    {
        Student s[] = new Student[3]; 

        s[0] = new Student(101, "John");
        s[1] = new Student(102, "David");
        s[2] = new Student(103, "Smith");

        for(int i = 0; i < s.length; i++)
        {
            System.out.println(s[i].rollno + " " + s[i].name);
        }
    }
}
