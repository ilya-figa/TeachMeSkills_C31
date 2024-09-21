package lesson_16;

import java.util.ArrayList;
import java.util.List;

public class TestData {
    public static List<String[]> getTestListTask1(){
        List<String[]> list = new ArrayList<>();
        list.add(new String[]{"a", "b", "a", "c", "b"});
        list.add(new String[]{"c", "b", "a"});
        list.add(new String[]{"c", "c", "c", "c"});
        return list;
    }

    public static List<String[]> getTestListTask2(){
        List<String[]> list = new ArrayList<>();
        list.add(new String[]{"code", "bug"});
        list.add(new String[]{"man", "moon", "main"});
        list.add(new String[]{"man", "moon", "good", "ight"});
        return list;
    }

    public static List<String> getTestListTask3(){
        List<String> list = new ArrayList<>();
        list.add("{[()]}");
        list.add("([{{[(())]}}])");
        list.add("]][[");
        list.add("{[(])}");
        list.add("{{[]()}}}}");
        return list;
    }
}
