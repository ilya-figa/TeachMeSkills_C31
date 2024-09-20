package lesson14;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private String group;
    private int course;
    private double averageScore;

    public Student(String name, String group,int course,double averageScore){
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
}
