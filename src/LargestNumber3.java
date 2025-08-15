import java.util.Scanner;

public class LargestNumber3 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the three numbers to be checked whether it is largest or not:");
        a=obj.nextInt();
        b=obj.nextInt();
        c=obj.nextInt();
        if(a>b && a>c){
            System.out.println("The largest number among the three numbers "+a+","+b+","+c+" is "+a);
        }else if(b>a && b>c){
            System.out.println("The largest number among the three numbers "+a+","+b+","+c+" is "+b);
        }else if(c>b && c>a){
            System.out.println("The largest number among the three numbers "+a+","+b+","+c+" is "+c);
        }
    }
}
