package week6thudayrspgame;

/**
 *
 * @author vr
 */
public class Week6ThuDayRSPGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Gamer gamer1 = new Gamer("ugur");
      Gamer gamer2 = new Gamer("PC");
      
      GameArena gArena = new GameArena(gamer1, gamer2);
      gArena.startGame();
        
    }
    
}
