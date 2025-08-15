import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int n;
        Scanner obj=new Scanner(System.in);
        //Takes input to check
        System.out.println("Enter the number to be checked whether it is even or odd:");
        n=obj.nextInt();
        //checks whether the number given is odd or even if remainder is zero when divided by 2 it is even otherwise it is odd
        if(n%2==0){
            System.out.println("The give number "+n+" is Even number.");
        }
        else{
            System.out.println("The give number "+n+" is Odd number.");
        }
    }
}
