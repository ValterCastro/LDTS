import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arena {

    private int height;
    private int width;
    private Hero hero;
    private List<Wall> walls;
    private List<Coin> coins;

    public Arena (int height, int width){
        this.height = height;
        this.width = width;
        Hero hero = new Hero(10, 10);
        this.hero = hero;
        this.walls = createWalls();
        this.coins = createCoins();
        System.out.println(this.coins.size());

    }

    private List<Coin> createCoins() {
        Random random = new Random();
        ArrayList<Coin> coins = new ArrayList<>();
        for (int i = 0; i < 5; i++)
            coins.add(new Coin(random.nextInt(width - 2) +
                    1, random.nextInt(height - 2) + 1));
            canDrawCoin(coins);
        return coins;

    }

    private void canDrawCoin(ArrayList<Coin> coins){
        for(Coin coin: coins){
            if(coins.)
        }
    }

    private List<Wall> createWalls() {
        List<Wall> walls = new ArrayList<>();
        for (int c = 0; c < width; c++) {
            walls.add(new Wall(c, 0));
            walls.add(new Wall(c, height - 1));
        }
        for (int r = 1; r < height - 1; r++) {
            walls.add(new Wall(0, r));
            walls.add(new Wall(width - 1, r));
        }
        return walls;
    }

    public void moveHero(Position position){
        if (canHeroMove(position))
            hero.setPosition(position);
    }

    private boolean canHeroMove(Position position) {

        for (Wall wall : walls)
            if(wall.getPosition().equals(position)) return false;
        return position.getX() > 0 &&
                position.getX() < width-1 &&
                position.getY() > 0 &&
                position.getY() < height-1;



    }

    void draw(TextGraphics graphics){
        graphics.setBackgroundColor(TextColor.Factory.fromString("#336699"));
        graphics.fillRectangle(new TerminalPosition(0, 0), new TerminalSize(height, width), ' ');
        hero.draw(graphics);
        for (Wall wall : walls)
            wall.draw(graphics);
        for (Coin coin : coins)
            coin.draw(graphics);
    }


    public Position moveUp(){
        return hero.moveUp();
    }

    public Position moveDown(){
        return hero.moveDown();
    }

    public Position moveLeft(){
        return hero.moveLeft();
    }

    public Position moveRight(){
        return hero.moveRight();
    }
}
