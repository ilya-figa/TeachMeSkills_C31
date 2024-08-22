package lesson8;

/**
 * @author Buyevich_I
 */
public class Dog extends Animal{
    private static Dog dog = new Dog();

    private Dog(){
    }

    /**
     * implementation as a Singleton pattern
     * @return this.Dog
     */
    public static Dog getDog(){
        return dog;
    }

    @Override
    public String getVoice() {
        return "GAV";
    }

    @Override
    public String getReactionFood(String food) {
        return "I'll eat this";
    }
}
