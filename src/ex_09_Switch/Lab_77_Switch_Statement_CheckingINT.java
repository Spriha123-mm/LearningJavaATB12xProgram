package ex_09_Switch;

import java.util.Scanner;

public class Lab_77_Switch_Statement_CheckingINT {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7");

        if (scanner.hasNextInt()) {
            int typeofday = scanner.nextInt();

            switch (typeofday) {

                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tue");
                    break;
                case 3:
                    System.out.println("Wed");
                    break;
                case 4:
                    System.out.println("Thur");
                    break;
                case 5:
                    System.out.println("Fri");
                    break;
                case 6:
                    System.out.println("Sat");
                    break;
                case 7:
                    System.out.println("Sun");
                    break;
                default:
                    System.out.println("Enter int number from 1 to 7 only, you fool!");


            }
        } else {
            System.out.println("Enter an integer");
        }
    }
}





