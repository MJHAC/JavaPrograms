import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        long a,b,res;
        int opt;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the numbers you want to do operations on :");
        a=obj.nextLong();
        b=obj.nextLong();
        System.out.println("Enter your choice of operation like \n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
        opt=obj.nextInt();
        switch(opt) {
            case 1 -> {
                res = a + b;
                System.out.println("The Result of the operation + on " + a + " and " + b + " is " + res);
            }
            case 2 -> {
                res = a - b;
                System.out.println("The Result of the operation - on " + a + " and " + b + " is " + res);
            }
            case 3 -> {
                res = a * b;
                System.out.println("The Result of the operation * on " + a + " and " + b + " is " + res);
            }
            case 4 -> {
                if (b == 0) {
                    System.out.println("Not possible or Infinity");
                } else {
                    res = a / b;
                    System.out.println("The Result of the operation / on " + a + " and " + b + " is " + res);
                }
            }
        }
    }
}
