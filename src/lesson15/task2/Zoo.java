package lesson15.task2;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Buyevich_I
 */
public class Zoo {
    private List<Aminal> animalList;

    public Zoo(){
        animalList = new LinkedList<>();
    }

    public void addAnimal(Aminal aminal){
        animalList.add(0, aminal);
    }

    public void removeAnimal(){
        animalList.remove(animalList.size()-1);
    }

    public void printAnimal(){
        System.out.println(animalList.stream().toList());
    }
}
