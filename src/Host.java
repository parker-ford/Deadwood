import java.util.*;
import java.io.File;

import javax.xml.parsers.*;


import org.w3c.dom.*;

public class Host {
    int[][] tempboard;
    static Player[] users;
    int daycounter;
    static int currplayer;
    static int counter = 0;
    static String [] option;
    static boolean RAGNAROC;

    public Host() {
    }

    public static void main(String[] args)
            throws ParserConfigurationException {
        {
            currplayer=0;
            RAGNAROC=true;
            GameStartUp game = new GameStartUp();
            int testNumPlayers = game.getNumPlayers();
            String[] testPlayerNames = game.getPlayerNamesArr().clone();
            users = game.getPlayerList().clone();
            while(RAGNAROC){
                option = new String[] {"move","end turn"};
                System.out.print("current options ");
                for(int i=0; i<option.length;i++){
                    System.out.print(option[i]+" ");
                }
                System.out.println("");
                System.out.println("what would you like to do?");
                Scanner sc = new Scanner(System.in);
                String input = sc.nextLine();
                for(int i=0;i<option.length;i++){
                    if(input==option[i]){
                        if(input =="move"){
                            //make move
                            option[i]=null;
                            RAGNAROC=false;
                        }
                        if(input =="end turn"){
                            nextTurn();
                            option[i] = null;
                            RAGNAROC=false;
                        }

                    }
                }

            }





        }
    }

    public int[][] getboard() {
        return this.tempboard;
    }

    public void beginDay(Player currentPlayer){

    }

    public static void nextTurn(){
        int currPlayer = getCurrentPlayer();
        System.out.println("The current player is " + users[currPlayer].getName());
        System.out.println("Money: " + users[currPlayer].getMoney());
        System.out.println("Credits: " + users[currPlayer].getCredits());
        System.out.println("Rank: " + users[currPlayer].getRank());
        System.out.println("Your location is: " + users[currPlayer].getScene().getName());
        //System.out.println("Here are your options:" + )
    }

    public static int getCurrentPlayer(){
        counter++;
        if(counter == users.length){
            counter = 0;
            return counter;
        }
        return counter;
    }



    public void upgrade(String playername) {
    }
}