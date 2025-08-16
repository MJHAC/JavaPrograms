import java.util.Scanner;

public class CountVowCons {
    public static void main(String[] args) {
        String s=new String();
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the string to see how many Vowels and Constants are present in the given string:");
        s=obj.nextLine();
        int countvow=0,countconst=0,countblank=0,count=0,countspec=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetter(ch)){
                if(s.toUpperCase().charAt(i)=='A'|| s.toUpperCase().charAt(i)=='E' || s.toUpperCase().charAt(i)=='I' || s.toUpperCase().charAt(i)=='O' || s.toUpperCase().charAt(i)=='U'){
                    countvow++;
                }
                else{
                    countconst++;
                }
            }
            else if(Character.isWhitespace(ch)){
                countblank++;
            }
            else if (Character.isDigit(ch)) {
                count++;
            }
            else{
                countspec++;
            }
        }
        System.out.println("The Total number of Constants are "+countconst+" ,the total number of vowels are "+countvow+" ,the total number of blank spaces are "+countblank+" ,the total number of numbers/digits are "+count+" and the total number of special characters are "+countspec);
    }
}
