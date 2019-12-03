import org.w3c.dom.Document;

import javax.xml.parsers.ParserConfigurationException;

public class Board {
    int totalDays;
    Scene[] gameBoard;

    public Board(int numbPlayers, Player[] players)
            throws ParserConfigurationException {
        {
            ParseXML prs = new ParseXML();
            Document xmlBoard;
            xmlBoard= prs.getDocFromFile("./src/board.xml");
            gameBoard = prs.readSceneData(xmlBoard);

        }
    }
    public Scene[] giveScenes(){
        return gameBoard;
    }

    public void endGame(int daynumb) {
    }

    public void endDay() {
    }

    public void changeBoard(int[][] newBoard) {
    }

    public Scene[] getGameBoard() {
        return this.gameBoard;
    }

    public void addrehers(String playername) {
    }
}
