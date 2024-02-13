package mid_Exam_Prep2;

import java.awt.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HeartDelivery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfHearths = new ArrayList<>();
        listOfHearths = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> listOfJumps = new ArrayList<>();

        while (scanner.hasNext()){
            String currentLine = scanner.nextLine();

            if (!currentLine.equals("Love!")){
                String[] currentLineArr = Arrays.stream(scanner.nextLine().split(" ")).toArray(String[]::new);

                listOfJumps.add(Integer.parseInt((currentLineArr[1])));


            }
        }
    }
}
