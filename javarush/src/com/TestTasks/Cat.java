package com.TestTasks;

public class Cat {
        public int age;
        public int weight;
        public int strength;
        public Cat() {}
        public boolean fight(com.TestTasks.Cat anotherCat) {
            //напишите тут ваш код
            int pointsThis = 0;
            int pointsAnother = 0;
            if(this.age > anotherCat.age){
                pointsThis++;
            } else { pointsAnother++;}
            if(this.weight > anotherCat.weight){
                pointsThis++;
            } else { pointsAnother++;}
            if(this.strength > anotherCat.strength){
                pointsThis++;
            } else { pointsAnother++;}

            if(pointsThis > pointsAnother){return true;}
            else {return false;}
        }

        public static void main(String[] args) {
            com.TestTasks.Cat spok = new com.TestTasks.Cat();
            spok.age = 1;
            spok.strength = 1;
            spok.weight = 1;
            com.TestTasks.Cat vasia = new com.TestTasks.Cat();
            vasia.age = 2;
            vasia.strength = 2;
            vasia.weight = 2;
            System.out.println(spok.fight(vasia));

        }

}
