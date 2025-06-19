package ex_20_Super_Abstraction;

public class Lab_195_Abstract_class {
    public static void main(String[] args) {


        son s1 = new son();
        s1.loan();
    }

}

class son extends father{
    @Override
    void loan() {

    }
}

abstract class father{

    abstract void loan();


}
