package Chess.common;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Администратор on 23.03.2015.
 */
public class GameImplementation {

    public Player player1 = new Player();
    public Player player2 = new Player();
    public Scanner scanner = new Scanner(System.in);
    private boolean winner = false;
    private Fields board = new Fields();
    private static int countMove = 1;


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
            if (countMove % 2 == 1) {
                makeMove(player1);
                countMove++;
            } else {
                makeMove(player2);
                countMove++;
            }
        }
        showWinner();
    }

    private void makeMove(Player player) {
        System.out.println(player.getName() + " ходит (" + player.getColor() + ")");
        String positionFrom = scanner.next();
        String positionWhere = scanner.next();

        if(!positionFrom.equals("  ")) {
            takeAndPutFigure(positionFrom, positionWhere);
            board.findWinner();
        } else makeMove(player);

        board.showBoard();
    }

    private void takeAndPutFigure(String positionFrom, String positionWhere) {
        Value valueFr = switchMathToChessMath(positionFrom);
        Value valueWh = switchMathToChessMath(positionWhere);

        board.setPosition(valueFr.getValue1(), valueFr.getValue2(), valueWh.getValue1(), valueWh.getValue2());

    }

    private Value switchMathToChessMath(String stringValue) {
        Value value = new Value();
        String from1 = " ", from2 = " ";

        try {
        from1 = String.valueOf(stringValue.charAt(0));
        from2 = String.valueOf(stringValue.charAt(1));
        } catch (Exception e) {
            System.out.println("Введите корректный ход");
            makeMove(player1);
        }

        int fr1 = switchCharacterToDigit(from1);
        int fr2 = Integer.parseInt(from2);

        int fr22 = 7 - (fr2 - 1);

        value.setValue1(fr22);
        value.setValue2(fr1);

        return value;
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

    private void showWinner() {
        if(countMove % 2 == 1) {
            System.out.println("WINNER: " + player1.getName() + "\n Figures: " + player1.getColor());
        } else System.out.println("WINNER: " + player2.getName() + "\n Figures: " + player2.getColor());
    }

}
