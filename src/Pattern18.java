import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        int row,col;
        char ch;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns to get a Pattern:");
        row=obj.nextInt();
        col=obj.nextInt();
        int a=0,count=1;
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(count+" ");
                if(a==0){
                    count=0;
                    a++;
                }
                else {
                    count=1;
                    a--;
                }
            }
            System.out.println();
        }
    }
}

/*
* import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = obj.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
sum of even i and j are 1 and odd sum are 0
1
01
101
0101
*/