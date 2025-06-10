package ex_09_Switch;

import java.util.Scanner;

public class Lab_79_Real_Switch_use {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the browser name");
        String browser= scanner.next();
        browser= browser.toLowerCase();

        switch(browser){
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                // Further code to start the Firefox
                // Webdriver driver = new Firfox(); // Selenium Code
                break;
            case "edge":
                System.out.println("Execute the Edge Code");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;


        }



    }
}
