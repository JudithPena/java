public class Cat {
        public int age;
        public int weight;
        public int strength;
        public Cat() {}
        public boolean fight(Cat anotherCat) {
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
            Cat spok = new Cat();
            spok.age = 1;
            spok.strength = 1;
            spok.weight = 1;
            Cat vasia = new Cat();
            vasia.age = 2;
            vasia.strength = 2;
            vasia.weight = 2;
            System.out.println(spok.fight(vasia));
            System.out.println(vasia.fight(spok));
        }

}