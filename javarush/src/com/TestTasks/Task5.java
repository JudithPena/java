package com.TestTasks;
// Написать функцию, которая возвращает минимум из двух чисел.
// Подсказка:
//Нужно написать тело существующей функции min.
public class Task5 {
    public static int min(int a, int b) {
        //напишите тут ваш код
        if(a < b){
            return a;
        } else return b;

    }
    public static void main(String[] args) {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}