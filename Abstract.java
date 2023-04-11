abstract class Shape
{  
  double length,breadth;
  Shape(double length,double breadth)
  {
     this.length=length;
    this.breadth=breadth;
  }
  abstract int getArea();
}
public class Rectangle extends Shape
  { 
     Rectangle(double l,double b)
     {
      super(l,b);
      }
      
    public int getArea()
    {
    return length*breadth;
    }
 }
 public class Test
 {
    public static void main(String[] args)
    {
     Rectangle obj=new Rectangle(10,20):
     System.out.println("The area of the Rectangle is : "+ obj.getArea());
    }
 }
