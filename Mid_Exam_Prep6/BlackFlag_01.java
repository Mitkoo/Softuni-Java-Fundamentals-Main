package Mid_Exam_Prep6;

import java.util.Scanner;

public class BlackFlag_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double daysPirating = Double.parseDouble(scanner.nextLine());
        double plunderPerDay = Double.parseDouble(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());
        double totalPlunder = 0;
        double variance = 0;

        //Calculate how much plunder the pirates manage to gather
        for (int i = 1; i <= daysPirating; i++){
            totalPlunder += plunderPerDay;

            if (i % 3 == 0){
                variance = 0.5 * plunderPerDay;
            } else if (i % 5 == 0) {
                variance = -0.3 * totalPlunder;
            }

            totalPlunder += variance;
            variance = 0;
        }

        //print
        if (totalPlunder >= expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunder);
        } else {
            double percentage = (totalPlunder / expectedPlunder * 100);
            System.out.printf("Collected only %.2f%% of the plunder.", percentage);
        }
    }
}
