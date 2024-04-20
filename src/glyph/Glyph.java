package glyph;

import java.awt.Point;
import javax.naming.OperationNotSupportedException;
import window.Window;
import command.Command;

// Command(223): Receiver
// ChainOfResponsibility(223): Handler
// ChainOfResponsibility(223): ConcreteHandler

public abstract class Glyph {

    private Glyph parent;
    private Bounds bounds = new Bounds(new Point(0,0), 0 ,0);  //upperLeft(x,y), width, height
    private Command command = null;

    public void setParent(Glyph glyph) {
        this.parent = glyph;
    }

    public Glyph getParent() {
        return parent;
    }

    public abstract void draw(Window window); ///
    public abstract void setPosition(int x, int y);
    public abstract Point moveCursor(Point cursor, Glyph child);
    public Bounds getBounds() { ///
        return bounds;
    }

    public void compose() {}

    public abstract void setSize(Window window);
    

    public Glyph onClick(Point point) {
        return null;
    }

    public Command getCommand() {
        return command;
    }
    
    public boolean intersects(Point point) { ///
        return bounds.point().equals(point);
    }

    public Glyph child(int position) throws OperationNotSupportedException, IndexOutOfBoundsException {
        throw new OperationNotSupportedException("This Glyph cannot have children");
    } 
    
    // The Insert operation inserts a glyph at a position specified by an integer index. p40
    public void insert(Glyph glyph, int position) throws OperationNotSupportedException, IndexOutOfBoundsException {
        throw new OperationNotSupportedException("This Glyph cannot have children");
    } 

    // The Remove operation removes a specified glyph if it is indeed a child. p40
    public void remove(Glyph glyph) throws OperationNotSupportedException, IndexOutOfBoundsException {
        throw new OperationNotSupportedException("This Glyph cannot have children");
    }
}