package TPrep_Exam1;

import java.util.Arrays;
import java.util.Scanner;

public class CrookedDigits_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().replace(".","").replace("-","");
        //int N = scanner.nextInt(); --> to array instead
        int[] nArr = Arrays.stream(input.split("")).mapToInt(Integer::parseInt).toArray();
        int N = 0;

        while (N > 9 || N == 0) {
            N = Arrays.stream(nArr).sum();
            nArr = Arrays.stream(Integer.toString(N).split("")).mapToInt(Integer::parseInt).toArray();
        }
        System.out.println(N);
    }
}
