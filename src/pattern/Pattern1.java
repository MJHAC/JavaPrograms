package pattern;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        int row,col;
        char ch;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the rows and columns to get a Pattern: ******** the same paatern repeats in all the rows");
        row=obj.nextInt();
        col= obj.nextInt();
        System.out.println("Enter the character you want:");
        ch=obj.next().charAt(0);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(ch+"");
            }
            System.out.println();
        }
    }
}
