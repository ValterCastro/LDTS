import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;

public class Wall extends Element{
    Position position;

    public Wall(int x, int y) {
        super(x,y);
        Position position = new Position(x,y);
        this.position = position;
    }

    public void draw(TextGraphics graphics){
        //graphics.setCharacter(position.getX(), position.getX(), TextCharacter.fromCharacter('X')[0]);
        graphics.setForegroundColor(TextColor.Factory.fromString("#FFFF33"));
        graphics.enableModifiers(SGR.BOLD);
        graphics.putString(new TerminalPosition(position.getY(), position.getX()), "X");
    }

    public Position getPosition(){
        return position;
    }
}
