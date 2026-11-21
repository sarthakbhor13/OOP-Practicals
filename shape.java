public class shape {
   void area()
   {
    System.out.println(" area of shape");
   } 
    public static void main(String[] args) 
    {
        circle p1 = new circle();
        p1.area();
        rectangle r1 = new rectangle();
        r1.area();
        triangle t1 = new triangle();
        t1.area();
    }
}
class circle extends shape
{
    double radius = 5;
    double result;
    // method override
    void area()
    {
    result = Math.PI*radius*radius;  //formula
    System.out.println( "Area of circle is :" + result);
    }
}
class rectangle extends shape
{
    int lenght = 10;
    int width = 15;
    int result;
    // method override
    void area()
    {
    result = lenght*width; //formula
    System.out.println( "Area of reactangle is:" + result);
    }
}
class triangle extends shape
{
    double height = 10;
    double base = 15;
    double result;
    // method override
    void area()
    {
    result = base * height * 0.5; //formula
    System.out.println( "Area of triangle is :" + result);
    }
}