package ex_20_Super_Abstraction;

public class Lab_192_Super_Keyword_example {


    class baseclass {
        private String browser;

        public String getBrowser() {
            return browser;
        }

        public void setBrowser(String browser, boolean istrue) {
            if (istrue) {
                this.browser = browser;
            } else {
                System.out.println("none");
            }

        }



        public baseclass(String browser) {
            this.browser = browser;
        }
    }

    void open() {
        System.out.println("open");
    }

    void open(String browser) {
        System.out.println("open chrome");
    }

    class TestCase1 extends Lab_192_Super_Keyword_example {
        public void tc(){}
        public TestCase1(String browser){
            super.open();


        }







        }
    }






