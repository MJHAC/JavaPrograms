import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Twopointers {
    public static void main(String[] args) {
        int start,end;
        start=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=obj.nextInt();
        end=n-1;
        ArrayList<Integer> list=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            list.add(obj.nextInt());
        }
        swap(list,start,end);
        for(int i=0;i<n;i++){
            System.out.print(list.get(i)+" ");
        }
    }
    static void swap(ArrayList<Integer> arr,int s,int e){
        while(e>s){
            Collections.swap(arr,s,e);
            s++;
            e--;
        }
    }
}
