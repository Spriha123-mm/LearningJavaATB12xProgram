package ex_13_Functions;

import java.util.Scanner;

public class Lab_119_calculater_using_fuunctions {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a= scanner.nextInt();
        System.out.println("Enter value of b");
        int b= scanner.nextInt();

        int sum_result= sum(a,b);
        int subtract_result= subtract(a,b);
        int multiply_result= multiply(a, b);
        int divide_result= divide(a, b);
        int modulus_result= modulus( a,b);

        System.out.println("The sum of the two numbers is\t->"+sum_result);
        System.out.println("The subtraction of the two numbers is\t->"+subtract_result);
        System.out.println("The multiplication of the two numbers is\t->"+multiply_result);
        System.out.println("The division of the two numbers is\t->"+divide_result);
        System.out.println("The modulus of the two numbers is\t->"+modulus_result);

    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a*b;
    }
    static int divide(int a, int b) {
        return a / b;
    }
    static int modulus(int a, int b){
        return a%b;
    }
}
