package july.ex_20072024;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {

        // Take a user input as char and Tell the user if it is a vowel
        // aeiou

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char, I will tell you, If it is a vowel or not!");
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);

        switch(user_input){
            case 'a':
                System.out.println("Vowel");

                //If we will not define break, then all the cases after the case that will match,will run.If c matches,
                //c will run and all cases after c will run. Its important to define break.

                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Not a Vowel, It is Consonant");
                break;
        }

        //Alternate way of using switch
        //We can define multiple cases together if they willl give same result.
        //Also we can use arrow (->), if we use this no need to write break statement. It takes care of break.

        switch(user_input){
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
            default -> System.out.println("Not a Vowel, It is Consonant");
        }

    }
}
