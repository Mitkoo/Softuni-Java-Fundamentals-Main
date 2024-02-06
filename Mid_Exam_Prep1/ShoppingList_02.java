package Mid_Exam_Prep1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class ShoppingList_02 {

    public static Boolean searchListArr(String itemToSearch, ArrayList<String> arrToSearch) {
        for (String item : arrToSearch) {
            if (item.equals(itemToSearch)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> shoppingList = new ArrayList<>(Arrays.asList(scanner.nextLine().split("!")));
        ArrayList<String> commandsArr = new ArrayList<>();
        int counter = 0;
        String shoppingItem;

        while (scanner.hasNext()){
            shoppingItem = scanner.nextLine();
            if (shoppingItem.equals("Go Shopping!")) {
                break;
            } else {
                commandsArr.add(shoppingItem);
            }
        }

        for (String command : commandsArr) {
            String[] currentLineStringsArr = command.split(" ");
            if (currentLineStringsArr[0].equals("Urgent")) {
                if (!searchListArr(currentLineStringsArr[1], shoppingList)) {
                    shoppingList.add(0, currentLineStringsArr[1]);
                }
            } else if (currentLineStringsArr[0].equals("Unnecessary")) {
                if (searchListArr(currentLineStringsArr[1], shoppingList)) {
                    shoppingList.remove(currentLineStringsArr[1]);
                }
            } else if (currentLineStringsArr[0].equals("Correct")) {
                if (searchListArr(currentLineStringsArr[1], shoppingList)) {
                    int index = shoppingList.indexOf(currentLineStringsArr[1]);
                    shoppingList.set(index, currentLineStringsArr[2]);
                }
            } else if (currentLineStringsArr[0].equals("Rearrange")) {
                if (searchListArr(currentLineStringsArr[1], shoppingList)) {
                    String itemToReArrange = currentLineStringsArr[1];
                    shoppingList.remove(currentLineStringsArr[1]);
                    shoppingList.add(itemToReArrange);
                }
            }
        }

        System.out.println();
        for (int i = 0; i < shoppingList.size() - 1; i++){
            System.out.printf("%s, ", shoppingList.get(i));
        }
        System.out.printf("%s", shoppingList.get(shoppingList.size() - 1));
    }
}
