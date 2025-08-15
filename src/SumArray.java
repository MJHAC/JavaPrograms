import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements into the array:");
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
            sum+=arr[i];
        }
        System.out.println("The sum of the array elements are: "+sum);
    }
}
