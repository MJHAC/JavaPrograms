import java.util.*;
public class Reverse {
    public int exec(int n) {
        int rem = 0, rev = 0;
        while (n!=0) {
            rem = n % 10;
            n= n / 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rem > 7))
                return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rem < -8))
                return 0;

            rev = rev * 10 + rem;
        }
        return rev;
    }
}


/*This is a main function put it in the main function available*/
class Main {
    public static void main(String[] args) {
        int n,rev;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number to be reversed:");
        n=obj.nextInt();
        Reverse r=new Reverse();
        rev=r.exec(n);
        System.out.println(rev);
    }
}