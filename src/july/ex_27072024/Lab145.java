package july.ex_27072024;

public class Lab145 {

    public static void main(String[] args) {

        /*You can pass values in main method String [] args array
        * Click on String write click aand then click on Modify Run Configuration. Pass values in Program Arguments.
        * */

        if(args.length > 0){

            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }

        }
        else{
            System.out.println("No Arguments given");
        }

    }
}
