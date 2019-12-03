
import javax.xml.parsers.ParserConfigurationException;
import java.util.Scanner;

public class GameStartUp {

    private int numPlayers;
    private String[] playerNamesArr;
    private Player[] playerList;
    private Board gameBoard;

    public GameStartUp()
        throws ParserConfigurationException {
            {
                numPlayers = startGame();
                playerNamesArr = playerNames(numPlayers).clone();
                playerList = createPlayers(numPlayers, playerNamesArr).clone();
                gameBoard = new Board(numPlayers, playerList);
                Scene[] gameBoardScenes = gameBoard.giveScenes();
                for(int i=0; i<numPlayers; i++){
                    playerList[i].moveScene(gameBoardScenes[10]);
                }
            }
        }

    private int startGame(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many players: ");
        int input = sc.nextInt();

        return input;

    }

    private String[] playerNames(int numPlayers){
        Scanner sc = new Scanner(System.in);
        String[] playerNamesArr = new String[numPlayers];
        for(int i=1; i<=numPlayers; i++){
            System.out.println("Player" + i + " enter your name: ");
            String name = sc.nextLine();
            playerNamesArr[i-1]=name;
        }
        return playerNamesArr;
    }

    private Player[] createPlayers(int numPlayers, String[] playerNamesArr){
        Player[] playerList = new Player[numPlayers];
        for(int i=0; i<numPlayers; i++){
            playerList[i] = new Player(playerNamesArr[i]);
        }

        return playerList;
    }


    private void setBoard(int numPlayers, Player[] playerList){

    }



    public int getNumPlayers(){
        return numPlayers;
    }

    public String[] getPlayerNamesArr(){
        return playerNamesArr;
    }

    public Player[] getPlayerList(){
        return playerList;
    }
}
