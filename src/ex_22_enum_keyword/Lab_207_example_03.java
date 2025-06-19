package ex_22_enum_keyword;

public class Lab_207_example_03 {
    public static void main(String[] args) {
        System.out.println(color_codes.RED.getHex_code());
        System.out.println(color_codes.GREEN.getHex_code());

    }
}
enum color_codes{
    RED("#FF0000"),
    GREEN("#61FF33"),
    BLUE("#3377FF"),
    YELLOW("#4477FF");

    private String hex_code;

    color_codes(String hex_code) {
        this.hex_code = hex_code;
    }

    String getHex_code() {
        return this.hex_code;
    }
}
