package Tasks;

import java.util.Scanner;

public class Score_Calculator {
    public static void main(String[] args) {

        System.out.println("Enter your score");
        Scanner scanner = new Scanner(System.in);
        int score= scanner.nextInt();


        switch(score){

            case 1:
                if(score>=90&&score<=100){

                    System.out.println("Excellent your grade is A");
                }
                break;


            case 2:
                if(score>=90&&score<=100){

                    System.out.println("Excellent your grade is A");
                }

                break;

            case 3:

                if(score>=80&&score<=89)
                {
                    System.out.println("Very Good your grade is B");
                }

                break;

            case 4:
                if(score>=70&&score<=79){

                    System.out.println("Good your grade is C");
                }

                break;

            case 5:

                if(score>=60&&score<=69)
                {
                    System.out.println("Need Improvement your grade is D");
                }

                break;

            default:

                if(score>=0&&score<=59)
                {
                    System.out.println(" POOR Fail Grade F");
                }

                break;


        }
    }
}
