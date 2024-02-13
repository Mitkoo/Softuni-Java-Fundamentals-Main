package mid_Exam_Prep2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;

public class ShootForTheWin_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listOfTargets = new ArrayList<>();
        listOfTargets = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> listOfHits = new ArrayList<>();
        while (scanner.hasNext()){
            String currentLine = scanner.nextLine();
            if (!currentLine.equals("End")){
                listOfTargets.add((Integer.parseInt(currentLine)));
            }
        }

        //shoot targets
        for (int i = 0; i < listOfHits.size(); i++){
            for (int j = 0; j < listOfTargets.size(); j++){
                if (listOfHits.get(i) >= listOfHits.get(j)){
                    listOfTargets.set(j, listOfTargets.get(j) + listOfTargets.get(i));
                } else {
                    //listOfTargets.set(j, )
                }
            }

            listOfTargets.set(listOfHits.get(i), -1);


        }
    }
}
