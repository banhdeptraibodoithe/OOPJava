package manager_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class TestManager {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Having " + studentManager.getStudents().size() + " students");
            System.out.println("-------------Student Manager------------");
            System.out.println("|1. Add student                        |");
            System.out.println("|2. Edit student                       |");
            System.out.println("|3. Remove student                     |");
            System.out.println("|4. Find student by ID                 |");
            System.out.println("|5. Find students by approximate name  |");
            System.out.println("|6. List all student                   |");
            System.out.println("|7. Average score of class             |");
            System.out.println("|8. Student with top score             |");
            System.out.println("|0. Exit                               |");
            System.out.println("----------------------------------------");
            System.out.print("Your option: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Student student = new Student();
                    System.out.print("Input id student: ");
                    student.setId(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("Input name student: ");
                    student.setName(scanner.nextLine());
                    ArrayList<Double> scores = new ArrayList<>();
                    System.out.print("Input math score: ");
                    scores.add(scanner.nextDouble());
                    System.out.print("Input literature score: ");
                    scores.add(scanner.nextDouble());
                    System.out.print("Input english score: ");
                    scores.add(scanner.nextDouble());
                    student.setScores(scores);
                    scanner.nextLine();
                    System.out.print("Input gender student: ");
                    student.setGender(scanner.nextLine());
                    studentManager.addStudent(student);
                    break;
                case 2:
                    System.out.print("Type Id student to modify: ");
                    studentManager.editStudent(scanner.nextInt());
                    break;
                case 3:
                    System.out.print("Type Id student to remove: ");
                    studentManager.removeStudent(scanner.nextInt());
                    break;
                case 4:
                    System.out.print("Type Id student to find: ");
                    System.out.println(studentManager.findStudent(scanner.nextInt()));
                    break;
                case 5:
                    scanner.nextLine();
                    System.out.print("Type name student to find: ");
                    studentManager.findStudentByName(scanner.nextLine());
                    break;
                case 6:
                    studentManager.showAllStudent();
                    break;
                case 7:
                    System.out.println("Average score of this class: " + studentManager.averageScores());
                    break;
                case 8:
                    System.out.println("Student have top score");
                    studentManager.maxScoreStudent();
                    break;
                case 0:
                    System.out.println("Exited program");
                    System.exit(0);
                default:
                    System.out.println("Invalid command");
            }
        }
    }
}
