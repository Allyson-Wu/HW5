package widget;

import glyph.Compositor;
import command.Command;
import glyph.Glyph;

public class RedFactory extends GUIFactory {

    private RedFactory(){}

    public static RedFactory instance() {
        return new RedFactory();
    }
    
    protected Button buttonFactoryMethod(Compositor compositor, Glyph content, Command command) {
        return new RedButton(compositor, content, command);
    }

    protected Label labelFactoryMethod(Compositor compositor, Glyph content) {
        return new RedLabel(compositor, content);
    }
}
