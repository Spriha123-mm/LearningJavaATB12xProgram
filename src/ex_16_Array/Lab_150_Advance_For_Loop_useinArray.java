package ex_16_Array;

public class Lab_150_Advance_For_Loop_useinArray {
    public static void main(String[] args) {

        int[] Marks = {92, 76, 78, 90, 61, 56};
        System.out.println(Marks.length);

        System.out.println("-----");


        for (int element : Marks) {
            System.out.println(element);
        }
    }
}
