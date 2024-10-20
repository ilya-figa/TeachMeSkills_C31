package lesson18.lessonTask;

/**
 * @author Buyevich_I
 */
public class Developer {
    private int id;
    private String name;

    public Developer(int id, String name){
        this.setId(id);
        this.setName(name);
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
