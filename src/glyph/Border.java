package glyph;
import java.util.ArrayList;

import window.Window;

public class Border extends Embellishment{

    private int thickness;

    public Border (Compositor compositor, Glyph content, int thickness) {
        super(content);
        this.thickness = thickness;
        super.setChildren(new ArrayList<Glyph>());
        super.setCompositor(compositor);
        super.getCompositor().setComposition(this);
    }

    // void addBorder(int x1, int y1, int x2, int y2, int width);
    public void draw(Window window) {
        super.draw(window);
        Bounds childBounds = getChild().getBounds();
        window.addBorder(
            childBounds.point().x, 
            childBounds.point().y , 
            childBounds.point().x + childBounds.width()+15,
            childBounds.point().y + childBounds.height(), 
            thickness);
            /*System.out.println(
                "int x1: "+childBounds.point().x+
                " int y1: "+childBounds.point().y+
                " int x2: "+(childBounds.point().x + childBounds.width())+
                " int y2: "+(childBounds.point().y + childBounds.height())+
                " thickness: "+thickness);*/
    }
}
