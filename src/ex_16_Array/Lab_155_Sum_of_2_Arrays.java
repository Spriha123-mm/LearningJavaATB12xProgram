package ex_16_Array;

public class Lab_155_Sum_of_2_Arrays {

    public static void main(String[] args) {
        int [] array={12,12,12};

        int sum=0;

        for(int i= 0 ;i< array.length;i++){

            sum=sum+array[i];
        }
        System.out.print(sum);
    }
}
