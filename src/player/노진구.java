package player;

import weapon.*;

import java.util.Arrays;
import java.util.List;


public class ������ extends Player {

    private static List<Weapon> weaponList = Arrays.asList(new �Ǽ�(), new ������(), new ���������¿�(), new �������(), new �����Ʈ());
    

    public ������(){
        this("������", 100, 10);        
    }
    public ������(String name, int hp, int power){
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
    	
    	return "������ ���󿡸��� ������ " + w.name + "��(��) ������ϴ�.\n";
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
      
		return ������(targets.get(i));
    }

    public String ������(Player target){
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
        System.out.println("[������] ���ݷ��� ���� �Ŀ� * 2 + �� �Ŀ�. ����� " + w.name + " total power : " + power);
        return "������ " + target.name + "�� " + w.name + "��(��) �̿��� �����մϴ�\n" + w.weaponMessage + " ���ݷ��� ���� �Ŀ� + ���� �Ŀ� = " + power + "\n";
    }
		


    public void �̽����������ޱ�(){
    }


}
