package widget;

import java.awt.Point;
import glyph.Bounds;
import glyph.Compositor;
import java.util.ArrayList;
import glyph.Glyph;
import window.Window;
import command.Command;

public class RedButton extends Button {

    protected RedButton(Compositor compositor, Glyph content, Command command) {
        super(content, command);
        getBounds().setArea(0,0);
        getBounds().point().setLocation(new Point(0,0));
        setChildren(new ArrayList<Glyph>());
        setCompositor(compositor);
        getCompositor().setComposition(this);
    }

    public void draw(Window window) {
        Bounds childBounds = getChild().getBounds();
        window.drawButton( childBounds.point().x, childBounds.point().y, childBounds.width(), childBounds.height(), "red");
        getChild().draw(window);
    }

    public void setSize(Window window){}
}
