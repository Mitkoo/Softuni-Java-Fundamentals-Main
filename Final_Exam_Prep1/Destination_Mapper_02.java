package Final_Exam_Prep1;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Destination_Mapper_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inLocations = scanner.nextLine();
        List<String> locationsList = new ArrayList<>();

        //[\/|=]([A-Z][a-z]{2,})[\/|=]
        Pattern pattern = Pattern.compile("[\\/|=]([A-Z][a-z]{2,})[\\/|=]");
        Matcher matcher = pattern.matcher(inLocations);

        while (matcher.find()) {
            if (!matcher.group(1).equals("Invalid")) {
                String locationMatched = matcher.group(1);
                locationsList.add(locationMatched);
            }
        }
        //calc the travel points
        int travelPoints = 0;
        for (String location : locationsList) {
            travelPoints += location.length();

        }
        System.out.println("Destinations: " + String.join(", ", locationsList));
        System.out.println("Travel Points: " + travelPoints);
    }
}
