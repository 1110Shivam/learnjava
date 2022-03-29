package LearnJava;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int [][] flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 111;
        flats[0][2] = 142;
        flats[1][0] = 121;
        flats[1][1] = 113;
        flats[1][2] = 176;

        /*
            101 111 142
            121 113 176 
        */

        // 2-D Array Traversal Using for loop
        for(int i = 0; i<flats.length;i++){
            for(int j = 0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
