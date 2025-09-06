package pattern;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        int row;
        char ch;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of rows to get a Pattern: 55555 the pattern decreases by one until the last row and the number also decreases by one");
        row=obj.nextInt();
        for(int i=row;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(i+"");
            }
            System.out.println();
        }
    }
}
