package arrays;

import java.util.Scanner;

public class MaxArrayElem {
    public static void main(String[] args) {
        int n,max=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("The max element in the given array is "+max);
    }
}
