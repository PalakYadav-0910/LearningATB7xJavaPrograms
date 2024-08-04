package july.ex_27072024;

public class Lab142 {

    public static void main(String[] args) {

        final int[] ages = new int[4];

        /* Here we are able to assign value to ages despite of final keyword because final keyword in array means
        its length will be fixed. */

        ages[3] = 78;
        System.out.println(ages[3]);

        final int a = 10;
        //a = 90; Here we cant change value of variable a because of final keyword.

    }
}
