package main;
import player.*;
import player.¾Ç´ç.*;
import view.Start1;
import weapon.*;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
	public static Player p;
	public static List<Player> targets;
	public static List<Weapon> weapons;
    public static void main(String [] args) {

        Player p1 = new ³ëÁø±¸("³ëÁø±¸", 600, 10);
        Player p2 = new ºñ½ÇÀÌ("ºñ½ÇÀÌ", 200, 20);
        Player p3 = new ÅüÅüÀÌ("ÅüÅüÀÌ", 250, 30);
        Player p4 = new ¿µ¹ÎÀÌ("¿µ¹ÎÀÌ", 150, 15);

        List<Player> targets = new ArrayList<Player>();
        
        targets.add(p2);
        targets.add(p3);
        targets.add(p4); 

        new Start1(p1, targets);

        
    }

    public static void consoleTest(Player p1, List<Player> targets){
        while (true) {

            if (p1.getHp() <= 0 ) {
            	
                System.out.println("target ÆÀÀÌ ÀÌ°å½À´Ï´Ù!");
                break;
            }

            boolean win = true;

            for(int i = 0; i < targets.size(); i++) {
                if(targets.get(i).getHp() > 0) {
                    win = false;
                }
            }
            if (win){
                System.out.println("Áø±¸°¡ ÀÌ°å½À´Ï´Ù!");
                break;
            }

            p1.attack(targets);

            for(int i=0; i<targets.size(); i++) {
                if(targets.get(i).getHp() > 0){
                    targets.get(i).attack(p1);
                }
            }

            p1.show();
            for(int i=0; i<targets.size();i++) {
                targets.get(i).show();
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }


    }

