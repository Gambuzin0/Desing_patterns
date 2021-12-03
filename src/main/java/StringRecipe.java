import java.util.List;

public class StringRecipe {

    private List<StringTransformer> StrTransformers;


    public StringRecipe(List<StringTransformer> strTransformers) {
        this.StrTransformers = strTransformers;
    }

    public void mix(StringDrink drink){

        for(StringTransformer step : StrTransformers){
            step.execute(drink);
        }
    }


}
