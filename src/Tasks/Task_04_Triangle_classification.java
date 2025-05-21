package Tasks;

public class Task_04_Triangle_classification {
    public static void main(String[] args) {

        String a= args[0];
        String b= args[1];
        String c=args[2];

        int side1= Integer.parseInt(a);
        int side2= Integer.parseInt(b);
        int side3= Integer.parseInt(c);

        if(side1==side2&& side2==side3){

            System.out.println("This is Acute Triangle");

        } else if (side1==side2|| side2==side3|| side3==side1) {

            System.out.println("This is Isoceles Triangle");

        }
        else {
            System.out.println("This is Scalene Triangle");
        }
    }
}
