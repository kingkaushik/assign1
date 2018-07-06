class ObjOvr
{
String s1,s2;
public boolean equals(Object obj)
{
if(s1.equals(s2))
return true;
return false;
}
public String toString()
{
return ""+"hi";
}
public static void main(String args[])
{
ObjOvr o=new ObjOvr();
o.s1="hi";
o.s2="hi";
System.out.println(o.s1.equals(o.s2));
System.out.println(o.toString());
}
}
