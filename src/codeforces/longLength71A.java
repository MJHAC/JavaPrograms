package codeforces;
import java.util.*;

public class longLength{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        String str=obj.nextLine();
        int count=length(str);
        System.out.println(str.charAt(0)+""+count+""+str.charAt(str.length()-1));
    }
    public static int length(String str){
        int count=0;
        for(int i=0;i<str.length()-1;i++){
            if(i!=0||i!=str.length()-1){
                count++;
            }
        }
        return count;
    }
}