package Seminar5;
/*
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов. 
 * Пусть дан список сотрудников:

Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов

Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. 
Отсортировать по убыванию популярности имён.
*Популярность не имён а номеров телефонов
 */

import java.util.*;

public class Homework5 {
    static Random random = new Random();
    public static void main(String[] args) {
        HashMap<String[], HashMap<String, Integer>> contacts = new HashMap<>();

        ArrayList<String[]> name = new ArrayList<>();
        name.add(new String[] {"Иванов","Иван"});
        name.add(new String[] {"Петрова","Светлана"});
        name.add(new String[] {"Белова","Кристина"});
        name.add(new String[] {"Мусина","Анна"});
        name.add(new String[] {"Крутова","Анна"});
        name.add(new String[] {"Юрин","Иван"});
        name.add(new String[] {"Лыков","Петр"});
        name.add(new String[] {"Чернов","Павел"});
        name.add(new String[] {"Чернышов","Петр"});
        name.add(new String[] {"Федорова","Мария"});
        name.add(new String[] {"Светлова","Марина"});
        name.add(new String[] {"Савина","Мария"});
        name.add(new String[] {"Рыкова","Мария"});
        name.add(new String[] {"Лугова","Марина"});
        name.add(new String[] {"Владимирова","Анна"});
        name.add(new String[] {"Мечников","Иван"});
        name.add(new String[] {"Петин","Петр"});
        name.add(new String[] {"Ежов","Иван"});
        
        generatedPhoneBook(name, contacts);
        print(name, contacts);
    }

    static String generatedPhoneNumbers() {
        StringBuilder phone = new StringBuilder();
        phone.append(8).append("-").append(9)
                .append(random.nextInt(0, 10))
                .append(random.nextInt(0, 10))
                .append("-")
                .append(random.nextInt(0, 10))
                .append(random.nextInt(0, 10))
                .append(random.nextInt(0, 10))
                .append("-")
                .append(random.nextInt(0, 10))
                .append(random.nextInt(0, 10))
                .append("-")
                .append(random.nextInt(0, 10))
                .append(random.nextInt(0, 10));
        String phoneNumber = phone.toString();
        return phoneNumber;
    }

    static HashMap<String[], HashMap<String, Integer>> generatedPhoneBook(ArrayList<String[]> name, 
            HashMap<String[], HashMap<String, Integer>> contacts) {
        for (String[] id : name) {
            HashMap<String, Integer> contactsPhone = new HashMap<>();
            for (int i = 1; i < random.nextInt(2, 5); i++) {
                contactsPhone.put(generatedPhoneNumbers(), random.nextInt(0, 100));
                contacts.put(id, contactsPhone);
            }

        }
        return contacts;
    }

    static void print(ArrayList<String[]> name, HashMap<String[], HashMap<String, Integer>> contacts) {
        for (int i = 0; i < name.size(); i++) {
            System.out.print(String.join(" ", name.get(i)) + "\n");
            int finalI = i;
            contacts.get(name.get(i)).forEach((k, v) -> System.out
                    .printf(k + " с этого номера %s звонил(а) " + v + " раз(а)\n", name.get(finalI)[1]));
            System.out.println();
        }
        countPopularName(name, contacts);
    }

    static void countPopularName(ArrayList<String[]> name, HashMap<String[], 
                                    HashMap<String, Integer>> contacts) {
        HashMap<String, Integer> countName = new HashMap<>();
        LinkedList<Integer> countList = new LinkedList<>();
        LinkedList<String> nameList = new LinkedList<>();

        for (int i = 0; i < name.size(); i++) {
            countName.putIfAbsent(name.get(i)[1], 0);
            countName.computeIfPresent(name.get(i)[1], (k, v) -> v += 1);
        }
    
        countName.forEach((k, v) -> countList.add(v));
        countName.forEach((k, v) -> nameList.add(k));
        sortMerge(countList);

        for (int k = countList.size() -1; k >= 0; k--) {
            for (int v = 0; v < nameList.size(); v++) {
                if(countList.get(k) == countName.get(nameList.get(v))) {
                    System.out.println(nameList.get(v) + " встречается " + countList.get(k) + " раз(а)\n");
                    nameList.remove(v);
                }
            }
            countList.remove(k);
        }
    } 
    
    static LinkedList sortMerge(LinkedList<Integer> list) {
        if (list.size() > 1) {
            LinkedList<Integer> leftList = new LinkedList<>(list.subList(0, list.size() / 2));
            LinkedList<Integer> rightList = new LinkedList<>(list.subList(list.size() / 2, list.size()));
            sortMerge(leftList);
            sortMerge(rightList);

            int i = 0;
            int j = 0;
            int k = 0;

            while ((i < leftList.size()) & (j < rightList.size())) {
                if (leftList.get(i) < rightList.get(j)) {
                    list.set(k, leftList.get(i));
                    i++;
                } else {
                    list.set(k, rightList.get(j));
                    j++;
                }
                k++;
            }

            while (i < leftList.size()) {
                list.set(k, leftList.get(i));
                i++;
                k++;
            }

            while (j < rightList.size()) {
                list.set(k, rightList.get(j));
                j++;
                k++;
            }
        }
        return list;
    }
}
