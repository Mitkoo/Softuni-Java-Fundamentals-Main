package FinalExam1_Regular_practice;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PasswordValidator_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String pass = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        sb.append(pass);
        String commandLine = scanner.nextLine();

        while (!commandLine.equals("Complete")){
            List<String> cmdLineList = Arrays.stream(commandLine.split("\\s+")).collect(Collectors.toList());
            String cmd = cmdLineList.get(0);

            switch (cmd){
                case "Make":
                    String cmdSub = cmdLineList.get(1);
                    int index = Integer.parseInt(cmdLineList.get(2));
                    if (cmdSub.equals("Upper")) {
                        //sb.replace(index, index, )
                    }
            }

        commandLine = scanner.nextLine();
        }
    }
}
