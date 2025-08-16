import java.util.Scanner;

public class RevString {
    public static void main(String[] args) {
        String input=new String();
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the string to be reversed:");
        input=obj.nextLine();
        StringBuilder s=new StringBuilder(input);
        s.reverse();
        System.out.println("The reverse of the string "+input+" is "+s);
    }
}
