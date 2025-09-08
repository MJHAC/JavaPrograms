package leetcode.arrays.easy;

public class concat1929 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1};
        arr = concatArray(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    static int[] concatArray(int[] nums) {
        int n = nums.length;
        int len = 2 * n;
        int[] ans = new int[len];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[n + i] = nums[i];
        }
        return ans;
    }
}
