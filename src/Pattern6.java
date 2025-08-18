import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        int row;
        char ch;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of rows to get a Pattern: 1 the pattern increases by one until the last row and the number also increases by one");
        row=obj.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"");
            }
            System.out.println();
        }
    }
}
