package com.javarush.task.task07.task0708;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(scan.nextLine());
        }
        int max = 0;
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            if (list.get(i).length() >= max) {
                max = list.get(i).length();
            }
        }
        for (int i =0; i < list.size(); i++){
            if(list.get(i).length() == max){
                result.add(list.get(i));
            }
        }
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }
}
