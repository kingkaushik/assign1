interface inf1
{
public void call1();
}
interface inf2
{
public void call2();
}
abstract class cl1
{
abstract void call3();
void call4()
{
System.out.println("call4");
}
}
class inh extends cl1 implements inf1,inf2
{

public void call1()
{
System.out.println("call1");
}
public void call2()
{
System.out.println("call2");
}
public void call3()
{
System.out.println("call3");
}
public static void main(String args[])
{
inh i=new inh();
i.call1();
i.call2();
i.call3();
i.call4();
}
}
