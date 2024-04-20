package widget;

import glyph.Compositor;
import command.Command;
import glyph.Glyph;

public class GreenFactory extends GUIFactory {

    private GreenFactory(){}

    public static GreenFactory instance() {
        return new GreenFactory();
    }

    protected Button buttonFactoryMethod(Compositor compositor, Glyph content, Command command) {
        return new GreenButton(compositor, content, command);
    }

    protected Label labelFactoryMethod(Compositor compositor, Glyph content) {
        return new GreenLabel(compositor, content);
    }
}
