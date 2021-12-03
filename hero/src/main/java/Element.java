import com.googlecode.lanterna.graphics.TextGraphics;

public abstract class Element {
    private int x;
    private int y;
    public Element (int x, int y){
        this.x=x;
        this.y=y;
    }

    public abstract void draw(TextGraphics textGraphics);
}
