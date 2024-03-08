package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Students_05 {
    public class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String city;


        public void Student(String firstName, String lastName, int age, String city) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.city = city;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            List<String> studentsList = new ArrayList<>();

            String inputLine = scanner.nextLine();

            while (!inputLine.equals("end")) {
                //Student student = new Student();
                studentsList.add(inputLine);
                inputLine = scanner.nextLine();
            }

            String targetCity = scanner.nextLine();

            List<String> filteredStudents = new ArrayList<>();
            for (String student : studentsList) {
                String[] studentInfo = student.split("\\s+");
                String city = studentInfo[3];
                if (city.equals(targetCity)) {
                    filteredStudents.add(student);
                }
            }

            for (String student : filteredStudents) {
                int age = Integer.parseInt(Arrays.stream(student.split("\\s+")).toList().get(3));
                System.out.println(student + " is " + age + " years old");
            }
        }
    }
}
