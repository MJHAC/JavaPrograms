package leetcode.arrays.easy;

public class noGP1512 {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,1,3};
        int count=numIdenticalPairs(arr);
        System.out.print(count);
    }
    static int numIdenticalPairs(int[] nums) {
        int countgp=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    if(i<j){
                        countgp++;
                    }
                }
            }
        }
        return countgp;
    }
}
