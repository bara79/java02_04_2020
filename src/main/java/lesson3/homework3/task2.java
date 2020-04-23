package lesson3.homework3;

import java.util.Set;

public class task2 {

    public static void main(String[] args) {
        BookPhone bookPhone = new BookPhone();
        bookPhone.add("Иванов", "775477");
        bookPhone.add("Петров", "55646425");
        bookPhone.add("Сидоров", "65645616");
        bookPhone.add("Иванов", "8568468");

        Set<String> allSurnames = bookPhone.getAllSurnames();
        for (String surname : allSurnames) {
            Set<String> phones = bookPhone.get(surname);
            System.out.printf("%s: %s%n", surname, phones);
        }
    }



}
