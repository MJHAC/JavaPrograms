import java.util.Scanner;

public class Revmethod {
    static int Rev(int n){
        int rev=0,rem=0;
        while(n!=0){
            rem=n%10;
            n=n/10;
            if(rev>Integer.MAX_VALUE/10 || (rev==Integer.MAX_VALUE/10 && rem>7)) return 0;
            if(rev<Integer.MIN_VALUE/10 || (rev==Integer.MIN_VALUE/10 && rem<-8)) return 0;
            rev=rev*10+rem;
        }
        return rev;
    }
    public static void main(String[] args) {
        int n,revnum;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number to be reversed:");
        n=obj.nextInt();
        revnum=Rev(n);
        if(revnum==0 && n!=0){
            System.out.println("The reverse of the number "+n+" is not possible");
        }
        else{
            System.out.println("The reverse of the number "+n+" is "+revnum);
        }
    }
}
