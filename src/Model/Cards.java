package Model;


import View.DrawingPanel;
import View.InteractableObject;

import java.awt.*;
import java.awt.event.MouseEvent;
/**
 * Created by Anthony & Max on 28.11.2016.
 */
public class Cards implements InteractableObject{

    private int value;  // 0 = Ace, 10 = Jack, 11 = Queen, 12 = King
    private int sign;  // 0 = Hearts, 1 = Diamond, 2 = Spade,3 = Club
    private double xPos;
    private double yPos = 100;
    private boolean flipped;
    private Rectangle rectangle = new Rectangle(100,100, 300,500);
    private Image cardback1 = Toolkit.getDefaultToolkit().getImage("cardback.png");
    private Image hearts = Toolkit.getDefaultToolkit().getImage("heart.png");
    private Image diamond = Toolkit.getDefaultToolkit().getImage("diamond.png");
    private Image clubs = Toolkit.getDefaultToolkit().getImage("clubs.png");
    private Image spade = Toolkit.getDefaultToolkit().getImage("spades.png");

    public Cards(int sign , int value, boolean flipped){
        this.flipped = flipped;
        this.value = value;
        this.sign = sign;
    }

    public int getSign() {
        return sign;
    }
    public int getValue(){
        return value;
    }

    @Override
    public void draw(DrawingPanel dp, Graphics2D g2d) {
        g2d.setColor(new Color(0,0,0));
        g2d.fill(rectangle);
        g2d.setColor(new Color(255,255,255));
        if (flipped == true) {
            //Draw the Sign
            if (sign == 0) {
                g2d.drawImage(hearts, 200, 325, null);
            }
            if (sign == 1) {
                g2d.drawImage(diamond, 200, 325, null);
            }
            if (sign == 2) {
                g2d.drawImage(spade, 200, 325, null);
            }
            if (sign == 3) {
                g2d.drawImage(clubs, 200, 325, null);
            }
            //Draw the Value
            if (value == 0){
                g2d.drawString("Ace", 240, 320);
            }else if (value == 10){
                g2d.drawString("Jack", 240, 320);
            }else if (value == 11){
                g2d.drawString("Queen", 240, 320);
            }else if (value == 12){
                g2d.drawString("King", 240, 320);
            }
            else{
                g2d.drawString("" +(value+1), 247, 320);
            }
        }
        g2d.drawImage(cardback1, 600, 100, null);
    }

    public void setXPos(double newPos){
        xPos = newPos;
    }

    public void switchFlipped(){
        if(flipped){
            flipped = false;
        }
        if(!flipped){
            flipped = true;
        }
    }

    @Override
    public void update(double dt) {
    }

    @Override
    public void keyPressed(int key) {

    }

    @Override
    public void keyReleased(int key) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }
}
