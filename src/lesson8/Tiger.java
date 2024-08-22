package lesson8;

/**
 * @author Buyevich_I
 */
public class Tiger extends Animal{
    @Override
    public String getVoice() {
        return "RRRRRRRRRRRRRRRRRRRRR";
    }

    @Override
    public String getReactionFood(String food) {
        if("Meat".equals(food)){
            return "I'll eat this";
        }
        return "I won't eat this";
    }
}
