package Tasks;

public class Even_odd_in_Array {
    public static void main(String[] args) {

        int[]s={12,14,9,7,11};

        for(int i=0;i< s.length;i++){

            if(i/2==0){
                System.out.println("Its even"+s[i]);

            }else{
                System.out.println("Its odd");

            }
        }
    }
}
