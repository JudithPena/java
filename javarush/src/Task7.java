package JavaRush;
//Написать функцию, которая вычисляет минимум из четырёх чисел.
//Функция min(a,b,c,d) должна использовать (вызывать) функцию min(a,b)
// Подсказка:
//Нужно написать тело двух существующих функций min.
public class Task7 {
    public static int min(int a, int b, int c, int d) {
        //напишите тут ваш код
        int x = min(a, b);
        if (x < c && x < d){
            return x;
        } else return Math.min(c, d);
    }

    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
