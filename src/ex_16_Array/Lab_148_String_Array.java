package ex_16_Array;

public class Lab_148_String_Array {
    public static void main(String[] args) {
         String[] subjexts={"Maths","English","Science","Computers"};
        System.out.println(subjexts.length);
        System.out.println(subjexts[0]);
        System.out.println(subjexts[1]);
        System.out.println(subjexts[2]);

        String[] drinks= new String[3];
        drinks[0]="rum";
        drinks[1]="rum";
        drinks[2]="rum";
        System.out.println(drinks[0]);
        System.out.println(drinks[1]);
        System.out.println(drinks[2]);

        boolean[] is_male_data = new boolean[2];
        is_male_data[0] =  true;
        is_male_data[1] =  false;
        System.out.println(is_male_data[0]);
        System.out.println(is_male_data[1]);



    }
}
