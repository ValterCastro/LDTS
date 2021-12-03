public class StringDrink {

    private String name;
    public StringDrink(String string){
        name=string;
    }

    public String getText(){
        return name;
    }

    public void setText(String replace){
        name = replace;
    }
}
