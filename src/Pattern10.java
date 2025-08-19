import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        int row,col;
        char ch;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns to get a Pattern:");
        row=obj.nextInt();
        col=obj.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i == 0 || j == 0 || i ==row - 1 || j == col - 1){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
