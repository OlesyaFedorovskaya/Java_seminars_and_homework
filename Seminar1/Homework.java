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
 import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {

        // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i

        Random random = new Random();
        int i = new Random().nextInt(0, 2000);
        System.out.println("Случайное целое число в диапазоне от 0 до 2000 = " + i);

        // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

        int n;
        System.out.println("Число i в двоичном коде = " + Integer.toBinaryString(i));
        n = Integer.toBinaryString(i).length();
        System.out.println("Номер старшего значащего бита выпавшего числа = " + n);

        // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1

        int length = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                length++;
            }
        }
        System.out.println("Длина массива от " + i + " до " + Short.MAX_VALUE + " = " + length);

        int[] m1 = new int[length];
        int k = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1[k] = j;
                k++;
            }
        }
        System.out.println(Arrays.toString(m1));    

        // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

        int length2 = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n != 0) {
                length2++;
            }
        }
        System.out.println("Длина массива от " + Short.MIN_VALUE + " до " + i + " = " + length2);

        int[] m2 = new int[length2];
        int l = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j % n != 0) {
                m2[l] = j;
                l++;
            }
        }
        System.out.println(Arrays.toString(m2));      
    }
}
