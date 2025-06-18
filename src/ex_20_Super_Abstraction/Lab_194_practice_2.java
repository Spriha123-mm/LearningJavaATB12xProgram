package ex_20_Super_Abstraction;

public class Lab_194_practice_2 {
    public static void main(String[] args) {

    }
    class father {

        int gold;

        void home() {
            System.out.println("its 1 bhk");
        }

        class son extends father {

            void newHome() {
                super.home();
                System.out.println(super.gold);


            }

        }

    }
    }
