package TPrep_Exam1;

import java.util.Scanner;

public class PrimeTriangle_22 {
    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num == 1) return true;
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Function to generate and print the prime triangle
    static void generateTriangle(int n) {
        String sequence = "";
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                sequence += "1";
            } else {
                sequence += "0";
            }
            if (isPrime(i)) {
                System.out.println(sequence);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        generateTriangle(N);
    }
}