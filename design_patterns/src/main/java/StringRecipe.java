import java.util.List;

public class StringRecipe {
    List<StringTransformer> transformers;

    public StringRecipe(List<StringTransformer> trans){
        transformers = trans;
    }

    public void mix(StringDrink drink) {
        for(StringTransformer st : transformers){
            st.execute(drink);
        }
    }
}
