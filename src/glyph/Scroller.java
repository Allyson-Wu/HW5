package glyph;
import java.util.ArrayList;
import window.Window;

public class Scroller extends Embellishment{
    
    public Scroller (Compositor compositor, Glyph content) {
        super(content);
        super.setChildren(new ArrayList<Glyph>());
        super.setCompositor(compositor);
        super.getCompositor().setComposition(this);
    }

    public void draw(Window window) {
        super.draw(window);
        Bounds childBounds = getChild().getBounds();
        window.addScrollBar(
            childBounds.point().x + childBounds.width()+3, 
            childBounds.point().y, 
            10, 
            childBounds.height());
    }
}
