package ex_06_Ternary_Operator;

public class Lab_59_Mathmax_function {
    public static void main(String[] args) {
        int a1= 12;
        int a2= 23;
        int a3= 76;
        System.out.println(Math.max(a1,a2));
        String result=(a1>a2)?(a1>13)?"a1":"a3":((a2>a3)?"a2":"a3");
        System.out.println(result);

    }
}
