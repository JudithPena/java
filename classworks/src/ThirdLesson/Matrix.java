package ThirdLesson;

import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        System.out.println(Arrays.deepToString(matrix));
        matrix[0][0] = 1;
        matrix[0][1]= 2;
        matrix[1][0]= 3;
        matrix[1][1]= 4;
        System.out.println(Arrays.deepToString(matrix));
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.println(matrix[i][j]);
            }
        }
    }
}
