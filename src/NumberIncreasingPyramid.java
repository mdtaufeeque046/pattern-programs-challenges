import java.sql.SQLOutput;
import java.util.Scanner;

public class NumberIncreasingPyramid {

    /*

    1
    12
    123
    1234
        -> Printing the no. of columns
     */

    public static void numberIncreasingPyramid(int n) {

        //Outer loop, that counts the no. of lines/rows
        for (int row = 1; row <= n; row = row + 1) {

            //Inner loop, that focus on the columns, and connect somehow to the rows
            for (int col = 1; col <= row; col = col + 1) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        //Taking the input from the user
        System.out.println("Enter no. of rows: ");
        int n = sc.nextInt();

        //Calling the numberIncreasingPyramid
        numberIncreasingPyramid(n);

    }
}
