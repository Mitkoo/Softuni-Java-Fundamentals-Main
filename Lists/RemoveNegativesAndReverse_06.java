package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse_06 {

    public static void removeNegativeInList (ArrayList<String> listIn){

        //for (int i = 0; i < )
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> listIn = new ArrayList<>();
        listIn = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        /*
        for (int i = 0; i < listIn.size(); i++){
            if (listIn.get(i) < 0){
                listIn.remove(listIn.get(i));
            }
        }*/



        if (listIn.size() == 0){
            System.out.println("empty");
        } else {
            for (int i = listIn.size() - 1; i >= 0; i--) {
                System.out.printf("%d ", listIn.get(i));
            }
        }
    }
}
