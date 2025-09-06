package pattern;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        int row;
        char ch;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of rows to get a Pattern: 12345 the pattern decreases by one until the last row and the number also decreases by one");
        row=obj.nextInt();
        for(int i=row;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
}
