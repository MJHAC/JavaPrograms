import java.util.Scanner;

public class ReverseArray {
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
        System.out.println("The elements in the array are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int start=0,last=n-1;
        while(start<last){
            int temp=arr[start];
            arr[start]=arr[last];
            arr[last]=temp;
            start++;
            last--;
        }
        System.out.println("The elements after reversing are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}