package ex_22_enum_keyword;

public class Lab_208_Real_example {
    public static void main(String[] args) {
        System.out.println(Locators.page_button.getLocator());
        System.out.println(Lab_209.katalon.getUrl());
    }
}

enum Locators{
    page_button("#btn"),
    page_input("#input1");

    private String locator;

    Locators(String locator){
        this.locator = locator;
    }

    String getLocator(){
        return this.locator;
    }
}

