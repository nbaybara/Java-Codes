
package week6thudayrspgame;

class GameArena {


Gamer gamer1;
Gamer gamer2;
static boolean isGameOver;
    
    GameArena(Gamer gamer1, Gamer gamer2) {
        this.gamer1 = gamer1;
        this.gamer2 =gamer2;
    }

    void startGame() {
         while(Gamer.numberofTrials <100000000)
         {
          gamer1.automove(); // human
          gamer2.automove(); //AI, or PC
          StatHelper.processMoves(gamer1, gamer2);
         
         }
         StatHelper.displayMoves(gamer1, gamer2);
    }


}
