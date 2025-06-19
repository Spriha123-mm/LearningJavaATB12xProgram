package ex_22_enum_keyword;

public enum Lab_209 {

    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

    Lab_209(String url){
        this.url = url;
    }

    String getUrl(){
        return this.url;
    }
}

