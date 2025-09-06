package strings;

import java.util.Scanner;

public class StringCompar {
    public static void main(String[] args) {
        String s1=new String();
        String s2=new String();
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the  two strings to be checked for comparision of equality:");
        System.out.println("Enter the first String:");
        s1=obj.nextLine();
        System.out.println("Enter the second String:");
        s2=obj.nextLine();
        if(s1.equals(s2)){
            System.out.println("The string "+s1+" and string "+s2+" are same");
        } else if (s1.compareTo(s2)>0) {
            System.out.println("The string "+s1+" is larger than string "+s2);
        }else if (s2.compareTo(s1)>0) {
            System.out.println("The string "+s2+" is larger than string "+s1);
        }
    }
}
