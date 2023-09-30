public class NumericPyramidPattern {

    /*
    1
    22
    333
    4444
        ->Printing No of rows
    */

    public static void numericPyramidPattern(int n){

            //Outer loop, that prints the no. of lines/rows
            for (int row = 1; row <=4; row++){

                //Inner loop, that focus on columns, and connect somehow to the rows
                for (int col = 1; col <= row; col++) {
                    System.out.print(row+ " ");

                }
                System.out.println();
        }

    }

    public static void main(String[] args) {
        int n = 4;

        //Calling the numericPyramidPattern method
        numericPyramidPattern(n);

    }
}
