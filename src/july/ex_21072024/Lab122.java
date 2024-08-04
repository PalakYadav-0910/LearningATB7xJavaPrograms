package july.ex_21072024;

public class Lab122 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) { // i = 0 to 9, times  = 10
            System.out.println(i);
            if( i == 5){
                continue;   //Continue will go back to the for loop, it will not print after
            }
            System.out.println("After!!");
        }

    }
}
