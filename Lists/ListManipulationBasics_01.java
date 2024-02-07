package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listNumbers = new ArrayList<>();
        listNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> inputArrList = new ArrayList<>();

        while (scanner.hasNext()){
            String currentLine = scanner.nextLine();
            if (!currentLine.equals("end")){
                inputArrList.add(currentLine);
            } else {
                break;
            }
        }

        for (String command: inputArrList){
            String[] commandStrings = command.split(" ");
            if (commandStrings[0].equals("Add")){
                listNumbers.add(Integer.parseInt(commandStrings[1]));
            } else if (commandStrings[0].equals("Remove")) {
                listNumbers.remove(Integer.parseInt(commandStrings[1]));
            } else if (commandStrings[0].equals("RemoveAt")){
                listNumbers.remove(Integer.parseInt(commandStrings[1]));
            } else if (commandStrings[0].equals("Insert")){
                listNumbers.add(Integer.parseInt(commandStrings[2]), Integer.parseInt(commandStrings[1]));
            }
        }

        for (int num = 0; num < listNumbers.size(); num++){
            System.out.printf("%d ", listNumbers.get(num));
        }
    }
}
