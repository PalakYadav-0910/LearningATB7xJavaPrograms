package ex_27072024;

public class Lab138 {

    public static void main(String[] args) {

        int[] marks_10_board = {90, 91, 95, 99, 100, 78};
        // elements are fixed.
        // len -> 6
        // who index - 3 -> at index 3 - 99 is value
        System.out.println(marks_10_board.length);
        System.out.println(marks_10_board[3]); // 99
        System.out.println(marks_10_board[0]); // 90
        System.out.println(marks_10_board[-1]); // ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 6
//        System.out.println(marks_10_board[10]);

    }
}
