package codeforces;
import java.util.*;

public class watermelon7A {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        if (n > 2 && n % 2 == 0) {
            System.out.print("YES");
        }
        else {
            System.out.print("NO");
        }
    }
}
