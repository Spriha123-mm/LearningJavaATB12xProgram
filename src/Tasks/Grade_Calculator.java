package Tasks;

import java.util.Scanner;

public class Grade_Calculator {
    public static void main(String[] args) {

        System.out.println("Enter your Grade");
        Scanner scanner = new Scanner(System.in);
        String Grade= scanner.nextLine();


        switch(Grade)
        {
            case "A":
                System.out.println("Excellent");
                break;

            case "B":
                System.out.println("Very Good");
                break;

            case "C":

                System.out.println("Good");
                break;

            case "D":
                System.out.println("Needs Improvement");
                break;

            case "E":
                System.out.println("Fail");
                break;

            default:
                System.out.println("Invalid Grade");
                break;
        }

    }
}
