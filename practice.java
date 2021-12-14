import java.util.*;
import java.lang.*;

abstract class Shape
{
    int a,b;
    Shape(int c, int d)
    {
        a=c;
        b=d;
    }
    Shape(int c)
    {
        a=c;
    }
    void printarea()
    {}
}
class Rectangle extends Shape
{
    Rectangle(int a, int b)
    {
       super(a,b); 
    }
    void printarea(){
        System.out.println("area of rect="+(a*b)+ "sq units");
    }
}
class Triangle extends Shape{
    Triangle(int a, int b)
    {
        super(a,b);
    }
    void printarea(){
        System.out.println("triangle area= "+((a*b)/2));
    }
}
class Circle extends Shape{
    Circle(int a)
    {
        super(a);
    }
    void printarea(){
        System.out.println("circle area= "+(float)(3.14*a*a));
    }
}
class practice{
    public static void main(String args[]){
        Rectangle r = new Rectangle(4, 6);
        Triangle t = new Triangle(8, 7);
        Circle c = new Circle(5);
        r.printarea();
        t.printarea();
        c.printarea();


    }
}