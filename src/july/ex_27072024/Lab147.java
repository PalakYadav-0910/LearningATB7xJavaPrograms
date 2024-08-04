package july.ex_27072024;

import java.util.Arrays;

public class Lab147 {

    public static void main(String[] args) {

        // Find the Max in the Arrays
        // Find the Max Salary, Min  in the Salary Array

        int [] salaries = {7, 4, 8, 10, 25, 6, 35, 40, 12};

        int min_salary = salaries[0];
        int max_salary = salaries[0];

        for (int i = 0; i < salaries.length; i++) {
            if(min_salary > salaries[i]){
                min_salary = salaries[i];
            }
            if(max_salary < salaries[i]){
                max_salary = salaries[i];
            }
        }

        System.out.println(min_salary);
        System.out.println(max_salary);

        //Using Arrays.sort() method
        Arrays.sort(salaries);
        System.out.println("Max Salary is : " + salaries[salaries.length-1]);
        System.out.println("Min Salary is : " + salaries[0]);
    }

}
