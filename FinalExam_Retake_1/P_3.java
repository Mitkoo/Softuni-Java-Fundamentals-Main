package FinalExam_Retake_1;
import java.util.*;

public class P_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arrStrings = Arrays.stream(input.split("\\s+")).toArray(String[]::new);

        Map<String, Double> clients = new LinkedHashMap<>();
        Map<String, Double> distributors = new LinkedHashMap<>();
        double totalIncome = 0;

        while (!arrStrings[0].equals("End")) {

            if (arrStrings[0].equals("Deliver")) {
                double amount = Double.parseDouble(arrStrings[2]);
                if (distributors.containsKey(arrStrings[1])) {
                    distributors.put(arrStrings[1], distributors.get(arrStrings[1]) + amount);
                } else {
                    distributors.put(arrStrings[1], amount);
                }
            }
            else if (arrStrings[0].equals("Return")) {
                double amount = Double.parseDouble(arrStrings[2]);
                if (distributors.containsKey(arrStrings[1])) {
                    distributors.put(arrStrings[1], distributors.get(arrStrings[1]) - amount);
                }
            }
            else if (arrStrings[0].equals("Sell")) {
                double amount = Double.parseDouble(arrStrings[2]);
                if (clients.containsKey(arrStrings[1])) {
                    clients.put(arrStrings[1], clients.get(arrStrings[1]) + amount);
                } else {
                    clients.put(arrStrings[1], amount);
                }
                totalIncome += amount;
            }

            input = scanner.nextLine();
            arrStrings = Arrays.stream(input.split("\\s+")).toArray(String[]::new);
        }

        for (Map.Entry<String, Double> client : clients.entrySet()) {
            System.out.printf("%s: %.2f%n", client.getKey(), client.getValue());
        }
        System.out.println("-----------");

        for (Map.Entry<String, Double> distributor : distributors.entrySet()) {
            System.out.printf("%s: %.2f%n", distributor.getKey(), distributor.getValue());
        }
        System.out.println("-----------");

        System.out.printf("Total Income: %.2f%n", totalIncome);
    }
}