package player;

import java.util.ArrayList;
import java.util.List;

import weapon.Weapon;

public abstract class Player {
    public String name;
    private int hp;
    private int power;
    private Weapon weapon;
    private List<Weapon> weaponList = new ArrayList<Weapon>();
    public String imgFile = "no.png";
	public String attack_message;
	

    public Player() {
        this.name = "�̸�����";
        this.hp = 100;
        this.power = 10;
    }

    public Player(String name, int hp, int power) {
        this.name = name;
        this.hp = hp;
        this.power = power;
        this.attack_message = "";
    }

    public int getHp() {
        if (this.hp < 0)
            return 0;
        return this.hp;
    }

    public void setHp(int hp) {

        this.hp = hp;
    }

    public int getPower() {
        return this.power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Weapon getWeapon() {
        return this.weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }



    public void attack(Player target) {
        System.out.println(this.name + "��(��) " + target.name + "��(��) �����մϴ�.");
        if (this.weapon == null) {
            target.hp -= this.power;
        } else {
            target.hp -= this.power + this.weapon.getPower();
            System.out.println("����� " + this.weapon.name + ", power�� " + this.weapon.getPower());
        }

    }

    public String attack(List<Player> targets){
		return "";
    }

    public static void showHeader() {
        System.out.println("-----------------------------------------------------------------------------");
        System.out.printf("%20s %10s  %10s %20s %10s\n", "name", "hp", "power", "weapon", "weapon power");
        System.out.println("-----------------------------------------------------------------------------");
    }

    public String show() {
        System.out.printf("  %20s%10d%10d ", this.name, this.getHp(), this.power);
        if (this.weapon != null) {
            System.out.printf("%20s %10d \n", this.weapon.name, this.weapon.getPower());
        } else {
            System.out.println();
        }
		return "  %20s%10d%10d �̸�" + this.name + "hp" +this.getHp() + "power" + this.power;

    }


    public List<Weapon> getWeaponList() {
        return weaponList;
    }

    public void setWeaponList(List<Weapon> weaponList) {
        this.weaponList = weaponList;
    }

    public String attackMessage() {
		return attack_message;
    }
}
