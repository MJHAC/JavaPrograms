package leetcode.search;

import java.util.Scanner;

public class FirstLastPosElement34 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int n=obj.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0;i<n;i++){
            nums[i]=obj.nextInt();
        }
        System.out.println("Enter the target element:");
        int target=obj.nextInt();
        int first=search(nums,target,true);
        int last=search(nums,target,false);
        int[] arr={-1,-1};
        arr[0]=first;
        arr[1]=last;
        System.out.println("["+arr[0]+","+arr[1]+"]");
    }
    static int search(int[] nums,int target,boolean index){
        int start=0,end=nums.length-1,ans=-1;
        int[] res={-1,-1};
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else {
                ans=mid;
                if(index){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
