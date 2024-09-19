import lesson15.task1.Task1;
import lesson15.task2.Aminal;
import lesson15.task2.Zoo;
import lesson15.task3.College;
import lesson15.task3.Student;

public class Main {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.setIntegerSet("1, 2, 3, 4, 4, 5");
        task1.printIntegerSet();

        Zoo zoo = new Zoo();
        zoo.addAnimal(new Aminal("1"));
        zoo.addAnimal(new Aminal("2"));
        zoo.addAnimal(new Aminal("3"));
        zoo.addAnimal(new Aminal("4"));
        zoo.printAnimal();
        zoo.removeAnimal();
        zoo.removeAnimal();
        zoo.printAnimal();

        College college = new College();
        college.addStudent(new Student("1", "1", 1, 1));
        college.addStudent(new Student("2", "3", 1, 2.9));
        college.addStudent(new Student("4", "5", 2, 3));
        college.addStudent(new Student("6", "7", 1, 4.5));
        college.addStudent(new Student("8", "9", 4, 2));
        college.addStudent(new Student("10", "11", 3, 3.1));
        college.checkAverageScoreStudent();
        college.printStudents();
        college.printStudents(2);

    }
}