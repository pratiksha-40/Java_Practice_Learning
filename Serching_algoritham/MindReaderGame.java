import java.util.Random;
import java.util.*;
class Player_A{
    int p_scr=0;
    int p_input;
    String name;
    public Player_A(String name){
        name=name;
    }
    public void PlayerDetials(String name){
        System.out.println("name of Player:"+name);
        System.out.println("Score of Player:"+p_scr);
    }
}

class Computer{
    int c_scr=0;
    int c_pred;
    public int Predication() {
        Random r=new Random();
        return r.nextInt(2);
    }
    public void PlayerDetials(String name){
        System.out.println("name of Player:"+name);
        System.out.println("Score of Player:"+p_scr);
    }
}
public class MindReaderGame {
    public static void main(String[] args) {
        Player_A P=new Player_A();
        Computer  C = new Computer();

        Scanner sc = new Scanner(System.in);
        for(;;)
        {
            System.err.println("Enter you Input:");
            P.p_input = sc.nextInt();
            System.out.println("You Entered:"+P.p_input);
            C.c_pred=C.Predication();
            System.out.println("Prediction:"+C.c_pred);
            if(P.p_input == C.c_pred){
                C.c_scr++;

            }
            else{
                P.p_scr++;
                
            }
            System.out.println("Computer Score:"+C.c_scr);
            System.out.println("Computer Score:"+P.p_scr);
            if(C.c_scr==4){
                //System.out.println("Computer is winner, Plyer wish You Luck");
                System.out.print("****************************Winner****************************");
                C.PlayerDetails();
                break;
            }
            else if(P.p_scr==4){
                    //System.out.println("Player is winner, Computer wish You Luck");
                    System.out.print("****************************Winner****************************");
                    P.PlayerDetails("katappa");
                    break;
                }
            }
        }
    }

