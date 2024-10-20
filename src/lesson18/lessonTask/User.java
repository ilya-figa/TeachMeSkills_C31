package lesson18.lessonTask;

/**
 * @author Buyevich_I
 */
public class User {
    private String name;

    public User(String name){
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }
}
