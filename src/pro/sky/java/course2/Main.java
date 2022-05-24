package pro.sky.java.course2;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 11, 21, 22, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("one", "two", "two", "two", "two", "three", "three"));

        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        printNumbers(nums);
        printWords(words);
        System.out.println(countWords(words));

        String str = "Привет привет Лика Лика рустам";
        System.out.println(countWords(str.split(" ")));

        Map<String, Integer> x = countWords(words);
        for (Map.Entry<String, Integer> pair : x.entrySet()) {
            if (pair.getValue() > 1)
                System.out.println(pair.getValue());
        }

        System.out.println(countWords(words));
    }

    public static void printNumbers(List<Integer> nums) {
        Set<Integer> nums2 = new TreeSet<>();

        for (Integer num : nums) {
            if (num % 2 == 0) {
                nums2.add(num);
            }
        }
        System.out.println(Arrays.toString(nums2.toArray()));
    }

    public static void printWords(List<String> words) {
        Set<String> nums3 = new TreeSet<>();
        nums3.addAll(words);
        System.out.println(Arrays.toString(nums3.toArray()));
    }


    public static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> wordsMap = new HashMap<>();

        for (String word : words) {
            if (wordsMap.containsKey(word)) {
                wordsMap.put(word, wordsMap.getOrDefault(word, 1) + 1);
            } else {
                wordsMap.put(word, 1);
            }
        }
        return wordsMap;
    }


    public static Map<String, Integer> countWords(String[] words) {
        Map<String, Integer> wordsMap = new HashMap<>();

        for (String word : words) {
            if (wordsMap.containsKey(word)) {
                wordsMap.put(word, wordsMap.getOrDefault(word, 1) + 1);
            } else {
                wordsMap.put(word, 1);
            }
        }
        return wordsMap;
    }
}