package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        int min = list.get(0).length();
        ArrayList<String> res = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).length() < min){
                min = list.get(i).length();
            }
        }
        for (int i =0; i< list.size(); i++){
            if(list.get(i).length() == min){
                res.add(list.get(i));
            }
        }

        for (String str: res) {
            System.out.println(str);
        }
    }
}
