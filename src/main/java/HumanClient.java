import java.util.ArrayList;
import java.util.List;

public class HumanClient implements Client{
    private boolean HP = false;
    OrderingStrategy strategy;
    List<StringDrink> drinks = new ArrayList<StringDrink>();
    List<StringRecipe> recipes = new ArrayList<StringRecipe>();
    public HumanClient(OrderingStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void happyHourStarted(Bar bar) {
        HP = true;

    }

    @Override
    public void happyHourEnded(Bar bar) {
        HP = false;
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if(HP) {
            strategy.happyHourStarted(bar);
            for(int i = 0; i< drinks.size(); i++)
                for(int j = 0; j < recipes.size(); j++){
                    strategy.wants(drinks.get(i),recipes.get(j),bar);
                    drinks.remove(drinks.get(i));
                    recipes.remove(recipes.get(j));
                    break;
                }
        }else{
            drinks.add(drink);
            recipes.add(recipe);
            strategy.happyHourEnded(bar);
        }
        strategy.wants(drink,recipe,bar);
    }
}
