package Chess.common;

import java.util.Scanner;

/**
 * Created by Администратор on 23.03.2015.
 */
public class GameImplementation {

    public Player player1 = new Player();
    public Player player2 = new Player();
    public Scanner scanner = new Scanner(System.in);
    private boolean winner;
    private Fields board = new Fields();

    public void start() {
        System.out.println("Введите имя первого и второго игрока: ");
        String playerName1 = scanner.next();
        String playerName2 = scanner.next();

        player1 = new Player(playerName1, "Белые");
        player2 = new Player(playerName2, "Чёрные");

        System.out.println(player1.getName() + " играет за " + player1.getColor());
        System.out.println(player2.getName() + " играет за " + player2.getColor());
        board.showBoard();
        startGamePVP();
    }

    private void startGamePVP() {
        while (!winner) {
            makeMove(player1);
            if (!winner) {
                makeMove(player2);
            } else break;
        }
    }

    private void makeMove(Player player) {
        System.out.println(player.getName() + " ходит (" + player.getColor() + ")");
        String positionFrom = scanner.next();
        String positionWhere = scanner.next();

        takeAndPutFigure(positionFrom, positionWhere);

        board.showBoard();
    }

    private void takeAndPutFigure(String positionFrom, String positionWhere) {
        String from1 = String.valueOf(positionFrom.charAt(0));
        String from2 = String.valueOf(positionFrom.charAt(1));
        String where1 = String.valueOf(positionWhere.charAt(0));
        String where2 = String.valueOf(positionWhere.charAt(1));

        int fr1 = switchCharacterToDigit(from1);
        int fr2 = Integer.parseInt(from2);
        int wh1 = switchCharacterToDigit(where1);
        int wh2 = Integer.parseInt(where2);

        board.setPosition(fr1, fr2, wh1, wh2);
    }

    private int switchCharacterToDigit(String character) {
        int digit = 0;
        if(character.equals("a")) {
            digit = 0;
        } else if(character.equals("b")) {
            digit = 1;
        } else if(character.equals("c")) {
            digit = 2;
        } else if(character.equals("d")) {
            digit = 3;
        } else if(character.equals("e")) {
            digit = 4;
        } else if(character.equals("f")) {
            digit = 5;
        } else if(character.equals("g")) {
            digit = 6;
        } else if(character.equals("h")) {
            digit = 7;
        }
        return digit;
    }

}
