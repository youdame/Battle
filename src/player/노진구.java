package player;

import weapon.*;

import java.util.Arrays;
import java.util.List;


public class 노진구 extends Player {

    private static List<Weapon> weaponList = Arrays.asList(new 맨손(), new 공기포(), new 빨라지는태엽(), new 투명망토(), new 빅라이트());
    

    public 노진구(){
        this("노진구", 100, 10);        
    }
    public 노진구(String name, int hp, int power){
        super(name, hp, power);
        this.imgFile = "Jin.png";

    }
    public void attack(Player target) {
        super.attack(target);
    }
    public List<Weapon> getWeaponList() {
    	return weaponList;
    }
    
    public String pickupRandomWeapon() {
        int i = (int) (Math.random() *100) % (weaponList.size() - 1);
        Weapon w = weaponList.get(i + 1);
        w.useCount = w.useCount + 1;
    	
    	return "진구가 도라에몽의 도구인 " + w.name + "을(를) 얻었습니다.\n";
    }

    public String attack(List<Player> targets) {
    	int i;
        System.out.print(this.name + " :  ");
        while (true) {
        	i = (int) (Math.random() *100) % targets.size();
        	if(targets.get(i).getHp() > 0) {
        		break;
        	}
        	else 
        		continue;
        	}
      
		return 때리기(targets.get(i));
    }

    public String 때리기(Player target){
    	Weapon w = null; 
    	
		for (int i = 1; i < weaponList.size(); i++) {
			if(weaponList.get(i).useCount != 0) {
				w = weaponList.get(i);
   				}
			}
		if (w == null) {
			w = weaponList.get(0);
		}
		
        int power = w.getPower() + this.getPower();
        target.setHp(target.getHp() - power);
        w.useCount --;
        System.out.println("[때리기] 공격력은 무기 파워 * 2 + 내 파워. 무기는 " + w.name + " total power : " + power);
        return "진구가 " + target.name + "를 " + w.name + "을(를) 이용해 공격합니다\n" + w.weaponMessage + " 공격력은 무기 파워 + 진구 파워 = " + power + "\n";
    }
		


    public void 이슬이의응원받기(){
    }


}
