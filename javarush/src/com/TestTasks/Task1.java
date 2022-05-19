package com.TestTasks;

//1.      В методе public static void hackSalary(int salary) увеличь зарплату на 100 и выведи на экран надпись:
//        "Твоя зарплата составляет: <salary+100> долларов в месяц."
//        Где <salary+100> - это зарплата увеличенная на 100.
//        Подсказки:
//        Используй конструкцию "текст " + (salary+число) + " текст".
//        Удели внимание пробелам в тексте. Пример вывода на экран для salary = 700:
//        Твоя зарплата составляет: 800 долларов в месяц.
public class Task1 {
    public static void main(String[] args) {
        hackSalary(700);        //зарплата
    }
    public static void hackSalary(int salary) {
        // напишите тут ваш код
        System.out.println("Твоя зарплата составляет: " + (salary + 100) + " долларов в месяц");
         }
}
