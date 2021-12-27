public class SmartStrategy implements OrderingStrategy{
    private boolean HP = false;
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if(HP)
            bar.order(drink,recipe);

    }

    @Override
    public void happyHourStarted(StringBar bar) {
        HP = true;
    }

    @Override
    public void happyHourEnded(StringBar bar) {
        HP = false;
    }
}
