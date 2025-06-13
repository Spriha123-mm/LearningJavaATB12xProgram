package ex_16_Array;

public class Lab_151_Max_using_loop_In_Array {

    public static void main(String[] args) {

        int[] a= {12,19,90,56,100,769};

        int max= a[0];

        for(int i=0;i<a.length;i++){

            if(a[i]>max){
                max=a[i];


            }


        }
        System.out.println("Max is" +max);
    }
}






