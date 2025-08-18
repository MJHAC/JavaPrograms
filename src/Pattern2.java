import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        int row;
        char ch;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of rows to get a Pattern: * the pattern increases by one until the last row");
        row=obj.nextInt();
        System.out.println("Enter the character you want:");
        ch=obj.next().charAt(0);
        for(int i=0;i<row;i++){
            for(int j=0;j<i;j++){
                System.out.print(ch+"");
            }
            System.out.println();
        }
    }
}
