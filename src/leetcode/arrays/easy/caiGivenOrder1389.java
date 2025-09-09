package leetcode.arrays.easy;
import java.util.*;
public class caiGivenOrder1389 {
    public static void main(String[] args) {
        int[] arr={0,1,2,3,4};
        int[] index={0,1,2,2,1};
        arr=createTargetArray(arr,index);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
    static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=list.get(i);
        }
        return nums;
    }
}
