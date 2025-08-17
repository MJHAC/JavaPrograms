import java.util.Scanner;

public class Move0toend {
    static int[] Swap(int[] arr,int n){
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                int temp=arr[i];
                arr[i]=arr[n-1];
                arr[n-1]=temp;
                return Swap(arr,n-1);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int n,max=0,min=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements into the array:");
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
        }
        int[] temp=new int[n];
        temp=Swap(arr,n);
        System.out.println("The array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}


/*
import java.util.Scanner;

public class Move0toend {
    static void moveZeros(int[] arr, int n) {
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < n) {
            arr[index++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = obj.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements into the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = obj.nextInt();
        }
        moveZeros(arr, n);
        System.out.println("Array after moving zeros to the end:");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
*/