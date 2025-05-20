package Tasks;

public class Age_classification {
    public static void main(String[] args) {
        int age=12;
        age+=10;
        String result_age_category= (age<18)?"minor":((age<65)?"Adult":"Senior");
        System.out.println(age);
        System.out.println(result_age_category);
    }
}
