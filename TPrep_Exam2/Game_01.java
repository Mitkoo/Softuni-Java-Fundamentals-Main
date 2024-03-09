package TPrep_Exam2;
import java.util.*;
import java.util.stream.Collectors;

public class Game_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        List<Integer> list = new ArrayList<>();
        list = Arrays.stream(number.split("")).map(Integer::parseInt).collect(Collectors.toList());
        int sum = 0;

        for (int digit: list){
            if (digit <= 1){
                sum += digit;
            } else {
                sum *= digit;
            }
        }
        System.out.println(sum);
    }
}
