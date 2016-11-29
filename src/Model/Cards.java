package Model;

import View.DrawingPanel;
import View.InteractableObject;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.event.MouseEvent;
import java.lang.String;

/**
 * Created by gast09 on 28.11.2016.
 */
public class Cards implements InteractableObject{

    private String value;
    private String sign;
    private boolean flipped;
    private double xPos;
    private double yPos;
    private Rectangle2D rectangle;

    public Cards(String value, String sign, double xPos, double yPos){
        this.value = value;
        this.sign = sign;
        this.xPos = xPos;
        this.yPos = yPos;
        flipped = true;
        createGraphics();
    }

    private void createGraphics(){
        rectangle = new Rectangle2D.Double(xPos,yPos,300,500);
    }


    public void draw(DrawingPanel dp, Graphics2D g2d){
        if("Heart".equals(sign) && flipped == true){
            g2d.setColor(new Color(255,0,0));
            g2d.fill(rectangle);
        }
        if("Diamond".equals(sign) && flipped == true){
            g2d.setColor(new Color(255,0,0));
            g2d.fill(rectangle);
        }
        if("Spade".equals(sign) && flipped == true){
            g2d.setColor(new Color(0,0,0));
            g2d.fill(rectangle);
        }
        if("Club".equals(sign) && flipped == true){
            g2d.setColor(new Color(0,0,0));
            g2d.fill(rectangle);
        }
        if(flipped == false){
            g2d.setColor(new Color(0,255,0));
            g2d.fill(rectangle);
        }
        g2d.setColor(new Color(0,0,0));
        g2d.draw(rectangle);
    }


    public void update(double dt){
        if(flipped){
            xPos = xPos+100*dt;
        }
    }



    public void switchFlipped(){
        if (flipped){
            flipped = false;
        }
        if (!flipped){
            flipped = true;
        }
    }

    @Override
    public void keyPressed(int key){

    }

    @Override
    public void keyReleased(int key){

    }

    @Override
    public void mouseReleased(MouseEvent e){

    }
}
