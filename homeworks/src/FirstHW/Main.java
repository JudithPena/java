package FirstHW;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Let the game begin!");
        System.out.println("Print your name!");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        Random random = new Random();
        int number = random.nextInt(101);
//        System.out.println(number);

        System.out.println("Print a number!");
        int userNumber = scan.nextInt();


        while (userNumber != number){
        if (userNumber < number){
            System.out.println("Your number is too small. Please, try again.");
            userNumber = scan.nextInt();
        } else if (userNumber > number) {
            System.out.println("Your number is too big. Please, try again.");
            userNumber = scan.nextInt();
        }}
        if (userNumber == number){
                System.out.println("Congratulations, " + name + "!");
            }
    }
}
