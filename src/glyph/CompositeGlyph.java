package glyph;
import java.util.ArrayList;
import javax.naming.OperationNotSupportedException;
import window.Window;

public abstract class CompositeGlyph extends Glyph {  
    
    private ArrayList<Glyph> children;  

	public void insert(Glyph glyph, int position) throws OperationNotSupportedException, IndexOutOfBoundsException {
        while(position > children.size()) {
            children.add(children.size(), null);
        }
		children.add(position, glyph);
	}

	protected ArrayList<Glyph> getChildren() {  
		return children;
	}

	public void setChildren(ArrayList<Glyph> children) {  
		this.children = children;
	}

	public Glyph child(int position) throws OperationNotSupportedException, IndexOutOfBoundsException {
        if (children == null) {
            children = new ArrayList<>();
        }
        if(position >= children.size() || position < 0) {
            throw new IndexOutOfBoundsException("IndexOutOfBoundsException caught: There's no child");
        }
        return children.get(position);
    }

    public void draw(Window window) {  
        for(int i = 0; i < children.size(); i++) {
            if(children.get(i) != null) {
                children.get(i).draw(window);
            }
        }
    }
    
    public void setPosition(int x, int y) {  
        getBounds().point().setLocation(x, y);
    }
}