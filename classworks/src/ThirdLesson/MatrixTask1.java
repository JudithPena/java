package ThirdLesson;

import java.util.Arrays;
import java.util.Scanner;

// 1. Пользователь вводит размер матрицы, заполнить каждый элемент номером строки
// 2. Создать матрицу 5х5, заполнить случайными значениями 0..10, вывести на экран
// 'красиво'
/*
        [1,2,3],
        [4,5,6],
        [7,8,9]
 */
public class MatrixTask1 {
    public static void main(String[] args) {
        System.out.println("Введите количество строчек:");
        Scanner in = new Scanner(System.in);
        int lines = in.nextInt();
        System.out.println("Введите количество столбцов:");
        int column = in.nextInt();
        int[][] matrix = new int[lines][column];
        System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < matrix.length; i++){
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int)(Math.random() * 10 +1);
                System.out.print(matrix[i][j] + " ");
            }
        }
//        System.out.println(Arrays.deepToString(matrix));

    }
}
