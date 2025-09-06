package pattern;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        int row,col;
        char ch;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns to get a Pattern: 1 the pattern increases by one until the last row and the number also increases by one");
        row=obj.nextInt();
        col=obj.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print(i+"");
            }
            System.out.println();
        }
    }
}
