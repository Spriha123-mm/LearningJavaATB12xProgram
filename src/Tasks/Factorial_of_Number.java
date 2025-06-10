package Tasks;

import java.util.Scanner;

public class Factorial_of_Number {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner= new Scanner(System.in);
        int num= scanner.nextInt();
        int Fact=1;

        if(num>=0)
        {
            Fact=1;

        }

        for(int i =1;i<=num;i++)
        {
            Fact=Fact*i;

        }
        System.out.println(Fact);

    }
}
