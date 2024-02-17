package Mid_Exam_Prep6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TreasureHunt_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> initialLoot = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\|")));
        List<String> commandsList = new ArrayList<>();
        List<String> currentLineList = new ArrayList<>();


        while (scanner.hasNext()){
            String currentLine = scanner.nextLine();
            if (!currentLine.equals("Yohoho!")){
                commandsList.add(currentLine);
            } else {
                break;
            }
        }

        for (String commandLine: commandsList) {
            currentLineList = Arrays.asList(commandLine.split(" "));

            if (currentLineList.get(0).equals("Loot")){
                for (int i = 1; i < currentLineList.size(); i++) {
                    if (!searchChest(currentLineList.get(i), initialLoot)){
                        initialLoot.add(0, currentLineList.get(i));
                    }
                }
            } else if (currentLineList.get(0).equals("Drop")) {
                int dropItemIndex = Integer.parseInt(currentLineList.get(1));
                if (dropItemIndex >= 0 && dropItemIndex <= initialLoot.size() - 1){
                    String dropItem = initialLoot.get(dropItemIndex);
                    initialLoot.remove(dropItemIndex);
                    initialLoot.add(dropItem);
                }

            } else if (currentLineList.get(0).equals("Steal")) {
                int sizeOfChest = initialLoot.size();
                if (Integer.parseInt(currentLineList.get(1)) <= sizeOfChest){
                    for (int i = sizeOfChest - Integer.parseInt(currentLineList.get(1)); i < sizeOfChest; i++) {
                        String item = initialLoot.get(i);
                        if (i == sizeOfChest - 1){
                            System.out.printf("%s", item);
                        } else {
                            System.out.printf("%s, ", item);
                        }
                    }
                    initialLoot = initialLoot.subList(0, sizeOfChest - Integer.parseInt(currentLineList.get(1)));
                } else {
                    for (int i = 0; i < sizeOfChest; i++) {
                        String item = initialLoot.get(i);
                        if (i == sizeOfChest - 1){
                            System.out.printf("%s", item);
                        } else {
                            System.out.printf("%s, ", item);
                        }
                    }
                    initialLoot.clear();
                }
            }
        }
        if (initialLoot.size() == 0){
            System.out.println("\nFailed treasure hunt.");
        } else {
            Double averageGain = calcPirateCredits(initialLoot);
            System.out.printf("\nAverage treasure gain: %.2f pirate credits.", averageGain);
        }
    }

    private static Double calcPirateCredits(List<String> lootedChest) {
        double itemsValueTotal = 0.00;
        for (String item: lootedChest) {
            double itemValue = item.length();
            itemsValueTotal += itemValue;
        }
        return itemsValueTotal * 1.0 / lootedChest.size();
    }

    private static boolean searchChest(String item, List<String> currentChest) {
        for (String s: currentChest) {
            if (s.equals(item)){
                return true;
            }
        }
        return false;
    }
}

