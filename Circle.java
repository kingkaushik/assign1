public class Circle extends Shape
{
public Circle(float r)
{
super(r);
}
public static void main(String args[])
{
float r=5;
Circle c2=new Circle(r);
System.out.println(c2.getArea());
}
}
