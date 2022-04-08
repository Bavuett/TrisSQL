import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int move = 0;
        char playerID  = 'X';
        Boolean hasWon = false;

        Board board = new Board();
        Scanner input = new Scanner(System.in);
        Database db = new Database();

        db.init();

        System.out.print("Benvenuto nel gioco del Tris!\nPronto a cominciare la sfida? Premi ENTER per continuare.\n");
        input.nextLine();

        while (hasWon != true && move < 9) {
            if (playerID != 'X') {
                playerID = 'X';
            } else {
                playerID = 'O';
            }

            board.makeMove(playerID);
            hasWon = board.checkIfWon();
            
            move++;
        }

        if (hasWon == true) {
            System.out.println("Congratulazioni Giocatore " + playerID + ", hai vinto! \nRiavvia il gioco per ricominciare la sfida. Premi ENTER per chiudere.");
        } else {
            System.out.println("Pareggio! \nRiavvia il gioco per ricominciare la sfida. Premi ENTER per chiudere.");
        }

        input.nextLine();
        input.close();
    }
}
