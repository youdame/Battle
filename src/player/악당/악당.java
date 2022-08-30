package player.學渡;

import player.Player;

public abstract class 學渡 extends Player {
    
	public 學渡(){
        super();
    }

    public 學渡(String name, int hp, int power){
        super(name, hp, power);
        this.attack_message = "學渡檜 霞掘蒂 奢問м棲棻";
    }
   
}
