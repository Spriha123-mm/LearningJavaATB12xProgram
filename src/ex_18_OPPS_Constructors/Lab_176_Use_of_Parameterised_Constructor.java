package ex_18_OPPS_Constructors;

public class Lab_176_Use_of_Parameterised_Constructor {
    public static void main(String[] args) {

        Lab_175_Parameterised_constructor tesla = new Lab_175_Parameterised_constructor();
        System.out.println(tesla.model);
        System.out.println(tesla.year);

        Lab_175_Parameterised_constructor nano = new Lab_175_Parameterised_constructor("nano",2011);
        System.out.println(nano.model);
        System.out.println(nano.year);

        Lab_175_Parameterised_constructor mghector = new Lab_175_Parameterised_constructor("mghector",2025);
        System.out.println(nano.model);
        System.out.println(nano.year);

    }
}
