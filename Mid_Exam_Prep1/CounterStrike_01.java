package Mid_Exam_Prep1;

import java.util.Optional;
import java.util.Scanner;

public class CounterStrike_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());
        int countWonBattles = 0;
        int extraCounter = 0;
        int distance = 0;
        String nextLine = "";

        while (scanner.hasNext() && initialEnergy > 0) {

                nextLine = scanner.nextLine();
            if (nextLine.equals("End of battle")) {
                break;
            }

            if (!nextLine.equals("End of battle")) {
                distance = Integer.parseInt(nextLine);

                if (initialEnergy >= distance) {
                    initialEnergy -= distance;
                    countWonBattles += 1;
                    extraCounter += 1;

                    if (extraCounter == 3) {
                        initialEnergy += countWonBattles;
                        extraCounter = 0;
                    }
                } else {
                    System.out.printf("\nNot enough energy! Game ends with %d won battles and %d energy", countWonBattles, initialEnergy);
                    break;
                }
            }
        }
        //end of while loop

        //block for last line handle

        if (nextLine != "End of battle") {
            distance = Integer.parseInt(nextLine);

            if (initialEnergy >= distance) {
                initialEnergy -= distance;
                countWonBattles += 1;

                if (extraCounter == 3) {
                    initialEnergy += countWonBattles;
                }
                System.out.printf("\nWon battles: %d. Energy left: %d", countWonBattles, initialEnergy);
            } else {
                System.out.printf("\nNot enough energy! Game ends with %d won battles and %d energy", countWonBattles, initialEnergy);
            }

        } else {
            System.out.printf("\nWon battles: %d. Energy left: %d", countWonBattles, initialEnergy);
        }
    }
}
