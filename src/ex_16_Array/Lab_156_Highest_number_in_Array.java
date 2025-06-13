package ex_16_Array;

public class Lab_156_Highest_number_in_Array {
    public static void main(String[] args) {

        int [] array={12,89,18,29,90};

        int high=0;

        for( int arr:array){
            if(arr>high){
                high= arr;

            }

        }
        System.out.println(high);
    }
}
