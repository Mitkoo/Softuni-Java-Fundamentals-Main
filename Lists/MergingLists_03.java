package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listNumbers = new ArrayList<>();
        listNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> listNumbers1 = new ArrayList<>();
        listNumbers1 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        Boolean longerList1st;

        int shorter;
        int longer;
        if (listNumbers.size() > listNumbers1.size()){
            shorter = listNumbers1.size();
            longer = listNumbers.size();
            longerList1st = true;
        } else {
            shorter = listNumbers.size();
            longer = listNumbers1.size();
            longerList1st = false;
        }

        List<Integer> combinedList = new ArrayList<>();

        for (int i = 0; i < shorter; i++){
            combinedList.add(listNumbers.get(i));
            combinedList.add(listNumbers1.get(i));
        }

        for (int j = shorter; j < longer; j++){
            if (longerList1st){
                combinedList.add(listNumbers.get(j));
            } else {
                combinedList.add(listNumbers1.get(j));
            }

        }

        for (int i = 0; i < combinedList.size(); i++){
            System.out.printf("%d ", combinedList.get(i));
        }
    }
}
