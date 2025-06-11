package Tasks;

import java.util.Scanner;

public class Reversing_number {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to reverse");
        int num= scanner.nextInt();
        int reverse=0;

        while(num>0){

            int digit=num%10;
            reverse= reverse*10+digit;
            num=num/10;

        }
        System.out.println(reverse);
    }


}
