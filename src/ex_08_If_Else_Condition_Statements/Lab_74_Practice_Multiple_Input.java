package ex_08_If_Else_Condition_Statements;

public class Lab_74_Practice_Multiple_Input {
    public static void main(String[] args) {


        System.out.println("Enter your name, age & salary");
        String name= args[0];
        int age= Integer.parseInt(args [1]);
        double salary = Double.parseDouble(args[2]);

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);

    }
}
