package ex_06_Ternary_Operator;

public class Lab_57_Ternary_Operator02 {
    public static void main(String[] args) {
        int number = 21;
        String result = (number > 18) ? (number > 25 ? "In Goa, You can drink" : "You can't Drink") : "You can't go GOA";
        System.out.println(result);

    }
}
