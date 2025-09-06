package basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n,fact=1;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the upto which you want to get the factorial upto:");
        n=obj.nextInt();
        if(n==0||n==1){
           fact=1;
        }
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println("The factorial of the number "+n+" is "+fact);
    }
}
