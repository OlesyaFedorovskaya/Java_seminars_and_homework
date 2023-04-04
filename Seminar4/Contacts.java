package Seminar4;

import java.util.*;

public class Contacts {
    static LinkedList<ArrayList<String>> contacts = new LinkedList<>();
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        getData();
        System.out.println(contacts);
    
        

        Comparator<ArrayList<String>> ageComparator = new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> t1, ArrayList<String> t2) {
                if (Integer.parseInt(t1.get(3)) > Integer.parseInt(t2.get(3))) return 1;
                else if (Integer.parseInt(t1.get(3)) > Integer.parseInt(t2.get(3))) return -1;
                return 0;
            }
        };

        contacts.sort(ageComparator);
        System.out.println("Сортировка по году рождения");
        printContacts();

        Comparator<ArrayList<String>> genderComparator = new Comparator<ArrayList<String>>() {
            @Override
            public int compare(ArrayList<String> t1, ArrayList<String> t2) {
                if (t1.get(4).charAt(0) > t2.get(4).charAt(0)) return 1;
                else if (t1.get(4).charAt(0) < t2.get(4).charAt(0)) return -1;
                return 0;
            }
        };

        contacts.sort(genderComparator);
        System.out.println("Сортировка по полу");
        printContacts();
    }

    private static void printContacts() {
        for (ArrayList<String> record: contacts){
            System.out.print(record.get(0) + " ");
            System.out.print(record.get(1).toUpperCase().charAt(0) + ". ");
            System.out.print(record.get(2).toUpperCase().charAt(0) + ". ");
            System.out.print(record.get(3) + " ");
            System.out.println(record.get(4));
        }  
    }

    

    private static void getData() {
        String command;
        System.out.println("Введите '1' для ввода новой записи\n Введите '2' для завершения ввода данных\n");
        command = myScanner.nextLine();

        while (command.equals("1")) {
            contacts.add(GetRecord());
            System.out.println("Введите '1' для ввода новой записи\n Введите '2' для завершения ввода данных\n");
            command = myScanner.nextLine();
        }
    }

    private static ArrayList<String> GetRecord() {
        ArrayList<String> newRecord = new ArrayList<>();

        System.out.println("Введите Фамилию: ");
        String lastName = myScanner.nextLine();
        newRecord.add(lastName);

        System.out.println("Введите Имя: ");
        String firstName = myScanner.nextLine();
        newRecord.add(firstName);

        System.out.println("Введите Отчество: ");
        String middleName = myScanner.nextLine();
        newRecord.add(middleName);

        System.out.println("Введите год рождения: ");
        String age = myScanner.nextLine();
        newRecord.add(age);

        System.out.println("Введите пол: ");
        String gender = myScanner.nextLine();
        newRecord.add(gender);

        return newRecord;
    }
}