package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        String string = "";
//        System.out.println(string);

        for (int i = 0; i < 13; i++) {
            string = list.remove(list.size() - 1);
            list.add(0, string);
        }
        for (String str: list) {
            System.out.println(str);
        }
    }
}

