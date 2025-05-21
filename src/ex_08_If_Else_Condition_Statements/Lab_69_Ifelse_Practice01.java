package ex_08_If_Else_Condition_Statements;

public class Lab_69_Ifelse_Practice01 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if(age > 18){
            System.out.println("You can vote!");
        }else{
            System.out.println("You can't vote!");
        }

    }
}
