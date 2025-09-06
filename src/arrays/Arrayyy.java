package arrays;

import java.util.Scanner;

public class Arrayyy {
    public static void main(String[] args) {
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the array size:");
        n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements into the array:");
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println("The array elements are:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
