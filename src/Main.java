import lesson10.User;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Ilya", "qwe"));
        userList.add(new User("Ilya", "Qwe"));
        userList.add(new User("ilya", "qwe"));
        userList.add(new User("Ilya", "qwe"));

        for (int i = 0; i < userList.size(); i++) {
            for (int j = i + 1; j < userList.size(); j++) {
                if (userList.get(i).equals(userList.get(j))) {
                    System.out.println(i + ".equals(" + j + ") = true");
                } else {
                    System.out.println(i + ".equals(" + j + ") = false");
                }
            }
        }

        for (User user : userList) {
            System.out.println(user.toString());
        }
    }
}