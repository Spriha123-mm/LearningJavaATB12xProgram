package ex_18_OPPS_Constructors;

public class Lab_175_Parameterised_constructor {

    String model;
    int year;

    Lab_175_Parameterised_constructor(){
        model= "XXX";
        year  = 1900;
        System.out.println("DC");
    }

    Lab_175_Parameterised_constructor(String model_name,int year_created){

        this.model = model_name;
        this.year = year_created;

    }

    Lab_175_Parameterised_constructor(String model_name){
        this.model = model_name;
    }


}
