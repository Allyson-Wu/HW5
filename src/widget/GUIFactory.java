package widget;
import glyph.Compositor;
import glyph.Glyph;
import command.Command;

public abstract class GUIFactory {

    private static GUIFactory singleton = null;
    protected abstract Button buttonFactoryMethod(Compositor compositor, Glyph content, Command command);
    protected abstract Label labelFactoryMethod(Compositor compositor, Glyph content);

    public static GUIFactory instance()
    {
        if (singleton == null) {
            String s=System.getenv("LexiWidget");
            //System.out.println("LexiWidget environment variable value: " + s);
            if (s == null) s = "Green";
            if (s!=null && s.equals("Green")) singleton = GreenFactory.instance();
            else if (s!=null && s.equals("Red")) singleton = RedFactory.instance();
        }
        return singleton;
    }

    public final Button createButton(Compositor compositor, Glyph content, Command command) {
        return buttonFactoryMethod(compositor, content, command);
    }

    public final Label createLabel(Compositor compositor, Glyph content) {
        return labelFactoryMethod(compositor, content);
    }

}