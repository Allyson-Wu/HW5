package glyph;
import java.awt.Point;
import window.Window;

import javax.naming.OperationNotSupportedException;
import java.util.ArrayList;

public class Column extends Composition {

    public void setAdjustedBounds(Point cursor_pos) {  
    }

    public Glyph child(int position) throws OperationNotSupportedException, IndexOutOfBoundsException {
        return super.child(position);
    }

    public void setSize(Window window) {
        
        int width = 0;
        int height = 0;

        Glyph child = getChildren().get(0);
        try {
            for (int i = 0; ; i++) {
                int childWidth = child.getBounds().width();
                width = Math.max(width, childWidth);
                height += child.getBounds().height(); 
                child = this.child(i);
            }
        }        
        catch (Exception e) {
            getBounds().setArea(width, height);
        }
    }

    @Override
    public Point moveCursor(Point cursor_pos, Glyph child) {
        cursor_pos.y = child.getBounds().point().y + child.getBounds().height();
        return cursor_pos;
    }

    public Column(Compositor compositor) {
        setChildren(new ArrayList<Glyph>());
        setCompositor(compositor);
        getCompositor().setComposition(this);
    }

}