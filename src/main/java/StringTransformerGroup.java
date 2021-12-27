import java.util.List;

public class StringTransformerGroup implements StringTransformer {
    List<StringTransformer> transformers;
    public StringTransformerGroup(List<StringTransformer> transformers){
        this.transformers = transformers;
    }


    @Override
    public void execute(StringDrink drink) {
        StringRecipe s = new StringRecipe(transformers);
        s.mix(drink);
    }

    @Override
    public void undo(StringDrink drink) {

    }
}
