package lesson15.task3;

/**
 * @author Buyevich_I
 */
public class Student {
    private String name;
    private String group;
    private int course;
    private double averageScore;

    public Student(String name, String group, int course, double averageScore){
        this.name = name;
        this.group = group;
        this.course = course;
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", averageScore=" + averageScore +
                '}';
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    public double getAverageScore() {
        return averageScore;
    }
}
