import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        int n,sumn=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter upto how much you want to get the sum:");
        n=obj.nextInt();
        for(int i=1;i<=n;i++){
            sumn+=i;
        }
        System.out.println("The sum of first "+n+" natural numbers is "+sumn);
    }
}
