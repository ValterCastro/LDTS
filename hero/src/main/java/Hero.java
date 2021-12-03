import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;

import java.awt.*;
import java.io.IOException;

public class Hero extends Element{

    private Position position;

    public Hero(int x, int y){
        super(x,y);
        Position position = new Position(x,y);
        this.position = position;
    }


    public Position moveUp(){
        return new Position(position.getX()-1, position.getY());
    }

    public Position moveDown(){
        return new Position(position.getX()+1, position.getY());
    }

    public Position moveLeft(){
        return new Position(position.getX(), position.getY()-1);
    }

    public Position moveRight(){
        return new Position(position.getX(), position.getY()+1);
    }

    public void setPosition(Position position){
        this.position.setY(position.getY());
        this.position.setX(position.getX());
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
