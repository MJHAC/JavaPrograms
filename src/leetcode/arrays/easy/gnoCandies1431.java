package leetcode.arrays.easy;

//import java.util.ArrayList;
import java.util.*;

public class gnoCandies1431 {
    public static void main(String[] args) {
        int[] arr={2,3,5,1,3};
        List<Boolean> list=kidsWithCandies(arr,3);
        for(boolean i:list){
            System.out.print(i+" ");
        }
    }
    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        int max=0;
        List<Boolean> list=new ArrayList<>();
        for(int i:candies){
            max=Math.max(max,i);
        }
        for(int i:candies){
            list.add(i+extraCandies>=max);
        }
        return list;
    }
}
