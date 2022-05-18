package com.ThirdLevel.minimumOfThree;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Ввести с клавиатуры три числа, и вывести их в порядке убывания.
// Выведенные числа должны быть разделены пробелом.
public class minimumOfThree {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            int n1 = Integer.parseInt(reader.readLine());
            int n2 = Integer.parseInt(reader.readLine());
            int n3 = Integer.parseInt(reader.readLine());
            if (n1 > n2 && n1 > n3 && n2 > n3){
                System.out.println(n1+" "+n2+" "+n3);
            } else if(n2 > n1 && n2 > n3 && n1 > n3){
                System.out.println(n2+" "+n1+" "+n3);
            } else if(n3 > n1 && n3 > n2 && n2 > n1)
                System.out.println(n3+" "+n2+" "+n1);
            else if(n2 > n1 && n2 > n3 && n3 > n1){
                System.out.println(n2+" "+n3+" "+n1);
            } else if(n1 > n2 && n1 > n3 && n3 > n2){
                System.out.println(n1+" "+n3+" "+n2);
            } else if (n3 > n1 && n3 > n2 && n1 > n2){
                System.out.println(n3+" "+n1+" "+n2);
            }

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
