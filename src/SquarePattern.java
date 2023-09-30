import java.util.Scanner;

public class SquarePattern {

    /*
Pattern:-
            Rows    No. of Stars(*)
    **** -> 0               4
    **** -> 1               4
    **** -> 2               4
    **** -> 3               4

     */
    public static void squarePattern(int n){

        // Outer loop, that counts the no. of lines or rows
        for(int row = 0; row< n; row = row+1){

            //Inner loop, that focus on columns, and connect them some how to the rows
            for (int col = 0; col < n; col = col+1) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();

        squarePattern(n);
    }
}
