package ex_15_Stringbuffer_Stringbuilder;

public class Lab_141_Reverse_use {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Poonam");
        StringBuffer sbu= new StringBuffer("Poonam");

        System.out.println(sb);
        System.out.println(sbu);
        System.out.println(sbu.reverse());
        System.out.println(sb.reverse());
    }
    }

