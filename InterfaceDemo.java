import java.util.Scanner;

// First Interface
interface Academic
{
    void getAcademicDetails();
    void displayAcademicDetails();
}

// Second Interface
interface Sports
{
    void getSportsDetails();
    void displaySportsDetails();
}

// Student class implementing both interfaces
class Student implements Academic, Sports
{
    Scanner sc = new Scanner(System.in);

    String name;
    int rollNo;
    double marks;
    String sport;
    int score;

    public void getAcademicDetails()
    {
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter Academic Marks: ");
        marks = sc.nextDouble();
    }

    public void getSportsDetails()
    {
        sc.nextLine();

        System.out.print("Enter Sport Name: ");
        sport = sc.nextLine();

        System.out.print("Enter Sports Score: ");
        score = sc.nextInt();
    }

    public void displayAcademicDetails()
    {
        System.out.println("\n--- Academic Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Marks: " + marks);
    }

    public void displaySportsDetails()
    {
        System.out.println("\n--- Sports Details ---");
        System.out.println("Sport: " + sport);
        System.out.println("Score: " + score);
    }
}

// Main Class
class InterfaceDemo
{
    public static void main(String args[])
    {
        Student s = new Student();

        s.getAcademicDetails();
        s.getSportsDetails();

        s.displayAcademicDetails();
        s.displaySportsDetails();
    }
}