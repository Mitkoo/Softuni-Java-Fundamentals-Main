package Final_Exam_Prep1;
import java.util.*;
import java.util.stream.Collectors;

public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder activationKey = new StringBuilder(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("Generate")){
            List<String> inputList = Arrays.stream(input.split(">>>")).collect(Collectors.toList());
            String command = inputList.get(0);
            int startIndex;
            int endIndex;

            switch (command) {
                case "Contains":
                    if (activationKey.toString().contains(inputList.get(1))){
                        System.out.println(activationKey + " contains " + inputList.get(1));
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String caseType = inputList.get(1);
                    startIndex = Integer.parseInt(inputList.get(2));
                    endIndex = Integer.parseInt(inputList.get(3));
                    String substring = activationKey.substring(startIndex, endIndex);
                    if (caseType.equals("Upper")) {
                        activationKey.replace(startIndex, endIndex, substring.toUpperCase());
                    } else {
                        activationKey.replace(startIndex, endIndex, substring.toLowerCase());
                    }
                    System.out.println(activationKey);
                    break;
                case "Slice":
                    startIndex = Integer.parseInt(inputList.get(1));
                    endIndex = Integer.parseInt(inputList.get(2));

                    activationKey.delete(startIndex, endIndex);
                    System.out.println(activationKey);
                    break;
            }
            input = scanner.nextLine();
        }
        //"Your activation key is: {activation key}"
        System.out.println("Your activation key is: " + activationKey);
    }
}