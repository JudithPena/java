package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
Вывести на экран полученную сумму.

Подсказка: реализовать считывание с клавиатуры, пока не будет введена определенная строка, например "exit", можно с помощью следующей конструкции:

BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
while (true)
{
 String s = buffer.readLine();
 if (s.equals("exit"))
  break;
}
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        int n;
        int sum = 0;
        while (true)
        {

            String s = buffer.readLine();
            if (s.equals("сумма")){
                System.out.println(sum);
                break;
            } else {
                n = Integer.parseInt(s);
                sum = sum + n;

        }

        }
    }
}
