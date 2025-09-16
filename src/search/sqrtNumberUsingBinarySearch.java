package search;

import java.util.Scanner;

public class sqrtNumberUsingBinarySearch {
    public static void main(String[] args) {
        int x;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the value to get the square root of a number:");
        x=obj.nextInt();
        int res=sqrt(x);
        System.out.println("The Square root value of "+x+" is "+res);
    }
    static int sqrt(int x){
        int start=0,end=x,res=-1;
        while(start<end){
            int mid=start+(end-start)/2; //Overflow protection
            if((long)mid*mid<=x){
                res=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return res;
    }
}
