package lesson3.homework3;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class BookPhone {

    private final Map<String, Set<String>> phoneSurname = new TreeMap<>();

    public void add(String surname, String phoneNumber) {
        Set<String> phones = getPhones(surname);
        phones.add(phoneNumber);
    }
    private Set<String> getPhones(String surname) {
        return phoneSurname.computeIfAbsent(surname, key -> new HashSet<>());
    }
    public Set<String> get(String surname) {
        return getPhones(surname);
    }
    public Set<String> getAllSurnames() {
        return phoneSurname.keySet();
    }

}



