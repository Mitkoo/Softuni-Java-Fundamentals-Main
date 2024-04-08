package FinalExam_Retake_1;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        String regex = "([@*])([A-Z][a-z]{2,})\\1: \\[([A-Za-z])\\]\\|\\[([A-Za-z])\\]\\|\\[([A-Za-z])\\]\\|$";
        Pattern patternMatcher = Pattern.compile(regex);

        for (int i = 0; i < number; i++) {
            String input = scanner.nextLine();
            Matcher matcher = patternMatcher.matcher(input);

            if (matcher.find()) {
                String sign = matcher.group(2);
                int match1 = matcher.group(3).charAt(0);
                int match2 = matcher.group(4).charAt(0);
                int match3 = matcher.group(5).charAt(0);
                System.out.println(sign + ": " + match1 + " " + match2 + " " + match3);
            } else {
                System.out.println("Valid message not found!");
            }
        }
    }
}
