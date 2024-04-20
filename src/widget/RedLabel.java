package widget;

import java.awt.Point;
import glyph.Bounds;
import glyph.Compositor;
import java.util.ArrayList;
import glyph.Glyph;
import window.Window;

public class RedLabel extends Label {
    
    protected RedLabel(Compositor compositor, Glyph content) {
        super(content);
        getBounds().setArea(0,0);
        getBounds().point().setLocation(new Point(0,0));
        setChildren(new ArrayList<Glyph>());
        setCompositor(compositor);
        getCompositor().setComposition(this);
    }

    public void draw(Window window) {
        getChild().draw(window);
        Bounds childBounds = getChild().getBounds();
        window.drawLabel(childBounds.point().x, childBounds.point().y, childBounds.width(), childBounds.height(),"red");
    }

    public void setSize(Window window){}
}
