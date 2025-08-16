import java.util.Locale;
import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        String input=new String();
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the string to be reversed:");
        input=obj.nextLine();
        StringBuilder s=new StringBuilder(input);
        s.reverse();
        if(input.toLowerCase().equals(s.toString().toLowerCase())){
            System.out.println("The string "+input+" is a palindrome.");
        }
        else{
            System.out.println("The string "+input+" is not a palindrome.");
        }
    }
}
