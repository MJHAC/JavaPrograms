package leetcode.arrays.easy;

public class arrayPermutation1920 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,0,5};
        arr=answer(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static int[] answer(int[] arr){
        int n=arr.length;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=arr[arr[i]];
        }
        return ans;
    }
}
