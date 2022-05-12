package ThirdLesson;
// Создать массив целых, задать размер массива с клавиатуры, Поменять местами значения
// первого и последнего элемента и вывести на экран
import java.util.Arrays;
import java.util.Scanner;

public class thirdLessonArrays {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 10 + 1);
        }
        System.out.println(Arrays.toString(arr));
        int first = arr[0];
        int last = arr[arr.length - 1];
        arr[0] = last;
        arr[arr.length - 1] = first;

        System.out.println(Arrays.toString(arr));
    }
}
