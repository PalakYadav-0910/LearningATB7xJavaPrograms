package Coding_Assignments;

public class SecondHighest_SalaryArray {

    public static void main(String[] args) {

        //Find Second Highest Salary in array

        int[] salaries = {7, 10, 4, 13, 25, 18, 9, 8, 17};

        int highest = salaries[0];
        int second_highest = salaries[0];

        for (int i = 0; i < salaries.length; i++) {

            if(salaries[i]>highest){
                highest = salaries[i];
            }
            else if(salaries[i] > second_highest){
                second_highest = salaries[i];
            }

        }
        System.out.println(highest);
        System.out.println(second_highest);

    }
}
