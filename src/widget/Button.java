package widget;

import glyph.Embellishment;
import window.Window;
import command.Command;
import glyph.*;
import java.awt.Point;

public abstract class Button extends Embellishment {
    
    Command command = null;
    
    public abstract void draw(Window window);
    public abstract void setSize(Window window);

	public Button(Glyph content, Command command) {
        super(content);
		this.command = command;
	}
    
    public Glyph Press() {
        return this;
    }

    public Glyph onClick(Point point) {
        if(intersects(point)) {
            System.out.println("hahah");
            return this;
        }
        else {
            return null;
        }
    }

    public Command getCommand() {
		return command;
	}
}
