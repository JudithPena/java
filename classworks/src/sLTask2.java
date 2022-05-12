import java.util.Scanner;

public class sLTask2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        int month = scan.nextInt();
        switch (month) {
            case 1 -> System.out.println("Это январь. Зима.");
            case 2 -> System.out.println("Это февраль. Зима.");
            case 3 -> System.out.println("Это март. Весна.");
            case 4 -> System.out.println("Это апрель. Весна.");
            case 5 -> System.out.println("Это май. Весна.");
            case 6 -> System.out.println("Это июнь. Лето.");
            case 7 -> System.out.println("Это июль. Лето.");
            case 8 -> System.out.println("Это Август. Лето.");
            case 9 -> System.out.println("Это Сентябрь. Осень.");
            case 10 -> System.out.println("Это октябрь. Осень.");
            case 11 -> System.out.println("Это ноябрь. Осень.");
            case 12 -> System.out.println("Это декабрь. Зима.");
        }
    }

}
