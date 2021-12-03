import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class Game {


    boolean loop = true;
    private static Screen screen;
    private Arena arena;
    private TextGraphics graphics;

    public Game() throws IOException {
        TerminalSize terminalSize = new TerminalSize(40, 20);
        DefaultTerminalFactory terminalFactory = new
                DefaultTerminalFactory()
                .setInitialTerminalSize(terminalSize);
        Terminal terminal = terminalFactory.createTerminal();
        Screen screen1 = new TerminalScreen(terminal);

        Arena arena = new Arena(40,20);
        this.arena = arena;
        screen = screen1;

        TextGraphics graphics = screen.newTextGraphics();

        this.graphics = graphics;


    }




    void run()throws IOException{

            screen.setCursorPosition(null);   // we don't need a cursor
            screen.startScreen();             // screens must be started
            screen.doResizeIfNecessary();     // resize screen if necessary

            while(loop){
                draw();
                KeyStroke key = screen.readInput();
                processKey(key);
            }


    }

    void draw()throws IOException{
        screen.clear();
        arena.draw(screen.newTextGraphics());
        screen.refresh();
    }

    private void moveHero(Position position){
        arena.moveHero(position);
    }

    void processKey(KeyStroke key)throws IOException{
        if(key.getKeyType() == KeyType.EOF){
            loop = false;
        }
        else if (key.getKeyType() == KeyType.Character &&
                key.getCharacter() == 'q'){
            System.out.println(key.getKeyType());
            screen.close();
        }
        else {
            switch (key.getKeyType()) {
                case ArrowUp:
                    moveHero(arena.moveUp());
                case ArrowDown:
                    moveHero(arena.moveDown());
                case ArrowLeft:
                    moveHero(arena.moveLeft());
                case ArrowRight:
                    moveHero(arena.moveRight());
                    System.out.println(arena.moveUp().getX());
                    System.out.println(arena.moveUp().getY());
            }
        }
        System.out.println(key.getKeyType());



    }
}
