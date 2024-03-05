public class Swordman extends Character{
    private String weapon;
    private int health, attackDmg; //add mana later

    public Swordman(String name) {
        super(name);
        weapon = "blunt sword";
        health = 500;
        attackDmg = 40;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackDmg() {
        return attackDmg;
    }

    public void setAttackDmg(int attackDmg) {
        this.attackDmg = attackDmg;
    }

    //Method for default attack that doesn't require mana
    public int basicAttack(){
        int chance = (int) ((Math.random() * 10) + 1); //later chance should change depending on weapon
        System.out.println(chance);
        if(chance > 3) {
            System.out.println("Deal " + getAttackDmg() + " damage!");
            return getAttackDmg();
        }
        else {
            System.out.println("Miss!");
            return 0;
        }
    }

    /*Methods for special attacks moves*/

    //Add a cleave method

    //Add a quick slash method

    //Add a ultimate attack method


    public void receiveDmg(int damage){
            health -= damage;
            System.out.println(super.getName() + " took " + damage + " damage! Remaining health " + health);
            if(health < 0){
                System.out.println("dead");
            }

    }

    @Override
    public String toString() {
        return "Swordman{" +
                "weapon='" + weapon + '\'' +
                ", health=" + health +
                ", attackDmg=" + attackDmg +
                "} " + super.toString();
    }
}
