package ex_20_Super_Abstraction;

public class Lab_197_Interface_class {
    public static void main(String[] args) {

        car c1 = new car();

        c1.stopengine();
        c1.startengine();
        c1.color();
        c1.size();


    }
}


    class car implements engine, tyre {
        @Override
        public void startengine() {

        }

        @Override
        public void stopengine() {

        }

        @Override
        public void color() {

        }

        @Override
        public void size() {

        }

        @Override
        public void type() {
            tyre.super.type();
        }
    }

    interface engine {

        void startengine();

        void stopengine();
    }

    interface tyre {

        void color();

        void size();

        default void type() {
            System.out.println("Its a brand new");
        }
    }
