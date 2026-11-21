import java.util.Scanner;
class constructor     
{
    int id;
    String name ;
    double salary;
    constructor()
    {
        id =0;
        name  = " ";
        salary = 0;
    }
    constructor( String name )
    {
        this.name = name ;
    }
    constructor( String name , double salary)
    {
        this.name = name;
        this.salary = salary;
    }
    constructor( int id , String name , double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    void display()
    {
        System.out.println( " ID ="+ id);
        System.out.println("name = "+ name );
        System.out.println(" salary ="+salary);
        System.out.println(" Anual salary "+ ( salary *12));
        System.out.println();
    }
}   
    
public class constructordemo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner( System.in);
        System.out.println(" enter the employee id:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println( " enetr name of employee :");
        String name = sc.nextLine();
        System.out.println( " eneter salary :");
        double salary = sc.nextDouble();
            
            
        constructor e1 = new constructor();
        e1.display();
        constructor e2 = new constructor(name);
        e2.display();
        constructor e3 = new constructor(name,salary);
        e3.display();
        constructor e4 = new  constructor( id , name , salary);
        e4.display();
    }
}