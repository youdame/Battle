package player.�Ǵ�;

import player.Player;

public abstract class �Ǵ� extends Player {
    
	public �Ǵ�(){
        super();
    }

    public �Ǵ�(String name, int hp, int power){
        super(name, hp, power);
        this.attack_message = "�Ǵ��� ������ �����մϴ�";
    }
   
}
