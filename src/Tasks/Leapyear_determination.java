package Tasks;

import java.util.Scanner;

public class Leapyear_determination {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month number");
        int month_no= scanner.nextInt();
        System.out.println("Enter the year");
        int year= scanner.nextInt();
        switch(month_no)
        {
            case 1,3,5,7,8,10,12:
                System.out.println(" This month have 31 days");
                break;
            case 4,6,9,11:
                System.out.println(" This month has 30 days");


            case 2:
                if((year%4==0)||(year%400==0)&& (year%100!=0))
                {
                    System.out.println("It has 29 days hence leap year ");
                }
                else{
                    System.out.println("Its has 28 days hence not a leap year");
                }
                break;

            default:
                System.out.println("Invalid data entered");

                 }
    }
}
