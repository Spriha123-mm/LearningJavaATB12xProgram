package Polymorphism;

public class Lab_use {
    public static void main(String[] args) {

        Lab_185_Methodoverloading s= new Lab_185_Methodoverloading();
        int result= s.add(2,3);
        int result1=s.add(2,9,10);
        int result2=s.add(1,1,2,3);
        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);

    }
}
