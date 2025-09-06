package basics;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int leapYear;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the year you want to check is a leap year or not");
        leapYear=obj.nextInt();
        //Leap Year are those which are divided by 4 and reminder obtained is 0 as leap year has 366 days as February which has normally 28 days will have 29 days
        if(leapYear%4==0){
            System.out.println("The year "+leapYear+" is a leap year");
        }
        else{
            System.out.println("The year "+leapYear+" is not a leap year");
        }
    }
}
