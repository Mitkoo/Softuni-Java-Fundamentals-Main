package TPrep_Exam1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeTriangle_02 {

    public static boolean checkIfPrime (int n) {
        if (n < 1) {
            return false;
        } else if (n == 1) {
            return true;
        }
        int nSqrd = (int) Math.sqrt(n);

        for (int i = 2; i < nSqrd; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(boolean isPrime) {
        if (isPrime) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int numPrimeNums = 0;
        List<Integer> primeList = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            if (checkIfPrime(i)){
                primeList.add(i);
            }
        }
        numPrimeNums = primeList.size();
        int counter = 1;

        for (int i = 0; i < numPrimeNums; i++){
            for (int j = 1; j <= counter; j++){
                printPrime(true);
            }
            counter++;
        }
    }
}
