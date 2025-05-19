package ex_04_Operators;

import java.sql.SQLOutput;

public class Lab_40_AND_and_OR_gate {

    public static void main(String[] args) {

        System.out.println("OR & AND GATE REPRESENTATION");
        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||true);
        System.out.println(false||false);
        System.out.println();
        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&true);
        System.out.println(false&&false);

        /** OR GATE
         * T||T = T
         * T||F = T
         * F||T = T
         * F||F = F
         *
         * AND GATE
         * T&&T = T
         * T&&F = F
         * F&&T = F
         * F&&F = F
         */
    }
}
