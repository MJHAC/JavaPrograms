package search;

import java.util.Arrays;
import java.util.Scanner;

public class floorSearch {
    public static void main(String[] args) {
        int n;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = obj.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements into the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        /*for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }*/
        Arrays.sort(arr);
        System.out.println("Enter the element to be found:");
        int target = obj.nextInt();
        int flooringNumber =flooring(arr,target);
        System.out.println(flooringNumber);
    }
    static int flooring(int[] arr,int target){
        int index = -1, start = 0, end = arr.length- 1;
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (arr[middle] == target) {
                return middle;
            } else if (arr[middle] > target) {
                end = middle - 1;
            } else if (arr[middle] < target) {
                start = middle + 1;
            }
        }
        return end;
    }
}
