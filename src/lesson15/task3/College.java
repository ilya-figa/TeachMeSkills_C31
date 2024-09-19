package lesson15.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Buyevich_I
 */
public class College {
    private List<Student> studentList;

    public College() {
        studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void checkAverageScoreStudent() {
        studentList = studentList.stream().filter(student -> student.getAverageScore() >= 3)
                .peek(student -> student.setCourse(student.getCourse()+1)).collect(Collectors.toList());
    }

    public void printStudents() {
        System.out.println(studentList.stream().toList());
    }

    public void printStudents(int course) {
        System.out.println(studentList.stream().filter(student -> student.getCourse() == course).toList());
    }
}
