package leetcode.arrays.easy;

public class smallerNumberCount1365 {
    public static void main(String[] args) {
        int[] arr={8,1,2,2,3};
        arr=smallerNumbersThanCurrent(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int countG=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    countG++;
                }
            }
            arr[i]=countG;
        }
        return arr;
    }
}
