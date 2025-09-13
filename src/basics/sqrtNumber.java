package basics;

import java.util.Scanner;

public class sqrtNumber {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of which you want the square root:");
        int x=obj.nextInt();
        int sqrt=mySqrt(x);
        System.out.println("The square root of the number "+x+" is "+sqrt);
    }
    static int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }
}
