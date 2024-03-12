package Mar_24_TReg_Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Developer's Vineyard
public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfColleaguesN = Integer.parseInt(scanner.nextLine());
        int lenOfVineyardM = Integer.parseInt(scanner.nextLine());
        String visualVineYard = scanner.nextLine();

        //need qty
        int wineGlassesNeeded = 0;
        double rakiaGlassesNeeded = 0;

        //min to taste qts
        wineGlassesNeeded = numberOfColleaguesN * 2;
        rakiaGlassesNeeded = numberOfColleaguesN;

        //vines in the yard
        int perfectVines = 0;
        int avgVines = 0;
        int ruinedVines = 0;

        List<String> vineYardQualityList = Arrays.stream(visualVineYard.split("")).collect(Collectors.toList());
        for (String character : vineYardQualityList) {
            if (character.equals("X")){
                perfectVines += 1;
            } else if (character.equals("x")) {
                avgVines += 1;
            } else if (character.equals("=")) {
                ruinedVines += 1;
            }
        }

        //how much we can produce of each alco type wine/rakia in bottle
        int bottleWine = perfectVines * 7;
        int bottleRakia = (int) Math.floor((avgVines * 7) / 5);

        //needed in bottles
        int wineBottlesNeeded = wineGlassesNeeded / 5;
        double rakiaBottlesNeeded = Math.ceil(rakiaGlassesNeeded / 14);
        int rakiaBNeededInt = (int) rakiaBottlesNeeded;

        //bottle balance
        int wineBottleBalance = bottleWine - wineBottlesNeeded;
        int rakiaBottleBalance = bottleRakia - rakiaBNeededInt;

        //  Yes! X bottles of wine and Y bottles of rakia remaining for the next party! or
        //  No! X more bottles of wine and Y more bottles of rakia required!
        if (wineBottlesNeeded >= bottleWine && rakiaBNeededInt >= bottleRakia){
            System.out.printf("Yes! %d bottles of wine and %d bottles of rakia remaining for the next party!", Math.abs(wineBottleBalance), Math.abs(rakiaBottleBalance));
        } else {
            System.out.printf("No! %d more bottles of wine and %d more bottles of rakia required!", Math.abs(wineBottleBalance), Math.abs(rakiaBottleBalance));
        }
    }
}
