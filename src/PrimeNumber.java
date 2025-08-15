import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrimeNumber(int n){
        int count=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count<2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number you want to check is a prime number or not");
        n=obj.nextInt();
        boolean prime=isPrimeNumber(n);
        if(prime){
            System.out.println("The number "+n+" is a prime number");
        }
        else{
            System.out.println("The number "+n+" is not a prime number");
        }
    }
}
