class A1
{
public void show()
{
System.out.println("in a");
}
}
class B1 extends A1
{
public void show()
{
System.out.println("in b");
}
}
class updown
{
public static void main(String args[])
{
A1 a=new A1();
A1 b=new B1();
A1 a1;
a1=b;//upcast
B1 b1=(B1)b;//downcast
a.show();
a1.show();
b1.show();
}
}
