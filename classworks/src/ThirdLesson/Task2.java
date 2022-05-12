package ThirdLesson;

import java.util.Arrays;
import java.util.Scanner;

//2. Пользователь вводит размер массива, создать массив, заполнить случайными значениями 0..10. Пользователь вводит
//      значение искомого элемента, найти индекс искомого элемента или -1
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner in  = new Scanner(System.in);
        int vectorLength = in.nextInt();
        int[] vector = new int[vectorLength];
        for (int i = 0; i < vector.length; i++){
            vector[i] = (int)(Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(vector));
        System.out.println("Введите значение искомого элемента");
        int requestedElement = in.nextInt();
        for (int i = 0; i < vector.length; i++){
            if (vector[i] == requestedElement){
                System.out.println("Ваше число находится в ячейке номер " + i);
                System.exit(0);
            }
        }
        System.out.println("Ваше число находится в ячейке номер -1");
    }
}
