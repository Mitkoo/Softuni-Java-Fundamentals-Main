package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced_04 {

    public static void printList (Boolean printEvens, List<Integer> listNumbers){
        for (int i: listNumbers){
            if (printEvens){
                if (i % 2 == 0){
                    System.out.printf("%d ", i);
                } else {
                    System.out.printf("%d ", i);
                }
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> listNumbers = new ArrayList<>();
        listNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> commands = new ArrayList<>();

        while (scanner.hasNext()){
            String inputLine = scanner.nextLine();
            if (!inputLine.equals("end")){
                commands.add(inputLine);
            }
        }

        for (String inputLine: commands){
            List<String> inputArrLine = new ArrayList<>(Arrays.asList(inputLine.split(" ")));
            if (inputLine.contains("Contains")){
                if (listNumbers.contains(Integer.parseInt(inputArrLine.get(1)))){
                    System.out.println("Yes");
                } else {
                    System.out.println("No such number");
                }
            } else if (inputLine.contains("Print even")) {
                ListManipulationAdvanced_04.printList(true, listNumbers);
            } else if (inputLine.contains("Print odd")) {
                ListManipulationAdvanced_04.printList(false, listNumbers);
            } else if (inputLine.contains("Get sum")) {
                System.out.println(listNumbers.stream().mapToInt(Integer::intValue).sum());
            } else {
                List<Integer> listToPrint = new ArrayList<>();
                if (inputArrLine.get(1).equals(">")){
                    listToPrint = listNumbers.stream().filter(n -> n > Integer.parseInt((inputArrLine.get(2)))).collect(Collectors.toList());
                } else if (inputArrLine.get(1).equals("<")) {
                    listToPrint = listNumbers.stream().filter(n -> n < Integer.parseInt((inputArrLine.get(2)))).collect(Collectors.toList());    
                } else if (inputArrLine.get(1).equals(">=")) {
                    listToPrint = listNumbers.stream().filter(n -> n >= Integer.parseInt((inputArrLine.get(2)))).collect(Collectors.toList());
                } else if (inputArrLine.get(1).equals("<=")) {
                    listToPrint = listNumbers.stream().filter(n -> n <= Integer.parseInt((inputArrLine.get(2)))).collect(Collectors.toList());
                }

                for (int k = 0; k < listToPrint.size(); k++){
                    System.out.printf("d% ", listToPrint.get(k));
                }
            }
        }
    }
}
