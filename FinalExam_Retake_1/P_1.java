package FinalExam_Retake_1;

import java.util.Scanner;
import java.util.*;
public class P_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cmd = scanner.nextLine();
        String outputStr = "";
        StringBuilder sb = new StringBuilder();

        while (!cmd.equals("End")){
            String[] arrCmds = Arrays.stream(cmd.split("\\s+")).toArray(String[]::new);
            String cmdCurrent = arrCmds[0];

            switch (cmdCurrent){
                case "Add":
                    sb.append(outputStr);
                    sb.append(arrCmds[1]);
                    outputStr = sb.toString();
                    break;
                case "Upgrade":
                    char charToReplace = arrCmds[1].charAt(0);
                    int charIndex = (int) charToReplace + 1;
                    char charToReplaceWith = (char) charIndex;
                    char[] charArray = outputStr.toCharArray();

                    for (int i = 0; i < charArray.length; i++) {
                        if (charArray[i] == charToReplace){
                            charArray[i] = charToReplaceWith;
                        }
                    }
                    outputStr= new String(charArray);
                    break;
                case "Print":
                    System.out.println(outputStr);
                    break;
                case "Index":
                    System.out.println();
                    char[] charArray1 = outputStr.toCharArray();
                    char charToCheck = arrCmds[1].charAt(0);
                    int counterFound = 0;

                    for (int i = 0; i < charArray1.length; i++) {
                        if (charArray1[i] == charToCheck){
                            System.out.print(i + " ");
                            counterFound++;
                        }
                    }

                    if (counterFound == 0){
                        System.out.println("None");
                    }
                case "Remove":
                    String subStringToRemove = arrCmds[1];
                    outputStr = outputStr.replace(subStringToRemove, "");
                    break;
            }

        cmd = scanner.nextLine();
        }
    }
}
