package Regular_Mid_Exam_Feb24;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CoffeeLover_2 {
    public static boolean indexIsValid(List<String> coffeeList, int index) {
        if (index >= 0 && index <= coffeeList.size() - 1) {
            return true;
        }
            return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> coffeeList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        int commands = Integer.parseInt(scanner.nextLine());

        //commands stream
        for (int i = 0; i < commands; i++){

            String line = scanner.nextLine();
            List<String> inputLine = Arrays.stream(line.split("\\s+")).collect(Collectors.toList());

            if (inputLine.get(0).equals("Include")) {
                coffeeList.add(inputLine.get(1));

            } else if (inputLine.get(0).equals("Remove")) {

                int numberOfCoffees = Integer.parseInt(inputLine.get(2));

                if (!(numberOfCoffees > coffeeList.size())) {
                    if (inputLine.get(1).equals("first")) {
                        for (int j = 0; j < numberOfCoffees; j++) {
                            coffeeList.remove(0);
                        }
                    } else {
                        for (int j = 0; j < numberOfCoffees; j++) {
                            coffeeList.remove(coffeeList.size() - 1);
                        }
                    }
                }
            } else if (inputLine.get(0).equals("Prefer")) {

                int index1 = Integer.parseInt(inputLine.get(1));
                int index2 = Integer.parseInt(inputLine.get(2));

                Boolean indexFirstCoffee = indexIsValid(coffeeList, index1);
                Boolean indexSecondCoffee = indexIsValid(coffeeList, index2);

                if (indexFirstCoffee && indexSecondCoffee){
                    String coffee1 = coffeeList.get(index1);
                    String coffee2 = coffeeList.get(index2);

                    coffeeList.set(index1, coffee2);
                    coffeeList.set(index2, coffee1);
                }
            } else if (inputLine.get(0).equals("Reverse")) {

                Collections.reverse(coffeeList);
            }
        }

        //print end list
        System.out.println("Coffees:");

        for (String coffee: coffeeList) {
            System.out.printf("%s ", coffee);
        }
    }
}
