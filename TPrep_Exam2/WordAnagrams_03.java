package TPrep_Exam2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class WordAnagrams_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int inputN = Integer.parseInt(scanner.nextLine());

        List<String> words = new ArrayList<>();
        for (int i = 0; i < inputN; i++) {
            words.add(scanner.nextLine());
        }

        //split into separate letters
        List<String> inputList = Arrays.stream(input.split("")).collect(Collectors.toList());
        inputList = inputList.stream().sorted().collect(Collectors.toList());

        //check if word is an anagram of the input
        for (String string : words) {
            List<String> currWordList = Arrays.stream(string.split("")).collect(Collectors.toList());
            currWordList = currWordList.stream().sorted().collect(Collectors.toList());

            if (inputList.equals(currWordList)){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
