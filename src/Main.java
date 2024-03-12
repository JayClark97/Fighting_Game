public class Main {
    public static void main (String [] args){

        Character jon = new Character("Jon");
        Swordman kate = new Swordman("Kate");
        Fighter janks = new Fighter("Janks");

        int kateAttack;
        int janksAttack;
        int kateCleave; //new attack

        /*Testing Cleave method for Swordman class. The method should remove mana from each use of the move. */
        System.out.println(janks.getHealth());
        while(kate.getMana() >= 8) {
             kateCleave = kate.Cleave();
            janks.receiveDmg(kateCleave);
        }




        /* While loop code to test basicAttack and receiveDmg method between two characters.
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

    */

    }
}
