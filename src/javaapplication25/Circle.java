
package javaapplication25;
public class Circle extends Shape{
    private double raduis;
    private static int count=0;
    public Circle()
    {
        count++;
    }
    public Circle(double raduis,Point p)
    {
        super( p);
        this.raduis=raduis;
        
       count++;
        
    }

    public double getRaduis() {
        return raduis;
    }

    public static int getCount() {
        return count;
    }

    public void setRaduis(double raduis) {
        this.raduis = raduis;
    }

    public static void setCount(int count) {
        Circle.count = count;
    }
    public double area()
    {
        double a=3.14*raduis*raduis;
        return a;
        
    }
    @Override
    public double perimeter()
    {
        return 2*3.14*raduis;
    }
    public double diameter()
    {
        return 2*raduis;
    }
    @Override
    public String toString()
    {
        return super.toString()+"raduis : "+raduis;
    }
    
    
    
    
}
