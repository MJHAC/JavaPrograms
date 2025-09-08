package leetcode.arrays.easy;

public class shufflearray1470 {
    public static void main(String[] args) {
        int[] arr={1,2,3,6,4,5};
        arr=shuffle(arr,3);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static int[] shuffle(int[] nums, int n) {
        int[] ans=new int[2*n];
        for(int i=0;i<n;i++){
            ans[2*i]=nums[i];
            ans[2*i+1]=nums[n+i];
        }
        return ans;
    }
}
