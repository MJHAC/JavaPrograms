package search;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int n,target;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n=obj.nextInt();
        if(n==0){
            System.out.println("Thanks Nothing to be found and added in the array.");
        }
        else{
            int[] arr=new int[n];
            System.out.println("Enter the array elements into the array:");
            for(int i=0;i<n;i++){
                arr[i]=obj.nextInt();
            }
            System.out.println("Enter the element you need to find:");
            target= obj.nextInt();
            for(int i=0;i<n;i++){
                if(target==arr[i]){
                    System.out.println("The element "+target+" is found at the array index "+i);
                }
            }
        }
    }
}
