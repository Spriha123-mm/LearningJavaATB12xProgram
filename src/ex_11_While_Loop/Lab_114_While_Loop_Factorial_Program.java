package ex_11_While_Loop;

import java.util.Scanner;

public class Lab_114_While_Loop_Factorial_Program {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number");

        int factorial=1;
        int number= scanner.nextInt();

        if(number==0){
            System.out.println("factorial is -> "+factorial);

        }
        int i=1;
        while(i<=number){
            factorial=factorial*i;
            i++;

        }
        System.out.println(factorial);
    }
}
