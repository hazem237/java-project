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
public  abstract class Shape implements Operation{
   private Point point;
   private static int count;
   public Shape()
   {
   }
   public Shape(Point point)
   {
       this.point=point;
   }

    public void setPoint(Point point) {
        this.point = point;
    }

    public static void setCount(int count) {
        Shape.count = count;
    }

    public Point getPoint() {
        return point;
    }

    public static int getCount() {
        return count;
    }
   public abstract double perimeter();
   public String toString()
   {
       return "the point : "+point.toString()+"Count : "+count;
   }
   
    
    
}
