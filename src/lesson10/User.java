package lesson10;

import java.util.Objects;

/**
 * @author Buyevich_I
 */
public class User {
    private String namePC;
    private String password;

    public User(String namePC, String password){
        this.namePC = namePC;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "namePC='" + namePC + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return namePC.equals(user.namePC) && password.equals(user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namePC, password);
    }
}
