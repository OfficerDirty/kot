package Control;

/**
 * Created by Anthony & Max on 28.11.2016.
 */
import Model.*;
import View.DrawingPanel;
import View.InteractableObject;
import View.MainFrame;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;

public class CardStackHandler implements InteractableObject{

    Stack<Cards> stack1 = new Stack<Cards>();
    Stack<Cards> stack2 = new Stack<Cards>();
    MainFrame frame;

    public CardStackHandler(MainFrame frame){
        this.frame = frame;
        frame.getActiveDrawingPanel().addObject(this);
    }

    public void createCard(int i, int j,int stack){
        Cards newCard = new Cards(i,j, true);
        if (stack == 1){
            newCard.setXPos(100);
            stack1.push(newCard);
        }
        if (stack == 2){
            newCard.setXPos(600);
            newCard.switchFlipped();
            stack2.push(newCard);
        }
        //frame.getActiveDrawingPanel().addObject(newCard);
    }

    public void showCards(){
        frame.getActiveDrawingPanel().addObject(stack1.top());
        frame.getActiveDrawingPanel().addObject(stack2.top());
    }

    public void switchStack(Stack<Cards> dummy1, Stack<Cards> dummy2){
        frame.getActiveDrawingPanel().removeObject(dummy1.top());
        frame.getActiveDrawingPanel().removeObject(dummy2.top());
        if (!dummy1.isEmpty()){
            dummy1.top().switchFlipped();
            dummy2.push(dummy1.top());
            dummy1.pop();
        }
        showCards();
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
        if(!stack1.isEmpty() && MouseInfo.getPointerInfo().getLocation().getX() >= 100 && MouseInfo.getPointerInfo().getLocation().getX() <= 400 &
           MouseInfo.getPointerInfo().getLocation().getY() >= 100 && MouseInfo.getPointerInfo().getLocation().getY() <= 600){
            switchStack(stack1,stack2);
            //frame.repaint(0,0,800,800);

        }
        if(!stack2.isEmpty() && MouseInfo.getPointerInfo().getLocation().getX() >= 600 && MouseInfo.getPointerInfo().getLocation().getX() <= 900 &
           MouseInfo.getPointerInfo().getLocation().getY() >= 100 && MouseInfo.getPointerInfo().getLocation().getY() <= 600){
            switchStack(stack2,stack1);
        }
    }
}