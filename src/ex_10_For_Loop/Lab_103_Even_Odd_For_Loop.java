package ex_10_For_Loop;

public class Lab_103_Even_Odd_For_Loop {
    public static void main(String[] args) {

        for (int i = 1; i <= 50; i++) {
            {
                if (i % 2 == 0)
                    System.out.println("even"+i);
                else {
                    System.out.println("odd"+i);
                }
            }
        }
    }
}
