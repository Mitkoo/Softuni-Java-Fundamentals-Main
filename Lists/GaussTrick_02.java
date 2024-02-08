package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listNumbers = new ArrayList<>();
        listNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int halfList = listNumbers.size()/2;
        int counter = listNumbers.size() - 1;

        for (int i = 0; i < halfList; i++){
            int sum = listNumbers.get(i) + listNumbers.get(counter);
            System.out.printf("%d ", sum);
            counter--;
        }

        if (listNumbers.size()%2 > 0) {
            int middle = halfList + 1;
            System.out.print(middle);
        }
    }
}
