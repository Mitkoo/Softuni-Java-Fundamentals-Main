package Mid_Exam_Prep6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ManOWar_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> statusPirateShip = new ArrayList<>();
        statusPirateShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> statusWarShip = new ArrayList<>();
        statusWarShip = Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        int maxSectionHealth = Integer.parseInt(scanner.nextLine());

        String commandLine = scanner.nextLine();
        Boolean battleEnd = false;

        while (!commandLine.equals("Retire")) {

            List<String> commandLineList = Arrays.stream(commandLine.split(" ")).collect(Collectors.toList());

            if (commandLineList.get(0).equals("Fire")) {

                if (checkIndexValid(Integer.parseInt(commandLineList.get(1)), statusWarShip)) {
                    int damage = statusWarShip.get(Integer.parseInt(commandLineList.get(1))) - Integer.parseInt(commandLineList.get(2));
                    if (damage <= 0) {
                        System.out.println("You won! The enemy ship has sunken.");
                        battleEnd = true;
                        break;
                    }
                }

            } else if (commandLineList.get(0).equals("Defend")) {

                if (checkIndexValid(Integer.parseInt(commandLineList.get(1)), statusWarShip) && checkIndexValid(Integer.parseInt(commandLineList.get(2)), statusWarShip)) {
                    int damage = 0;

                    for (int i = Integer.parseInt(commandLineList.get(1)); i <= Integer.parseInt(commandLineList.get(2)); i++){

                        damage = statusPirateShip.get(i) - Integer.parseInt(commandLineList.get(3));

                        if (damage <= 0) {
                            System.out.println("You lost! The pirate ship has sunken.");
                            battleEnd = true;
                            break;
                        }
                    }


                }

            } else if (commandLineList.get(0).equals("Repair")) {

                if (checkIndexValid(Integer.parseInt(commandLineList.get(1)), statusWarShip)){
                    int sectionHealth = (int) statusPirateShip.get(Integer.parseInt(commandLineList.get(1)));
                    sectionHealth += Integer.parseInt(commandLineList.get(2));
                    if (sectionHealth > 70){
                        sectionHealth = 70;
                    }
                    statusPirateShip.set(Integer.parseInt(commandLineList.get(1)), sectionHealth);
                }

            } else if (commandLineList.get(0).equals("Status")) {
                int count = 0;

                for (int section: statusPirateShip) {
                    if (needRepair(section, maxSectionHealth)){
                        count += 1;
                    }
                }

                if (count > 0){
                    System.out.printf("\n%d sections need repair.", count);
                }
            }
            commandLine = scanner.nextLine();
        }

        if (battleEnd == false){

            int pirateShipStatus = status(statusPirateShip);
            int warShipStatus = status(statusWarShip);

            System.out.printf("Pirate ship status: %d", pirateShipStatus);
            System.out.printf("Warship status: %d", warShipStatus);
        }

    }

    private static int status(List<Integer> shipSections) {
        int status = 0;
        for (int section: shipSections) {
            status += section;
        }
        return status;
    }

    private static boolean needRepair(int section, int maxHealthCap) {
        if (section < (0.2 * maxHealthCap)){
            return true;
        } else {
            return false;
        }
    }

    private static boolean checkIndexValid ( int index, List<Integer > shipStatus) {
        if ((shipStatus.size() - 1) >= index) {
            return true;
        } else {
            return false;
        }
    }
}