package ex_20_Super_Abstraction;

public class Lab_200_Practice_02 {
    public static void main(String[] args) {
        Pramod d = new Dutta(); // Dynamic Dispatch will Interface
        Dutta d1 = new Dutta(); // Dynamic Dispatch will Interface
        d.display();
        System.out.println(d.a);
    }
}

class Dutta implements Pramod{


    @Override
    public void display() {
        System.out.println(a);
    }
}
interface Pramod{
    int a = 10;
    void display();
}


