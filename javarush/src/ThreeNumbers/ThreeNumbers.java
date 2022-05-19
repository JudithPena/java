package ThreeNumbers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeNumbers {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int n = Integer.parseInt(reader.readLine());
            if (n % 2 == 0 && (((n / 10) < 1) && ((n / 10) > 0))) {
                System.out.println("четное однозначное число");
            } else if (n % 2 == 1 && (n / 10) < 1) {
                System.out.println("нечетное однозначное число");
            } else if (n % 2 == 0 && ((n / 10) < 10 && (n / 10) >= 1)) {
                System.out.println("четное двузначное число");
            } else if (n % 2 == 1 && ((n / 10) < 10 && (n / 10) >= 1)) {
                System.out.println("нечетное двузначное число");
            } else if (n % 2 == 0 && (n / 10) >= 10) {
                System.out.println("четное трехзначное число");
            } else if (n % 2 == 1 && (n / 10) >= 10) {
                System.out.println("нечетное трехзначное число");
            }
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
