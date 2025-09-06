package basics;

import java.util.Scanner;

public class Area {
    static double Area(double l,double b){
        return l*b;
    }
    static double Area(double r){
        return (double) (3.14*r*r);
    }
    static double Area(double b,double h,boolean isTriangle){
        return (double) (0.5*b*h);
    }

    public static void main(String[] args) {
        double l,b,h,r,rectArea,circleArea,triArea;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the length,breadth,height,radius");
        l=obj.nextDouble();
        b=obj.nextDouble();
        h=obj.nextDouble();
        r=obj.nextDouble();
        rectArea=Area(l,b);
        circleArea=Area(r);
        triArea=Area(b,h,true);
        System.out.println("The area of the Rectangle is "+rectArea);
        System.out.println("The area of the Circle is "+circleArea);
        System.out.println("The area of the Triangle is "+triArea);
    }
}
