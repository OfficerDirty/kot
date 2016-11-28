package Model;

/**
 * Created by gast09 on 28.11.2016.
 */
public class Card {

    private int value;
    private int sign;
    private boolean flipped = false;

    public Card(int value, int sign){
        this.value = value;
        this.sign = sign;
    }

    public int getValue(){
        return value;
    }

    public int getSign(){
        return sign;
    }

    public boolean getFlipped(){
        return flipped;
    }

    public void switchFlipped(){
        if (flipped){
            flipped = false;
        }
        if (!flipped){
            flipped = true;
        }
    }
}
