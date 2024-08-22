import lesson8.Animal;
import lesson8.Dog;
import lesson8.Rabbit;
import lesson8.Tiger;
public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                Dog.getDog(),
                new Tiger(),
                new Rabbit()
        };
        for(Animal animal: animals){
            System.out.println(animal.getVoice());
            System.out.println(animal.getReactionFood("Meat"));
            System.out.println(animal.getReactionFood("Grass"));
            System.out.println("-----------------------------------------");
        }
    }
}