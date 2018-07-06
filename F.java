class A
{
int a,b,c;
public int sum(int a,int b)
{
this.a=a;
this.b=b;
return a+b;
}
public int sum(int a,int b,int c)//method overloading
{
this.a=a;
this.b=b;
this.c=c;
return a+b+c;
}
}

class B extends A
{
public int sum(int a,int b)//method overriding
{
super.a=a;
super.b=b;
return a+b;
}
}

class F
{
public static void main(String args[])
{
A a=new A();
B b=new B();
A c=new B();
System.out.println(a.sum(3,4,5));
System.out.println(b.sum(4,6));
System.out.println(c.sum(4,6));
}
}
