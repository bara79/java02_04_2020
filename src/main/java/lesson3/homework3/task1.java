package lesson3.homework3;

import java.util.LinkedHashMap;
import java.util.Map;

public class task1 {

    private static final String[] INPUT_DATA = {
            "вода", "линейка", "карандаш", "вода",
            "магнит", "ручка", "пион",
            "ручка", "пион", "ручка"
    };

    public static void main(String[] args) {
        Map<String, Integer> frequencyWord = new LinkedHashMap<>();
        for (String word : INPUT_DATA) {
            frequencyWord.merge(word, 1, Integer::sum);
        }
        frequencyWord.forEach((word, frequency) -> {
            System.out.println(word + ": " + frequency);
        });
    }
}
