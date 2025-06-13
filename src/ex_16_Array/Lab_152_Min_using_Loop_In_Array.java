package ex_16_Array;

public class Lab_152_Min_using_Loop_In_Array {
    public static void main(String[] args) {
        int[] number = {12, 19, 90, 56, 100, 769};

        int min = number[0];

        for (int i = 0; i > number.length; i--) {

            if (number[i] < min) {
                min = number[i];
            }


        }
        System.out.println("Min is" + min);
    }
}
