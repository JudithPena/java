package SecondLesson;

import java.util.Scanner;

public class sLTask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ВВедите размер стороны квадрата");
        int sizeOfSide = scan.nextInt();

        for (int i = 0; i < sizeOfSide; i++){
            for(int j = 0; j < sizeOfSide; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
