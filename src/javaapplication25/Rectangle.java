/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication25;

/**
 *
 * @author yas se
 */
public class Rectangle extends Shape {
    private double width;
    private double height;
    private static int count=0;
    public Rectangle ()
    {
        count++;
    }
    public Rectangle(double width,double height,Point p)
    {
        super(p);
        this.height=height;
        this.width=width;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public static int getCount() {
        return count;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public static void setCount(int count) {
        Rectangle.count = count;
    }
    public double perimeter()
    {
        return 2*width*height;
    }
    public double area()
    {
        return width*height;
    }
    public String toString()
    {
        return super.toString()+"Width : "+width+"Height : "+height;
    }
}
