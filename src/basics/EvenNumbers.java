package basics;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the numbers upto which you want to check and get even numbers:");
        n=obj.nextInt();
        for(int i=0;i<n;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
