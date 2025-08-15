import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        int a,b,sum;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        System.out.print("a:");
        a=obj.nextInt();
        System.out.print("b:");
        b= obj.nextInt();
        sum=a+b;
        System.out.println("The addition of "+a+" and "+b+" are "+sum);
    }
}
