package ex_16_Array;

import java.util.Arrays;

public class Lab_158_Array_sort_function {
    public static void main(String[] args) {

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};//100,34
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length - 2]);
        System.out.println(numbers[numbers.length - 3]);
        System.out.println(numbers[numbers.length - 4]);
    }
}
