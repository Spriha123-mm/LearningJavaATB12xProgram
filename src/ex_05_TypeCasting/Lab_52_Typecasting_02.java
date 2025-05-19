package ex_05_TypeCasting;

public class Lab_52_Typecasting_02 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b; // Valid Syntax -> Widening - Implicit Casting - Automatically done.
        int a1 = (int)b; // Widening Explicit Casting (int) - optional
        System.out.println(b);
        System.out.println(a);
        System.out.println(a1);
    }
}
