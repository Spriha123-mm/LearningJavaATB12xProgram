package Tasks;

public class Prime_number {
    public static void main(String[] args) {

        int num = 7;
        int count = 0;

        for (int i = 1; i >= 10; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        System.out.println((count == 2) ? "Prime" : "Not Prime");
    }
}