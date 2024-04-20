package glyph;
import java.awt.Point;

import javax.naming.OperationNotSupportedException;
import window.Window;

public class Embellishment extends Composition{

    public Embellishment(Glyph contents) {
		super();
	}
    
    public Glyph getChild() {
        return getChildren().get(0);
    }

    public void setSize(Window window) {
        getChildren().get(0).setSize(window);
    }

    public void setAdjustedBounds(Point cursor) {
        getBounds().setArea(getChildren().get(0).getBounds().width(), getChildren().get(0).getBounds().height());
        getBounds().point().setLocation(getChild().getBounds().point().getLocation());
    }

    public Point moveCursor(Point cursor, Glyph child) {
        return cursor;
    }

    public void insert(Glyph glyph) throws OperationNotSupportedException, IndexOutOfBoundsException {

        if (getChildren().size() == 0) {
            this.setParent(glyph.getParent());
            getChildren().add(glyph);
            glyph.setParent(this);
        }
    }
    
    public void remove(Glyph glyph) throws OperationNotSupportedException, IndexOutOfBoundsException {
        getChildren().get(0).remove(glyph);
    }
}
