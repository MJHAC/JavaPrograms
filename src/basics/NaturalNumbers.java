package basics;

import java.util.*;

public class NaturalNumbers {
    public static void main(String[] args) {
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the numbers upto which you want to get numbers:");
        n=obj.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}
