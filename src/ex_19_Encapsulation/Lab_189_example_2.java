package ex_19_Encapsulation;

public class Lab_189_example_2 {
    public static void main(String[] args) {

        Lab_189_example_2 s= new Lab_189_example_2("ram",123);
        s.getPassword();
        s.getPassword();


    }

    private String username;
    private int password;

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Lab_189_example_2(String username, int password) {
        this.username = username;
        this.password= password;

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
