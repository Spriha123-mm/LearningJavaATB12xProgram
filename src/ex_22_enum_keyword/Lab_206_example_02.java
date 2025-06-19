package ex_22_enum_keyword;

public class Lab_206_example_02 {
    public static void main(String[] args) {
        System.out.println(browser.safari);
        if(browser.safari.equals("safari")){
            System.out.println("correct");
        }

    }
}
enum browser{Google,chrome,edge,safari}
