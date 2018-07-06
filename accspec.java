class A
{
private int a=5;
public void printa()
{
System.out.println("a");
}
}
class B extends A
{
public static void main(String args[])
{
B b=new B();
System.out.println(b.a);
}
}
