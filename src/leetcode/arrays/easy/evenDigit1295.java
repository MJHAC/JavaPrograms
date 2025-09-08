package leetcode.arrays.easy;

public class evenDigit1295 {
    public static void main(String[] args) {
        int[] arr={5,66,96,95,9999,999};
        int count=0;
        for (int j : arr) {
            boolean check = even(j);
            if (check) {
                count++;
            }
        }
        System.out.println(count);
    }
    static int digits2(int n){
        if(n==0){
            return -1;
        }
        if(n<0){
            n=n*-1;
        }
        return (int)Math.log10(n)+1;
    }
    static int digits1(int n){
        if(n==0){
            return -1;
        }
        if(n<0){
            n=n*-1;
        }
        int count=0;
        while(n>0){
            count++;
            n/=10;
        }
        return count;
    }
    static boolean even(int n){
        //int evenn=digits1(n);
        int ev=digits2(n);
        //return evenn%2==0;
        return ev%2==0;
    }
}
