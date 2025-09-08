package leetcode.arrays.easy;

public class runningsum1D1480 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        arr=runningSum(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static int[] runningSum(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            nums[i]=sum;
        }
        return nums;
    }
}
