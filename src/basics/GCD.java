package basics;
import java.util.Scanner;

public class GCD {
    static int gcd(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static void main(String[] args) {
        int a,b,n;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the numbers which you want to get the gcd ");
        a=obj.nextInt();
        b=obj.nextInt();
        n=gcd(a,b);
        System.out.println("The GCD of the numbers "+a+" and "+b+" are "+n);
    }
}
