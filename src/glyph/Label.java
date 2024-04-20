package glyph;
import window.Window;

public abstract class Label extends Embellishment {
    public abstract void draw(Window window);
    public abstract void setSize(Window window);

    public Label(Glyph content) {
        super(content);
    }
}