package Model;

/**
 * Created by gast09 on 28.11.2016.
 */
public class Card {

    private String value;
    private String sign;
    private boolean flipped = false;

    public Card(String value, String sign){
        this.value = value;
        this.sign = sign;
    }

    public String getValue(){
        return value;
    }

    public String getSign(){
        return sign;
    }

    public boolean getFlipped(){
        return flipped;
    }
}
