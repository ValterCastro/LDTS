public class StringReplacer implements StringTransformer{

    private Character old;
    private Character newc;

    public StringReplacer(Character c1, Character c2){
        old = c1;
        newc = c2;
    }
    @Override
    public void execute(StringDrink drink) {
        StringBuilder sbuilder = new StringBuilder();
        for(int i = 0; i < drink.getText().length(); ++i){
            Character.toUpperCase(drink.getText().charAt(i));
            if(drink.getText().charAt(i) == old){
                sbuilder.append(newc);
            }
            else{
                sbuilder.append(drink.getText().charAt(i));
            }
        }
        drink.setText(sbuilder.toString());
    }
}
