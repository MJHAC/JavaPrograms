import java.util.Scanner;

public class BubbleSort {
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
        System.out.println("The array elements before sorting are:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("The sorted elements in the array are:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
