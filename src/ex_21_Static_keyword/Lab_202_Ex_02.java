package ex_21_Static_keyword;

public class Lab_202_Ex_02 {
    public static void main(String[] args) {

        house h1=new house();
        System.out.println(h1.phone);
        int child=house.gold;
        house.washroom();

    }
}

class house{

    int phone;
    int room;
    static int gold;

    void housekey(){
        System.out.println("I am not accessing by all");
    }
    static void washroom (){
        System.out.println("Everybody can acess me ");
    }
}
