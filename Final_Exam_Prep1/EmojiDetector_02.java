package Final_Exam_Prep1;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class EmojiDetector_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        //(?<animalName> ::[A-Z][a-z]+::)|(?<animalName1> \*\*[A-Z][a-z]+\*\*)
        String regex = "(?<animalName> ::[A-Z][a-z]+::)|(?<animalName1> \\*\\*[A-Z][a-z]+\\*\\*)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        List<String> strList = new ArrayList<>();

        while (matcher.find()){
            if (matcher.group("animalName") != null){
                strList.add(matcher.group("animalName"));
            } else if (matcher.group("animalName1") != null) {
                strList.add(matcher.group("animalName1"));
            }
        }

        //calc cool threshold //[0-9]
        String regex1 = "(?<number>[0-9])";
        pattern = Pattern.compile(regex1);
        matcher = pattern.matcher(input);
        List<Double> intList = new ArrayList<>();

        while (matcher.find()){
            intList.add(Double.parseDouble(matcher.group("number")));
        }

        double coolThreshold = intList.stream().reduce(1.0, (a, b) -> a * b);

        System.out.printf("Cool threshold: %.0f\n", coolThreshold);
        System.out.printf("%d emojis found in the text. The cool ones are:\n", strList.size());

        for (String string : strList) {
            int stringValue = 0;
            string = string.trim();
            for (int i = 0; i < string.length(); i++) {
                if (!(string.charAt(i) == '*' || string.charAt(i) == ':')){
                    stringValue += string.charAt(i);
                }
            }

            if (stringValue > coolThreshold){
                System.out.println(string);
            }
        }
    }
}
