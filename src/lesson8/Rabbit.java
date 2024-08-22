package lesson8;

/**
 * @author Buyevich_I
 */
public class Rabbit extends Animal{

    public String getVoice() {
        return "FR FR FR";
    }

    @Override
    public String getReactionFood(String food) {
        if("Grass".equals(food)){
            return "I'll eat this";
        }
        return "I won't eat this";
    }
}
