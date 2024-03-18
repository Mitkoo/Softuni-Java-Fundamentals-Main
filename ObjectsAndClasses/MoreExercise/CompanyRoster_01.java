package ObjectsAndClasses.MoreExercise;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class CompanyRoster_01 {
    public class Employee {
        private String name;
        private double salary;
        private String position;
        private String department;
        private Optional<String> email;
        private Optional<Integer> age;

        public Employee(String name, double salary, String position, String department, Optional<String> email, Optional<Integer> age) {
            this.name = name;
            this.salary = salary;
            this.position = position;
            this.department = department;
            this.email = email;
            this.age = age;
        }

        public class Department {
            private Employee[] employees;

            public void addEmployee(Employee employee) {
                employees = Arrays.copyOf(employees, employees.length + 1);
                employees[employees.length - 1] = employee;
            }

            //public
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numEmployees = Integer.parseInt(scanner.nextLine());

        Employee[] employeesArr = new Employee[numEmployees];

    }
}
