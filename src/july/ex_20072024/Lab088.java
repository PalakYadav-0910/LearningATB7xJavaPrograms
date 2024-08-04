package july.ex_20072024;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        //Max Number in 2 inputs

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number 1");
        int num1 = sc.nextInt();

        System.out.println("Enter Number 2");
        int num2 = sc.nextInt();

        //Using Math.max();
        //System.out.println(Math.max(num1,num2));

        //Using if-else condition
        if(num1>num2){
            System.out.println(num1 + " is greater");
        }
        else if(num2>num1){
            System.out.println(num2 + " is greater");
        }
        else{
            System.out.println("Numbers are equal");
        }
    }
}
