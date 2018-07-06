public class Square extends Shape
{
public Square(float width,float height)
{
super(width,height);
}
public static void main(String args[])
{
float width=5,height=5;
Shape c2=new Square(width,height);
System.out.println(c2.getArea());
}
}
