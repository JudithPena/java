package com.TestTasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1.      В методе public static void hackSalary(int salary) увеличь зарплату на 100 и выведи на экран надпись:
//        "Твоя зарплата составляет: <salary+100> долларов в месяц."
//        Где <salary+100> - это зарплата увеличенная на 100.
//        Подсказки:
//        Используй конструкцию "текст " + (salary+число) + " текст".
//        Удели внимание пробелам в тексте. Пример вывода на экран для salary = 700:
//        Твоя зарплата составляет: 800 долларов в месяц.
public class Task1 {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n;
        int result = 0;
        while(true){
             n = Integer.parseInt(reader.readLine());
            result = result + n;
            if (n == -1) {System.out.println(n); System.out.println(result); break;}
        }
    }}




