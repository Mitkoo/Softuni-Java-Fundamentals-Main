package Methods_Lab;

import java.util.Scanner;

public class SignOfIntegerNumbers_01 {

    public SignOfIntegerNumbers_01 (){
    }
    public void printSign (int input){
        if (input > 0){
            System.out.printf("The number %d is positive.", input);
        } else if (input == 0) {
            System.out.print("The number 0 is zero.");
        } else {
            System.out.printf("The number %d is negative.", input);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SignOfIntegerNumbers_01 newInstance = new SignOfIntegerNumbers_01();

        newInstance.printSign(scanner.nextInt());
    }
}
