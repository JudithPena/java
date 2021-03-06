package com.javarush.task.task05.task0526;
/*
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address
 */

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Man man1 = new Man("Anton", 23, "Obolon avenue");
        Man man2 = new Man("Boris", 50, "Downtown");
        Woman woman1 = new Woman("Oxana", 44, "Rustavi street");
        Woman woman2 = new Woman("Ana", 30, "Sagrada Familia");
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);
    }
    public static class Man{
        String name;
        int age;
        String address;
        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString(){
            return (name + " " + age + " " + address);
        }
    }
    public static class Woman{
        String name;
        int age;
        String address;
        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString(){
            return (name + " " + age + " " + address);
        }
    }
    //напишите тут ваш код
}
