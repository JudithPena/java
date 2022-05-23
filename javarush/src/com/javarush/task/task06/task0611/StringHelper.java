package com.javarush.task.task06.task0611;

public class StringHelper {
    public static String multiply(String text) {
        String result = "";
        //напишите тут ваш код
        for(int i = 0; i <= 5; i++){
            result = result + text ;
        }
        return result;
    }

    public static String multiply(String text, int count) {
        String result = text;
        //напишите тут ваш код
        for(int i = 0; i <= count; i++){
            System.out.print(text);
        }
        return result;
    }

    public static void main(String[] args) {
       System.out.println(StringHelper.multiply("hi"));
    }
}
