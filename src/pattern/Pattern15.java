package pattern;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        int row,col;
        char ch;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns to get a Pattern:");
        row=obj.nextInt();
        col=obj.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
