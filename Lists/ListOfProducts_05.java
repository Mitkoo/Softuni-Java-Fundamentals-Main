package Lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListOfProducts_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfProducts = scanner.nextInt();
        List<String> productsArr = new ArrayList<>();

        for (int i = 0; i < numberOfProducts; i++){
            String currentLine = scanner.nextLine();
            productsArr.add(currentLine);
        }

        Collections.sort(productsArr);

        for (int j = 0; j <= productsArr.size(); j++){
            System.out.printf("\n%d. %s", j + 1, productsArr.get(j));
        }
    }
}
