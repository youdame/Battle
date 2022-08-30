package weapon;


public abstract class Weapon {
    public String name;
    private int power;
    public int useCount = 0;
    public String weaponMessage = "���߻���";
    
    public Weapon() {
        this.name = "�Ǽ�";
        this.power = 5;
    }

    public Weapon(String name, int power) {
        this.name = name;
        this.power = power;
    }
    
    

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
       this.power = power;
    }
    
    public String weaponMessage() {
    	return weaponMessage;
    }
}
