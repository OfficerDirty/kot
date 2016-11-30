import Control.MainController;
import View.MainFrame;

import java.awt.*;
import java.util.Collections;

/**
 * Created by Jean-Pierre on 15.11.2016.
 */
public class MainProgram {
    static java.util.List<Integer> list;
    public static void main (String[] args){
        /*EventQueue.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        MainProgram.setup();
                    }
                });*/
        list = new java.util.ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        int runs = 0;
        do{
            Collections.shuffle(list);
            System.out.println(list);
            ++runs;
        }while(!isSorted());
        System.out.println("Runs taken: "+runs);
        System.out.println(8 * 7*6*5*4*3*2);
    }

    private static boolean isSorted(){
        for(int i = 0; i < list.size(); ++i){
            if(list.get(i) != i){
                return false;
            }
        }
        return true;
    }

    private static void setup(){
        new MainController(new MainFrame("a Kot production",0,0,1000,900));
    }
}