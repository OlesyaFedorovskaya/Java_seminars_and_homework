package Seminar1;
/* Первый семинар.
1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

*Пункты реализовать в методе main
*Пункты реализовать в разных методах
int i = new Random().nextInt(k); //это кидалка случайных чисел!)
 */

 import java.util.Random;

public class Homework {
    public static void main(String[] args) {

        // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i

        Random random = new Random();
        int i = new Random().nextInt(2000);
        System.out.println("Случайное целое число в диапазоне от 0 до 2000 = " + i);

        // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

        int j;
        System.out.println("Число i в двоичном коде = " + Integer.toBinaryString(i));
        j = Integer.toBinaryString(i).length();
        System.out.println("Номер старшего значащего бита выпавшего числа = " + j);

        //
        
    }
}
