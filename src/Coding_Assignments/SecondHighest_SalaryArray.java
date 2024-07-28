package Coding_Assignments;

import java.util.Arrays;

public class SecondHighest_SalaryArray {

    public static void main(String[] args) {

        //Find Second Highest Salary in array

        int[] salaries = {7, 10, 4, 21, 25, 18, 49, 8, 17};

        int highest = salaries[0];
        int second_highest = salaries[0];

        for (int i = 0; i < salaries.length; i++) {

            if(salaries[i]>highest){

                second_highest = highest;
                highest = salaries[i];

            }

        }
        System.out.println(highest);
        System.out.println(second_highest);

        //Alternate Way Using Array.sort() method

        Arrays.sort(salaries);

        int highest_sal = salaries[salaries.length-1];
        int second_highestSal = salaries[salaries.length-2];

        System.out.println(highest_sal);
        System.out.println(second_highestSal);

    }
}
