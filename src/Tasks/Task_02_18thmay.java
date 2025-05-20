package Tasks;

public class Task_02_18thmay {
    public static void main(String[] args) {
        int a = 11, b = 22, c;

        c = a + b + a++ + b++ + ++a + ++b;

        System.out.println(a);

        System.out.println(b);

        System.out.println(c);
    }
}
