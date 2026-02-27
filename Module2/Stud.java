
package Assign2;

public class Stud
{
    int rollNo;
    String name;
    Stud()
    {
        rollNo = 0;
        name = "Not Assigned";
    }
    Stud(int r, String n)
    {
        rollNo = r;
        name = n;
    }
    void display()
    {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println();
    }


    public static void main(String[] args)
    {
        Stud s1 = new Stud();
        Stud s2 = new Stud(101, "Vivek");
        s1.display();
        s2.display();
    }
}