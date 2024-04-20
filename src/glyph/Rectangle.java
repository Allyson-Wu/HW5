package glyph;
import window.Window;

import java.awt.Point;

public class Rectangle extends Glyph {

    private int w, h;
    public void setSize(Window window) {
        getBounds().setArea(w, h); 
    }

    public void draw(Window window) {
        
        int x = getBounds().point().x;
        int y = getBounds().point().y;
        int w = getBounds().width();
        int h = getBounds().height();

        window.drawRectangle(x, y, w, h);
        System.out.println("Rectangle draw x:"+x+" y:"+y+" w:"+w+" h:"+h);
    }

    public Rectangle(int w, int h) {
        this.w=w;
        this.h=h;
		getBounds().point().setLocation(new Point(0,0));
        getBounds().setArea(w, h);
    }
    public void setPosition(int x, int y) {
    }
    public Point moveCursor(Point cursor, Glyph child){
        return cursor;
    }
}