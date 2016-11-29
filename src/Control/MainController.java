package Control;

import View.MainFrame;
import Model.Cards;

/**
 * Created by gast09 on 28.11.2016.
 */
public class MainController {

    private MainFrame frame;

    public MainController(MainFrame frame) {
        this.frame = frame;
        CardStackHandler newStack = new CardStackHandler(frame);
        Cards newCard = new Cards("Heart", "4", 100,100);
        frame.getActiveDrawingPanel().addObject(newCard);
    }
}
