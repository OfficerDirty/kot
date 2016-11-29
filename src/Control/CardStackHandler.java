package Control;

/**
 * Created by gast09 on 28.11.2016.
 */
import Model.*;
import View.DrawingPanel;
import View.InteractableObject;
import View.MainFrame;

import java.awt.*;
import java.awt.event.MouseEvent;

public class CardStackHandler implements InteractableObject{

    Stack<Cards> stack1 = new Stack<Cards>();
    Stack<Cards> stack2 = new Stack<Cards>();

    public CardStackHandler(MainFrame frame){

    }

 /**   public void createCards(){
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++) {
                Cards card = new Cards(i,j);
                stack2.push(card);
            }
        }
    }**/

    public void switchStack(Stack<Cards> dummy1, Stack<Cards> dummy2){
        dummy2.top().switchFlipped();
        dummy1.push(dummy2.top());
        dummy2.pop();
    }

    @Override
    public void draw(DrawingPanel dp, Graphics2D g2d) {

    }

    @Override
    public void update(double dt){

    }
    @Override
    public void keyPressed(int key){

    }

    @Override
    public void keyReleased(int key) {

    }

    @Override
    public void mouseReleased(MouseEvent e){

    }

}
