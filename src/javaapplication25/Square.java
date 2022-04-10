
package javaapplication25;

public class Square extends Rectangle {
    private static int count=0;
    public Square(){count++;}
    public Square(double width,Point p)
    {
        super(width,width,p);
        count++;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Square.count = count;
    }
    @Override
    public double area()
    {
        return super.area();
    }
    @Override
    public double perimeter()
    {
        return 4*super.getWidth();
    }
    public String toString()
    {
        return super.toString();
    }
}
    

