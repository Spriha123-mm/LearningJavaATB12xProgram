package ex_23_Wrapper_class;

public class Lab_212_Practice_03 {
    public static void main(String[] args) {

        String n= "10";
        int aa=10;

        Integer a = Integer.parseInt(n);
        String num = "10";
        int ab = 10;



        // String to Primitive
        int a_p = Integer.parseInt(num); // (String -> WP, WP -> primitve unboxing)

        Integer aa3 = Integer.valueOf("10");
        System.out.println(aa3);


        Integer aa10 = 10;
        String s = aa10.toString();
        System.out.println(s);
        System.out.println(s instanceof String);


    }
    }

