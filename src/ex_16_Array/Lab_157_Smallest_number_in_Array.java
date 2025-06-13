package ex_16_Array;

public class Lab_157_Smallest_number_in_Array {

    public static void main(String[] args) {
        int [] array={12,89,18,29,90};

        int min = Integer.MAX_VALUE;

        for (int i= 0;i< array.length;i++){
            if(array[i]<min)
            {
                min=array[i];
            }

        }
        System.out.println(min);
    }
}
