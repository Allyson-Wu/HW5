package glyph;

import java.awt.Point;
import window.Window;

public class Character extends Glyph {
    
    private char character;

    public void setSize(Window window) {

        int w = window.charWidth(this.character);
        int h = window.charHeight(this.character);

        getBounds().setArea(w, h); 
    }

    public void draw(Window window) {
        
        int x = getBounds().point().x;
        int y = getBounds().point().y;

        window.drawCharacter(character, x, y);
    }

    public Character(char character) {
        this.character = character;
        getBounds().point().setLocation(new Point(0,0));
        getBounds().setArea(0, 0);
    }
    public void setPosition(int x, int y) {
    }
    public Point moveCursor(Point cursor, Glyph child){
        return cursor;
    }

}