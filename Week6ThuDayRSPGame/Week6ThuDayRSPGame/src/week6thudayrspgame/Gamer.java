
package week6thudayrspgame;
import java.beans.DesignMode;
import java.util.Scanner;
import java.util.Random;
enum HandSign
{
    PAPER,
    SCISSOR,
    ROCK
}
class Gamer {
    
    String name;
    HandSign sign;
    
    int numberofWins;
    
    static int numberofDraws;
    static int numberofTrials;

    Gamer(String name) {
            this.name =name;
        }

    
    void automove()
    {
    Random random = new Random();
    
    int decision =  random.nextInt(3); // 0 or 1 or 2;
    
    switch(decision)
    {
        case 0:
            this.sign = HandSign.PAPER;
            break;
        case 1: 
            this.sign = HandSign.ROCK;
            break;
        default:
            this.sign = HandSign.SCISSOR;
            break;
    }
    }
    
    
    
    void move() {
       Scanner input = new Scanner(System.in);
       
      
       boolean isInputValid=true;
       
       do
       {
        System.out.println("hi " + this.name +" please enter q:quit, p:paper, r:rock, s:scissor");
        char inChar = input.next().charAt(0);
        isInputValid=true;
        switch(inChar)
        {
            case 'q':
                GameArena.isGameOver=true;
                 break;
            case 'p':
                this.sign =HandSign.PAPER;
                break;
            case 'r':
                this.sign = HandSign.ROCK;
                break;
            case 's':
                this.sign = HandSign.SCISSOR;
                break;
            default:
                System.out.println("please enter a valid character");
                isInputValid=false;
                break;
        }
       }
       
       while(!isInputValid);
       
       
        
    }

    }
