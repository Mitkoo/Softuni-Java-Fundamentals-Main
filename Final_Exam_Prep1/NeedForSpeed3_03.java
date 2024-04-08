package Final_Exam_Prep1;
import java.util.*;
public class NeedForSpeed3_03 {

    public class Car {
        private String model;
        private int mileage;
        private int fuel;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCars = Integer.parseInt(scanner.nextLine());
        Hashtable<String, Car> carsTable = new Hashtable<>();

        for (int i = 0; i < numCars; i++) {
        String[] inLineCar = Arrays.stream(scanner.nextLine().split(" ")).toArray(String[]::new);
        //String[] thisCarData = Arrays.stream(.split(" ")).toArray(String[]::new);
        //Car currentCar = new Car();
        //carsTable.put(inLineCar[i], )
        //String[] inLineCar = scanner.nextLine().split(" ");




            // Splitting the second string by "|" and assigning
            String[] splitCarDetails = inLineCar[1].split("\\|");

        }
    }
}
