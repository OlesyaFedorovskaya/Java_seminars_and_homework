package Seminar3;

import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;


/*Реализовать алгоритм сортировки списков компаратором.
Пусть дан произвольный список целых чисел, удалить из него чётные числа
Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
Повторить пятый пункт но с LinkedList.
Сравнить время работы пятого и шестого пунктов.
Формат сдачи: файл с расширением java или ссылка на гит с подписанными ФИ и номером группы.
 */

public class Homework3 {
    public static void main(String[] args) {
        
        // Реализовать алгоритм сортировки списков компаратором.
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < 7; j++) {
            list.add(new Random().nextInt(7));
        } 
        System.out.println(list.toString());
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                    if((o2 - o1) < 0) return 1;
                    else if ((o2 - o1) > 0) return -1;
                    return 0;
            }
        });

        // Пусть дан произвольный список целых чисел, удалить из него чётные числа

        ArrayList <Integer> my_list = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            my_list.add(new Random().nextInt(10));
        }
        System.out.println(my_list.toString());
        for (int j = 0; j < my_list.size(); j++) {
            if ((my_list.get(j) % 2) == 0) my_list.remove(my_list.get(j));
        }
        System.out.print(my_list);
     
        // Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int j = 0; j < 12; j++) {
            list2.add(new Random().nextInt(12));
        }
        System.out.println(list2);
        int min = Collections.min(list2);
        int max = Collections.max(list2);
        double mean = sumElements(list2) / list2.size();
        System.out.println("min = " + min + " max = " + max + " mean = " + mean);
    
        // Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.

        ArrayList<Integer> list3= new ArrayList<>();
        for (int j = 0; j < 7; j++) {
            list3.add(new Random().nextInt(7));
        }
        System.out.println(list);
        System.out.println(list3);
        list.removeAll(list3);
        System.out.println(list);

        // Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.

        long begin = System.currentTimeMillis();
        ArrayList<Integer> list4 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list4.add(new Random().nextInt(10));
        }
        for (int i = 0; i < 10000; i++) {
            list4.add(0, 0);
        }
        System.out.println(list4);
        long end = System.currentTimeMillis();
        System.out.println("ArrayList: " + (end - begin));

        // Повторить пятый пункт но с LinkedList.
        // Сравнить время работы пятого и шестого пунктов.
        
        begin = System.currentTimeMillis();
        LinkedList<Integer> list5 = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list4.add(new Random().nextInt(10));
        }
        for (int i = 0; i < 10000; i++) {
            list5.addFirst(0);
        }
        System.out.println(list4);
        end = System.currentTimeMillis();
        System.out.println("LinkedList: " + (end - begin) );

    }

    public static double sumElements(ArrayList<Integer> list) {
        double sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    
    }
}
    

