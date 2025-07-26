package manager_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
    private static int locationMaxScore = -1;
    private static double MaxScore;

    public static double getMaxScore() {
        return MaxScore;
    }

    public static void setMaxScore(double maxScore) {
        MaxScore = maxScore;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public static int getLocationMaxScore() {
        return locationMaxScore;
    }

    public static void setLocationMaxScore(int locationMaxScore) {
        StudentManager.locationMaxScore = locationMaxScore;
    }

    public void addStudent(Student student) {
        this.getStudents().add(student);
        double studentScore = student.averageScore();
        if (studentScore > getMaxScore()) {
            setLocationMaxScore(this.getStudents().size() - 1);
            setMaxScore(studentScore);
        }
        System.out.println("Added new student");
    }
    public void removeStudent(int id) {
        Student student = this.findStudent(id);
        if (student != null) {
            this.getStudents().remove(student);
            System.out.println("Student has been removed");
        }
    }
    public Student findStudent(int id) {
        for (int i = 0; i < this.getStudents().size(); i++) {
            if (this.getStudents().get(i).getId() == id) {
                return this.getStudents().get(i);
            }
        }
        System.out.println("Not found");
        return null;
    }
    public void editStudent(int id) {
        Scanner scanner = new Scanner(System.in);
        Student student = this.findStudent(id);
        int index = this.getStudents().indexOf(student);
        if (student == null) return;
        while (true) {
            System.out.println(student);
            System.out.println("Which field do you want to modify?");
            System.out.println("1. Changes ID");
            System.out.println("2. Changes Name");
            System.out.println("3. Changes Scores");
            System.out.println("4. Changes Gender");
            System.out.println("0. Return");
            System.out.print("Your input option: ");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Student current ID: " + student.getId());
                    System.out.print("New ID: ");
                    student.setId(scanner.nextInt());
                    this.getStudents().set(index, student);
                    System.out.println("Update successful");
                    break;
                case 2:
                    scanner.nextLine();
                    System.out.println("Student current Name: " + student.getName());
                    System.out.print("New Name: ");
                    student.setName(scanner.nextLine());
                    this.getStudents().set(index, student);
                    System.out.println("Update successful");
                    break;
                case 3:
                    System.out.println("Which score do you want to change?");
                    System.out.println("1. Math");
                    System.out.println("2. Literature");
                    System.out.println("3. English");
                    System.out.println("0. Return");
                    System.out.print("Your input option: ");
                    input = scanner.nextInt();
                    switch (input) {
                        case 1:
                            System.out.println("Current Math score: " + student.getScores().getFirst());
                            System.out.print("New Math score: ");
                            student.getScores().set(0, scanner.nextDouble());
                            this.getStudents().set(index, student);
                            System.out.println("Update successful");
                            break;
                        case 2:
                            System.out.println("Current Literature score: " + student.getScores().get(1));
                            System.out.print("New Literature score: ");
                            student.getScores().set(1, scanner.nextDouble());
                            this.getStudents().set(index, student);
                            System.out.println("Update successful");
                            break;
                        case 3:
                            System.out.println("Current English score: " + student.getScores().getLast());
                            System.out.print("New English score: ");
                            student.getScores().set(2, scanner.nextDouble());
                            this.getStudents().set(index, student);
                            System.out.println("Update successful");
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Invalid command");
                    }
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Student current Gender: " + student.getGender());
                    System.out.print("New Gender: ");
                    student.setGender(scanner.nextLine());
                    this.getStudents().set(index, student);
                    System.out.println("Update successful");
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid command");
            }
        }
    }
    public double averageScores() {
        double score = 0;
        for (Student student : this.getStudents()) {
            score += student.averageScore();
        }
        return score / this.getStudents().size();
    }
    public void maxScoreStudent() {
        if (getLocationMaxScore() >= 0)
            System.out.println(this.getStudents().get(getLocationMaxScore()));
        else System.out.println("No students yet");
        System.out.println();
    }
    public void findStudentByName(String name) {
        int count = 0;
        for (Student student : this.getStudents()) {
            if (student.getName().contains(name)) {
                System.out.println(student);
                System.out.println("----------------------------------------");
                count++;
            }
        }
        if (count == 0) System.out.println("Not found");
        System.out.println();
    }
    public void showAllStudent() {
        if (this.getStudents().isEmpty()) {
            System.out.println("No students yet");
            return;
        }
        for (Student student : this.getStudents()) {
            System.out.println(student);
            System.out.println("----------------------------------------");
            System.out.println();
        }
    }
}

