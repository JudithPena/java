package SecondLesson;

import java.util.Scanner;
    // Пользователь вводит 3 числа, вывести на экран большее из этих чисел
    public class secondLessonIfStatement {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Введите первое число");
            int num1 = scan.nextInt();
            System.out.println("Введите второе число");
            int num2 = scan.nextInt();
            System.out.println("Введите третье число");
            int num3 = scan.nextInt();

            if(num1 > num2 && num1 > num3) {
                System.out.println("Число " + num1 + " самое большое");
            } else if (num2 > num3) {
                System.out.println("Число " + num2 + " самое большое");
            } else System.out.println("Число " + num3 + " самое большое");
        }
    }

