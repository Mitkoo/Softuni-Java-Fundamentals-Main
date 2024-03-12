package Mar_24_TReg_Exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExerciseThree {

    public class Team {
        String teamName;
        int goalsScored;
        int goalsConceded;
        int balance ;

        public Team (String name, int scored, int conceded){
            this.teamName = name;
            this.goalsConceded = conceded;
            this.balance = goalsScored - goalsConceded;
        }
    }

    public static void main(String[] args) {

        //Mini World Cup
        Scanner scanner = new Scanner(System.in);

        int numberOfTeams = Integer.parseInt(scanner.nextLine());
        String teamHighestBal = "";
        int highestBal = 0;
        int highestGoals = 0;
        String[] teamsArr = new String[numberOfTeams];
        int[] teamGoals = new int[numberOfTeams];
        int[] teamBalance = new int[numberOfTeams];
        List<String> teamsWithHighestBal = new ArrayList<>();
        List<String> teamsWithHighestGoals = new ArrayList<>();
        String teamHighestGoals = "";
        //List<Team> teamsList = new ArrayList<>();

        for (int i = 0; i < numberOfTeams; i++) {
            String[] arrStrings = Arrays.stream(scanner.nextLine().split("\\s+")).toArray(String[]::new);
            String teamName = arrStrings[0];
            int goalsScored = Integer.parseInt(arrStrings[1]);
            int goalsConceded = Integer.parseInt(arrStrings[2]);
            int goalDifference = goalsScored - goalsConceded;

            // масиви за запис
            teamsArr[i] = teamName;
            teamBalance[i] = goalDifference;
            teamGoals[i] = goalsScored;
            //Team newTeam = new Team(teamName, goalsScored, goalsConceded);
            //teamsList.add(newTeam);

            //най високите резултати
            if (goalDifference > highestBal){
                teamHighestBal = teamName;
            } else if (goalDifference == highestBal){
                teamsWithHighestBal.add(teamName);
            }

            //най много голове
            if (goalsScored >= highestGoals){
                teamsWithHighestGoals.add(teamName);
                teamHighestGoals = teamName;
            }
        }

        if (teamHighestBal.length() > 0){
            System.out.println(teamHighestGoals);
        } else {
            System.out.println(teamHighestBal);
        }


    }
}
