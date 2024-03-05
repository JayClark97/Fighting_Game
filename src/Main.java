public class Main {
    public static void main (String [] args){

        Character jon = new Character("Jon");
        Swordman kate = new Swordman("Kate");
        Fighter janks = new Fighter("Janks");

        int kateAttack;
        int janksAttack;



        while(janks.getHealth() > 0 && kate.getHealth() > 0) {

            if(kate.getHealth() > 0) {
                System.out.println(kate.getName() + " Turn");
                kateAttack = kate.basicAttack();
                if (kateAttack > 0)
                    janks.receiveDmg(kateAttack);
            }
            System.out.println("________________________");

            if(janks.getHealth() > 0) {
                System.out.println(janks.getName() + " Turn");
                janksAttack = janks.basicAttack();
                if (janksAttack > 0)
                    kate.receiveDmg(janksAttack);
            }
            System.out.println("________________________");

        }

        if(kate.getHealth() > 0){
            System.out.println(kate.getName() + " wins!");
        }else{
            System.out.println(janks.getName() + " wins!");
        }



    }
}
