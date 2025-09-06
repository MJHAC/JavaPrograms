package basics;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        int n,num;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of which you want multiplication table:");
        num=obj.nextInt();
        System.out.println("Enter upto where you want the table to go:");
        n=obj.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(num+" * "+i+" = "+(i*num));
        }
    }
}
