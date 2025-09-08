package leetcode.arrays.hard;

public class richness1672 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{2,2,3}};
        int max=wealth(arr);
        System.out.println(max);
    }
    static int wealth(int[][] accounts){
        int ans= Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}