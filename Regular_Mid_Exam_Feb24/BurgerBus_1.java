package Regular_Mid_Exam_Feb24;

import java.util.*;

public class BurgerBus_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCities = Integer.parseInt(scanner.nextLine());
        Double totalProfit = 0.00;

        for (int i = 1; i < numCities + 1; i++){

            String city = scanner.nextLine();
            Double incomeCity = Double.parseDouble(scanner.nextLine());
            Double expensesCity = Double.parseDouble(scanner.nextLine());

            if (i % 3 == 0){
                expensesCity = expensesCity + (0.5 * expensesCity);
            } else if (i % 5 == 0) {
                Double lossToWeather = incomeCity * .1;
                incomeCity -= lossToWeather;
            }

            Double profitCity = incomeCity - expensesCity;
            totalProfit += profitCity;

            System.out.printf("\nIn %s Burger Bus earned %.2f leva.", city, profitCity);
        }

        System.out.printf("\nBurger Bus total profit: %.2f leva.", totalProfit);
    }
}

/*
package Regular_Mid_Exam_Feb24;

import java.util.*;

public class BurgerBus_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCities = Integer.parseInt(scanner.nextLine());
        Double totalProfit = 0.00;
        Double cityCounter = 0.0;

        for (int i = 1; i < numCities + 1; i++){

            String city = scanner.nextLine();
            Double incomeCity = Double.parseDouble(scanner.nextLine());
            Double expensesCity = Double.parseDouble(scanner.nextLine());

            if (i % 3 == 0){
                expensesCity = expensesCity + (0.5 * expensesCity);
            } else if (i % 5 == 0) {
                incomeCity = 0.9 * incomeCity;
            }

            Double profitCity = incomeCity - expensesCity;
            totalProfit += profitCity;

            System.out.printf("\nIn %s Burger Bus earned %.2f leva.", city, profitCity);
        }

        System.out.printf("\nBurger Bus total profit: %.2f leva.\n", totalProfit);
    }
}
 */