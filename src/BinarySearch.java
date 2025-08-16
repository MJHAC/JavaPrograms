import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements into the array:");
        for(int i=0;i<n;i++){
            arr[i]=obj.nextInt();
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
        int index=-1,found=0,start=0,last=n-1,target;
        System.out.println("Enter the element to be found:");
        target=obj.nextInt();
        while(start<=last){
            int middle=(start+last)/2;
            if(arr[middle]==target){
                index=middle;
                break;
            }
            else if(arr[middle]>target){
                last=middle-1;
            } else if(arr[middle]<target){
                start=middle+1;
            }
        }
        if(index!=1){
            System.out.println("The element "+target+" is found at the index "+index);
        }
    }
}
