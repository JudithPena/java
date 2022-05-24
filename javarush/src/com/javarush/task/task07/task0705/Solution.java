package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] bigArr = new int[20];
        for(int i =0; i<bigArr.length; i++){
            bigArr[i] = Integer.parseInt(reader.readLine());
        }
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        for(int i = 0; i < bigArr.length; i++){
            if(i < 10){
                arr1[i] = bigArr[i];
            } else {arr2[i-10] = bigArr[i];}
        }

        System.out.println(Arrays.toString(bigArr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
