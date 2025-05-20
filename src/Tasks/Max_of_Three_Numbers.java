package Tasks;

public class Max_of_Three_Numbers {
    public static void main(String[] args) {

        int n1= 23;
        int n2= 67;
        int n3= 87;
        String result= (n1>n2)?(n1>n3)?"n1":"n3": ((n2>n3)?"n2":"n3");
        System.out.println(result);

    }
}
