package basics;
import java.util.Scanner;

public class Swapping {
    public int[] Swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        return new int[]{a, b};
    }
}
class Main1{
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter the values to be swapped:");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        System.out.println("Before Swapping a= "+a+" and b= "+b);
        Swapping sc=new Swapping();
        int[] hold=sc.Swap(a,b);
        a=hold[0];
        b=hold[1];
        System.out.println("After Swapping a= "+a+" and b= "+b);
    }
}
