package ex_15_Stringbuffer_Stringbuilder;

public class Lab_145_Interview_practice {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);
        sb.delete(5,16);
        System.out.println(sb);
        sb.replace(0,4,"C++");
        System.out.println(sb);
    }
}
