package manager_arraylist;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private ArrayList<Double> scores = new ArrayList<>();
    private String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getScores() {
        return scores;
    }

    public void setScores(ArrayList<Double> scores) {
        this.scores = scores;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public double averageScore() {
        double scores = 0;
        for (int i = 0; i < this.getScores().size(); i++) {
            scores += this.getScores().get(i);
        }
        return scores / this.getScores().size();
    }
    public String toString () {
        return "Student information: \n"
                + "ID: " + this.getId() + "\n"
                + "Name: " + this.getName() + "\n"
                + "Score: Math: " + this.getScores().getFirst()
                    + ", Literature: " + this.getScores().get(1)
                    + ", English: " + this.getScores().getLast() + "\n"
                + "Gender: " + this.getGender() + "\n"
                + "Average Score: " + this.averageScore();
    }
}
