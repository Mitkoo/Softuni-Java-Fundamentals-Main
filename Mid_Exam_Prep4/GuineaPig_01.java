package Mid_Exam_Prep4;

import java.util.Scanner;

public class GuineaPig_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double qtyFoodKgOrig = Double.parseDouble(scanner.nextLine());
        double qtyFoodKg = qtyFoodKgOrig;
        double qtyHayKgOrig = scanner.nextDouble();
        double qtyCoverKg = scanner.nextDouble();
        double puppyWeightKg = scanner.nextDouble();

        double foodNeededKg = 30 * 0.3;
        double excessFood = qtyFoodKg - foodNeededKg;

        double coverNeededKg = 10 * (puppyWeightKg / 3);

        double excessCover = qtyCoverKg - coverNeededKg;

        //Hey calc loop
        double qtyHayKg = qtyHayKgOrig;
        double foodPerDay = 0.3;
        for (int i = 1; i <= 30; i++){
            qtyFoodKg -= foodPerDay;

            if (i % 2 == 0){
                double feedHay = 0.05 * qtyFoodKg;
                qtyHayKg -= feedHay;
            }
        }
        double hayNeededKg = qtyHayKgOrig - qtyHayKg;
        double excessHay = qtyHayKg;

        if (foodNeededKg > qtyFoodKgOrig){
            System.out.println("Merry must go to the pet store!");
        } else if (hayNeededKg > qtyHayKgOrig) {
            System.out.println("Merry must go to the pet store!");
        } else if (coverNeededKg > qtyCoverKg) {
            System.out.println("Merry must go to the pet store!");
        } else {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", excessFood, excessHay, excessCover);
        }
    }
}
