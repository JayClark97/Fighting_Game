public class Main {
    public static void main (String [] args){

        Character jon = new Character("Jon");
        Swordman kate = new Swordman("Kate");
        Fighter janks = new Fighter("Janks");

        int kateAttack;
        int janksAttack;
        int kateCleave; //new attack
        int kateQuickSlash;
        int kateUltimateMove;


        /*Testing Cleave method for Swordman class. The method should remove mana from each use of the move.
         *If mana is less than the required amount for move, then use the basicAttack method instead to deal damage.
        */
//        System.out.println(janks.getHealth());
//        while(janks.getHealth() >= 0) {
//             kateCleave = kate.Cleave();
//            janks.receiveDmg(kateCleave);
//        }


        /*Testing quickSlash method for Swordman class. The method should remove mana from each use of the move.
         *If mana is less than the required amount for move, then use the basicAttack method instead to deal damage.
         */
//        System.out.println(janks.getHealth());
//        while(janks.getHealth() >= 0){
//            kateQuickSlash = kate.quickSlash();
//            janks.receiveDmg(kateQuickSlash);
//        }


        /*Testing crossSlash method for Swordman class. This method should remove mana from each use of the move.
         *If mana is less than the required amount for move, then use the basicAttack method instead to deal damage.
         */
        System.out.println(janks.getHealth());
        while(janks.getHealth() >= 0){
            kateUltimateMove = kate.crossSlash();
            janks.receiveDmg(kateUltimateMove);

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
