public class StringCaseChanger implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        StringBuilder sbuilder = new StringBuilder();
        for(int i = 0; i < drink.getText().length(); ++i){
            if(Character.isLowerCase(drink.getText().charAt(i))){
                sbuilder.append(Character.toUpperCase(drink.getText().charAt(i)));
            }
            else{
                sbuilder.append(Character.toLowerCase(drink.getText().charAt(i)));
            };
        }
        drink.setText(sbuilder.toString());
    }
}
