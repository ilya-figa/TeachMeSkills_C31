import lesson_16.Tasks;
import lesson_16.TestData;

public class Main {
    public static void main(String[] args) {
        TestData.getTestListTask1().forEach(str -> System.out.println(Tasks.getWordMultipleMap(str)));
        TestData.getTestListTask2().forEach(str -> System.out.println(Tasks.getPairsMap(str)));
        TestData.getTestListTask3().forEach(str -> System.out.println(str + " " + Tasks.isBalanced(str)));
    }
}