package Regular_Mid_Exam_Feb24;

import java.util.Scanner;
import java.util.*;
import java.util.stream.Collectors;

public class DeckOfCards_3 {
    private static boolean searchDeck(String card, List<String> listDeck) {
        for (String s: listDeck) {
            if (s.equals(card)){
                return true;
            }
        }
        return false;
    }

    public static boolean indexIsValid(List<String> deckList, int index) {
        if (index >= 0 && index <= deckList.size() - 1) {
            return true;
        }
            return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> listDeck = Arrays.stream(scanner.nextLine().split(",\\s*")).collect(Collectors.toList());
        int commandsNum = Integer.parseInt(scanner.nextLine());

        //commands stream
        for (int i = 0; i < commandsNum; i++){

            String line = scanner.nextLine();
            List<String> inputLine = Arrays.stream(line.split(",\\s*")).collect(Collectors.toList());

            //command type
            if (inputLine.get(0).equals("Add")){
                String card = inputLine.get(1);

                if (!searchDeck(card, listDeck)){
                    listDeck.add(card);
                    System.out.println("Card successfully added");
                } else {
                    System.out.println("Card is already in the deck");
                }
            } else if (inputLine.get(0).equals("Remove")) {
                String card = inputLine.get(1);

                if (searchDeck(card, listDeck)){
                    listDeck.remove(card);
                    System.out.println("Card successfully removed");
                } else {
                    System.out.println("Card not found");
                }
            } else if (inputLine.get(0).equals("Remove At")) {
                int index = Integer.parseInt(inputLine.get(1));

                if (indexIsValid(listDeck, index)){
                    listDeck.remove(index);
                    System.out.println("Card successfully removed");
                } else {
                    System.out.println("Index out of range");
                }

            } else if (inputLine.get(0).equals("Insert")) {
                int index = Integer.parseInt(inputLine.get(1));
                String card = inputLine.get(2);

                if (indexIsValid(listDeck, index) && !searchDeck(card, listDeck)){
                    listDeck.add(index, card);
                    System.out.println("Card successfully added");

                } else if (!indexIsValid(listDeck, index)) {
                    System.out.println("Index out of range");

                } else if (indexIsValid(listDeck, index) && searchDeck(card, listDeck)) {
                    System.out.println("Card is already added");

                }
            }
        }

        //print end deck
        System.out.println(String.join(", ", listDeck));
    }
}
