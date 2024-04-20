import window.*;
import glyph.*;
import javax.naming.OperationNotSupportedException;
import glyph.Character;
import widget.*;
import widget.Label;
import window.ApplicationWindow;
import command.Command;
import command.DecrementFontSizeCommand;
import command.IncrementFontSizeCommand;
import command.SetFontSizeCommand;

public class Main {
    public static void main(String[] args) {
        hw4();
        //drawLexi();
        //testHW5();
    }

    
    public static void hw4() {

        Window window = new ApplicationWindow("Lexi");
        Row row1 = new Row(new SimpleCompositor(window));
        Glyph rect1 = new Rectangle(20,10);
        Glyph X = new Character('X');
        Column column1 = new Column(new SimpleCompositor(window));
        Glyph o = new Character('o');
        Glyph h = new Character('h');
        //Label label = GUIFactory.instance().createLabel(new SimpleCompositor(window));
        Glyph rect2 = new Rectangle(20,10);
        Glyph p = new Character('p');
        Glyph q = new Character('q');
        Row row2 = new Row(new SimpleCompositor(window));
        // Scroller scroller = new Scroller(new SimpleCompositor(window));
        // Border border = new Border(new SimpleCompositor(window),2);
        // Row row3 = new Row(new SimpleCompositor(window));
        // Glyph P = new Character('P');
        // Glyph Q = new Character('Q');
        // Button button = GUIFactory.instance().createButton(new SimpleCompositor(window));

        try{
            row1.insert(rect1,0);
            row1.insert(X,1);
            row1.insert(column1,2);
            column1.insert(o,0);
            column1.insert(h,1);
            // column1.insert(label,2);
            // row1.insert(rect2,3);
            // row2.insert(p,0);
            // row2.insert(q,1);
            // label.insert(row2);
            // scroller.insert(row1);
            // border.insert(scroller);
            // row3.insert(P,0);
            // row3.insert(Q,1);
            // button.insert(row3);
            // column1.insert(button,5);
    
        }catch (OperationNotSupportedException exception){
            System.out.println(exception);
        }
        window.setContents(row1);
    }

    // public static void drawLexi() {
    //     // create objects
    //     Window sw = new ApplicationWindow("Lexi");
    //     SimpleCompositor sc1 = new SimpleCompositor(sw);
    //     SimpleCompositor sc2 = new SimpleCompositor(sw);
    //     SimpleCompositor sc3 = new SimpleCompositor(sw);
    //     SimpleCompositor sc4 = new SimpleCompositor(sw);
    //     Row row1 = new Row(sc1);
    //     Column col1 = new Column(sc2);
    //     Scroller scroll1 = new Scroller(sc3);
    //     Border border1 = new Border(sc4, 2);
    //     Glyph X1 = new Character('X');
    //     Glyph O1 = new Character('O');
    //     Glyph rect1 = new Rectangle(10, 14);

    //     char[] characters = {'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'i', 'n', 's', 'i', 'd', 'e', ' ', 't', 'h', 'e', ' ', 'B', 'o', 'r', 'd', 'e', 'r'};
    //     Glyph[] glyphs = new Glyph[characters.length];

    //     for (int i = 0; i < characters.length; i++) {
    //         glyphs[i] = new Character(characters[i]);
    //     }

    //     try {
    //         for(int i = 0; i < characters.length; i++){
    //             row1.insert(glyphs[i], i); 
    //         }
    //         scroll1.insert(row1);
    //         border1.insert(scroll1);
    //         row1.insert(col1, 0);  
    //         col1.insert(rect1, 0);
    //         col1.insert(X1, 1);
    //         col1.insert(O1, 2);
    //     }
    //     catch (OperationNotSupportedException e) {
    //         System.out.println("OperationNotSupportedException caught");
    //     }
    //     sw.setContents(border1);
    // }

}