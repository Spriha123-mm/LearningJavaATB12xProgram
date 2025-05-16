package ex_03_Literals;

public class Lab_28_char_literal {

    public static void main(String[] args) {
        char c1= 'a'; // A to Z, a-z
        String s= "hello";
        char df='@';
        char c2= '_';
        char c3= '(';
        char c4= ' ';

        //Escape character
        char new_line='\n';
        char tab_line='\t';
        char back_space='\b';
        char carriage_return='\r';

        System.out.println("hi there\n");
        System.out.println("I am good person "+new_line+" and I know it");
        System.out.println("spriha "+back_space+"Srivastava");
        System.out.println("Good "+tab_line+" Thing");
        System.out.println("spriha "+carriage_return+" Srivastava");

        char c10= 'o';
        char dollar='$';
        char rupees= '₹';
        char smiley_face= '\u1f60';
        System.out.println(c10);
        System.out.println(dollar);
        System.out.println(rupees);
        System.out.println(smiley_face);


    }
}
