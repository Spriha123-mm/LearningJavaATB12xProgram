package ex_08_If_Else_Condition_Statements;

import java.util.Scanner;

public class Lab_75_Practice_multipleinput_scaneerclass {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);


        System.out.println("Enter your name");
        String name= scanner.nextLine();

        System.out.println("Enter your age");
        int age= scanner.nextInt();

        System.out.println("Enter your salary");
        double salary= scanner.nextDouble();

        System.out.println(age);
        System.out.println(name);
        System.out.println(salary);

        scanner.close();


    }
}
