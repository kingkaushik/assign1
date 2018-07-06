class Cex extends Exception
{
int age;
public Cex()
{
System.out.println("not eligible age below 18 yrs");
}
}
class CusEx
{
public static void main(String args[]) throws Exception
{
int age=15;
if(age<18)
throw new Cex();
}
}
