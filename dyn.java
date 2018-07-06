class A
{
public void show()
{
System.out.println("In class A");
}
}
class B extends A
{
public void show()
{
System.out.println("In class B");
}
}
class dyn
{
public static void main(String args[])
{
A a=new A();
A b=new B();
a.show();
b.show();
}
}
