package ex_16_Array;

import java.util.Scanner;

public class Lab_153_User_input_for_array {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size= scanner.nextInt();
        String[] number= new String[5];


        for(int i=0;i< number.length;i++){
            System.out.print(i);
            number[i]= scanner.next();
        }

        for(String element:number){

            System.out.println(element);

        }
    }
}
