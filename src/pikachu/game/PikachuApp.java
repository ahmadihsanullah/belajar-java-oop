package pikachu.game;
public class PikachuApp {

    public static void main(String[] args) {
        PikachuApp app = new PikachuApp();
        app.pikachu();
    }

    public  void pikachu(){
         int pikachuHP = 100;
         int snorlaxHP = 100;

         int pikachuAttack = 25;
         int snorlaxAttack = 15;
        //giliran 1 = pikachu, giliran 2 = snorlax
        int giliran =1 ;
        while(pikachuHP > 0 && snorlaxHP > 0 ) {
            System.out.println("HP Pikachu : "+pikachuHP +  ", HP Snorlax : "+ snorlaxHP);
            if(giliran == 1){
                System.out.println("Serangan Pikachu : "+pikachuAttack +  " Poin");
                snorlaxHP -= pikachuAttack;
                giliran = 2;
            }else{
                System.out.println("Serangan Snorlax : "+snorlaxAttack +  " Poin");
                pikachuHP -= snorlaxAttack;
                giliran =1;
            }
        }
    }



}
