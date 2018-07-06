public class Shape
{
float area,perimeter;
public Shape(float r)
{
this.area=(22/7)*r*r;
this.perimeter=2*(22/7)*r;
}
public Shape(float width,float height)
{
this.area=width*height;
this.perimeter=2*width*height;
}
public  float getArea()
{
return area;
}
public float getPerimeter()
{
return perimeter;
}
}

