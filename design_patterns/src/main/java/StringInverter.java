import java.util.ArrayList;
import java.util.List;

public class StringInverter implements StringTransformer{

    @Override
    public void execute(StringDrink drink) {
        //metodo bruto
        /*
        List<Character> reverseDrink = new ArrayList<>();
        String sreverseDrink = "";
        for(int i = drink.getText().length(); i > 0 ; --i){
            reverseDrink.add(drink.getText().charAt(i-1));
        }
        for(Character c : reverseDrink){
            sreverseDrink+=c;
        }
        drink.setText(sreverseDrink);

         */

        //StringBuilder
        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append(drink.getText());
        sbuilder.reverse();
        drink.setText(sbuilder.toString());

    }
}
