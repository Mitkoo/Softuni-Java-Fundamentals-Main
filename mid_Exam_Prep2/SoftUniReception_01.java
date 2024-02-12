package mid_Exam_Prep2;

import java.util.Scanner;

public class SoftUniReception_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeEfficiency1 = scanner.nextInt();
        int employeeEfficiency2 = scanner.nextInt();
        int employeeEfficiency3 = scanner.nextInt();
        int numberOfStudents = scanner.nextInt();

        int totalCapPerHour = employeeEfficiency1 + employeeEfficiency2 + employeeEfficiency3;

        double hoursNeededToComplete = Math.ceil((double) numberOfStudents / totalCapPerHour);

        if (hoursNeededToComplete >= 4){
            double breaks = Math.ceil(hoursNeededToComplete / 4);
            System.out.printf("Time needed: %.0fh.", hoursNeededToComplete + breaks);
        } else {
            System.out.printf("Time needed: %.0fh.", hoursNeededToComplete);
        }
    }
}
