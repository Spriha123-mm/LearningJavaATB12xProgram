package ex_10_For_Loop;

public class Lab_106_even_using_continue_Forloop {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i % 2!=0) {
                continue;
            }
            System.out.println("even -> " + i);
        }


    }
}
