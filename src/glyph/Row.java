package glyph;
import java.awt.Point;
import window.Window;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;

public class Row extends Composition {

    public void setAdjustedBounds(Point cursor) {  
    }

    public void setSize(Window window) {
        int width = 0;
        int height = 0;
    
        for (Glyph child : super.getChildren()) {
            width += child.getBounds().width();
            height = Math.max(height, child.getBounds().height());
        }
    
        getBounds().setArea(width, height);
    }

    public Glyph child(int position) throws OperationNotSupportedException, IndexOutOfBoundsException {
        return super.child(position);
    }

    @Override
    public Point moveCursor(Point cursor, Glyph child) {
        int newX = child.getBounds().point().x + child.getBounds().width();
        cursor.x = newX;
        return cursor;
    }

    public Row(Compositor compositor) {
        setChildren(new ArrayList<Glyph>());
        setCompositor(compositor);
        getCompositor().setComposition(this);
    }

}