package strings;

import java.util.Scanner;

public class SearchLetter {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=obj.nextLine();
        char ch=obj.next().charAt(0);
    }
    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(char ch:str.toCharArray()){
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}
