public class RightHalfPyramid {

    /*
                 Rows    No.fo stars(*)
    *       ->    0         1
    **      ->    1         2
    ***     ->    2         3
    ****    ->    3         4

    */
    public static void rightHalfPyramid(int n){
       /*
        //Outer loop, that counts hte no. of lines/rows
        for(int row = 0; row < 4; row++){

            //Inner loop, that focus on columns & connect somehow to the rows
            for(int col = 0; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
       */

        // +++++++++++++++++OR+++++++++++++++++++++++++++++++++++++++++

        //Outer loop, that counts hte no. of lines/rows
        for (int row = 1; row <= 4; row++){

            //Inner loop, that focus on columns & connect somehow to the rows
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int n = 4;

        rightHalfPyramid(n);

    }
}
